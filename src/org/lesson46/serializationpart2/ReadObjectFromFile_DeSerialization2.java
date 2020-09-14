package org.lesson46.serializationpart2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectFromFile_DeSerialization2 {
    public static void main(String[] args) {
        try {
            //Зададим путь к фйлу из которого будем читать Объекты
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);


            //считать из файла Объекты массива people
            //ois.readObject() возврвщает оббъект класса Object
            //чтобы возвращать объект класса Person нужно провести Downcasting до класса Person. Вот такая запись (Person[]) ois.readObject();
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            //Закрыть входной поток данных (InputStream)
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
            System.out.println("Class \"org.lesson46.serializationpart2.Person\" is not exist...");
        }
    }
}

package org.lesson46.serializationpart2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectFromFile_DeSerialization {
    public static void main(String[] args) {
        try {
            //Зададим путь к фйлу из которого будем читать Объекты
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);


            //Считываем число количества объектов, которое мы ожидаем получить
            int personCount = ois.readInt();

            //people - массив из объктов класса Person
            //personCount - длина массива
            Person[] people = new Person[personCount];

            //цикл будет запускаться personCount-раз
            for (int i = 0; i < personCount; i++) {

                //в цикле мы считываем объекты из ObjectInputStream
                //записывает считанные объекты в массив people
                //ois.readObject() возврвщает оббъект класса Object
                //чтобы возвращать объект класса Person нужно провести Downcasting до класса Person. Вот такая запись (Person) ois.readObject();
                people[i] = (Person) ois.readObject();

            }

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

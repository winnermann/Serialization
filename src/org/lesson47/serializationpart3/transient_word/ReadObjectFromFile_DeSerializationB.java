package org.lesson47.serializationpart3.transient_word;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile_DeSerializationB {
    public static void main(String[] args) {
        try {
            //Зададим путь к фйлу из которого будем читать Объекты
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //считать из файла Объект person1
            //ois.readObject() возврвщает оббъект класса Object
            //чтобы возвращать объект класса Person нужно провести Downcasting до класса Person. Вот такая запись (Person) ois.readObject();
            PersonB personB1 = (PersonB) ois.readObject();
            //считать из файла Объект person2
            PersonB personB2 = (PersonB) ois.readObject();

            System.out.println(personB1);
            System.out.println(personB2);

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
            System.out.println("Class \"org.lesson47.serializationpart3.transient_word.PersonB\" is not exist...");
        }
    }
}

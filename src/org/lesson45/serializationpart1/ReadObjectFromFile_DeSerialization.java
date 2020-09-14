package org.lesson45.serializationpart1;

import java.io.*;

//в классе ReadObjectFromFile_DeSerialization мы считываем объекты из файла "people.bin"
// этот процесс называется Десериализацией
public class ReadObjectFromFile_DeSerialization {
    public static void main(String[] args) {
        try {
            //Зададим путь к фйлу из которого будем читать Объекты
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //считать из файла Объект person1
            //ois.readObject() возврвщает оббъект класса Object
            //чтобы возвращать объект класса Person нужно провести Downcasting до класса Person. Вот такая запись (Person) ois.readObject();
            Person person1 = (Person) ois.readObject();
            //считать из файла Объект person2
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
            System.out.println("Class \"org.lesson45.serializationpart1.Person\" is not exist...");
        }

    }
}

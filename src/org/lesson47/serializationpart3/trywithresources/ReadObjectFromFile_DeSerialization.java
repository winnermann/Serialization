package org.lesson47.serializationpart3.trywithresources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile_DeSerialization {
    public static void main(String[] args) {
        //Зададим путь к фйлу из которого будем читать Объекты
        //Создали объект класса ObjectInputStream, поставили ему в конструктор FileInputStream и получили объект ois
        //Этот синтаксис try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) называется Try With Resources
        //try() - Try With Resources
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {

            //считать из файла Объект person1
            //ois.readObject() возврвщает оббъект класса Object
            //чтобы возвращать объект класса Person нужно провести Downcasting до класса Person. Вот такая запись (Person) ois.readObject();
            Person person1 = (Person) ois.readObject();
            //считать из файла Объект person2
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

            //При такой записи try(){} - закрытие потока не требуется
            //ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
            System.out.println("Class \"org.lesson47.serializationpart3.trywithresources.Person\" is not exist...");
        }
    }
}

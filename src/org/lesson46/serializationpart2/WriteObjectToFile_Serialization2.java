package org.lesson46.serializationpart2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile_Serialization2 {
    public static void main(String[] args) {
        //people - это массив объектов класса Person
        //Поля (id=1, name="Bob") или аргументы в объекте  new Person(1, "Bob"); заданы конструктором
        //Поля (id=2, name="Mike") или аргументы в объекте  new Person(2, "Mike"); заданы конструктором
        //Поля (id=3, name="Tom") или аргументы в объекте  new Person(2, "Mike"); заданы конструктором
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            //Зададим путь к фйлу
            //класс FileOutputStream предназначен для записи последовательности байтов в файл (Объект, звук, картинка...)
            FileOutputStream fos = new FileOutputStream("people.bin");
            //класс ObjectOutputStream предназначен для записи объектов файла (fos)
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Запишем объект (массив people), состоящий из объектов класса Person
            //Запишет один объект - массив
            oos.writeObject(people);

            //Закрыть выходной поток данных (OutputStream)
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
        }
    }
}

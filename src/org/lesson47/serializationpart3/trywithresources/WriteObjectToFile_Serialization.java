package org.lesson47.serializationpart3.trywithresources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile_Serialization {
    public static void main(String[] args) {
        //Поля (id=1, name="Bob") или аргументы в объекте  new Person(1, "Bob"); заданы конструктором
        Person person1 = new Person(1, "Bob");
        //Поля (id=2, name="Mike") или аргументы в объекте  new Person(2, "Mike"); заданы конструктором
        Person person2 = new Person(2, "Mike");

        //Зададим путь к фйлу
        //класс FileOutputStream предназначен для записи последовательности байтов в файл (Объект, звук, картинка...)
        //класс ObjectOutputStream предназначен для записи объектов файла (fos)
        //Этот синтаксис try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) называется Try With Resources
        //try() - Try With Resources
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            //Записать в файл Объект person1
            oos.writeObject(person1);
            //Записать в файл Объект person2
            oos.writeObject(person2);

            //Закрыть выходной поток данных (OutputStream)
            //oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
        }
    }
}

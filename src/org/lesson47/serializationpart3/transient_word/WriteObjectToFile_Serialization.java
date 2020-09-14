package org.lesson47.serializationpart3.transient_word;

//import org.lesson45.serializationpart1.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile_Serialization {
    public static void main(String[] args) {
        //Поля (id=1, name="Bob") или аргументы в объекте  new Person(1, "Bob"); заданы конструктором
        Person person1 = new Person(1, "Bob");
        //Поля (id=2, name="Mike") или аргументы в объекте  new Person(2, "Mike"); заданы конструктором
        Person person2 = new Person(2, "Mike");

        try {
            //Зададим путь к фйлу
            //класс FileOutputStream предназначен для записи последовательности байтов в файл (Объект, звук, картинка...)
            FileOutputStream fos = new FileOutputStream("people.bin");
            //класс ObjectOutputStream предназначен для записи объектов файла (fos)
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Записать в файл Объект person1
            oos.writeObject(person1);
            //Записать в файл Объект person2
            oos.writeObject(person2);

            //Закрыть выходной поток данных (OutputStream)
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
        }

    }
}

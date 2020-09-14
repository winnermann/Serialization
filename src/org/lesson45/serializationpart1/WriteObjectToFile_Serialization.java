package org.lesson45.serializationpart1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//В классе WriteObjectToFile_Serialization мы записываем объекты во внешний файл "people.bin"
// этот процесс называется Сериализацией
//Сериализация нужна, когда требуется сохранить объекты для последующего использования
//Если не делать сериализацию, то объекты сохраняются в оперативной памяти на время исполнения программы, а потом удаляются,
// при сериализации объекты сохраняются на жесткий диск и там хранятся
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

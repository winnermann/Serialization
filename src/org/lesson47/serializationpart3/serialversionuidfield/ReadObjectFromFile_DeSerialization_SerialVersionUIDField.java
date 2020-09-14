package org.lesson47.serializationpart3.serialversionuidfield;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile_DeSerialization_SerialVersionUIDField {
    public static void main(String[] args) {
        try {
            //Зададим путь к фйлу из которого будем читать Объекты
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //считать из файла Объект person_SerialVersionUIDField1
            //ois.readObject() возврвщает оббъект класса Object
            //чтобы возвращать объект класса Person нужно провести Downcasting до класса Person. Вот такая запись (Person_SerialVersionUIDField) ois.readObject();
            Person_SerialVersionUIDField person_SerialVersionUIDField1 = (Person_SerialVersionUIDField) ois.readObject();
            //считать из файла Объект person_SerialVersionUIDField2
            Person_SerialVersionUIDField person_SerialVersionUIDField2 = (Person_SerialVersionUIDField) ois.readObject();

            System.out.println(person_SerialVersionUIDField1);
            System.out.println(person_SerialVersionUIDField2);

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("File \"people.bin\" is not exist...");
            System.out.println("Class \"org.lesson47.serializationpart3.serialversionuidfield.Person_SerialVersionUIDField\" is not exist...");
        }
    }
}

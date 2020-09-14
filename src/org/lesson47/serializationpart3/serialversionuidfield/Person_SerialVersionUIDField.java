package org.lesson47.serializationpart3.serialversionuidfield;

import java.io.Serializable;

public class Person_SerialVersionUIDField implements Serializable {

    //Чтобы добавить поле serialVersionUID нужно включть настройку в меню
    //File _> Settings _> Editors _> Inspections _> Java _> Serialization Issues _> Serializable class Without serialVersionUID
    //затем навести курсор на класс Person_SerialVersionUIDField и выбрать Add serialVersionUID field
    //поле serialVersionUID нужно для того, чтобы помечать состояние класса
    private static final long serialVersionUID = -2989777722634152197L;

    private int id;
    private String personName;
    private int age;
    private byte type;

    //Конструктор который назначает поля (int id, String name) объектам класса Person
    public Person_SerialVersionUIDField(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    //Getter поля id
    public int getId() {
        return id;
    }

    //Getter поля name
    public String getName() {
        return personName;
    }

    //переопределим метод toString()
    public String toString(){

        //метод toString() будет возвращать строковое представление Объекта в виде id и имени
        return id + " : " + personName;
    }
}

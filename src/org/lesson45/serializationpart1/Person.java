package org.lesson45.serializationpart1;

import java.io.Serializable;

//implements Serializable в названии класса Person означает разрешение для Java
// сериализовывать (сохранить в файл) объекты класса Person
public class Person implements Serializable {
    private int id;
    private String name;

    //Конструктор который назначает поля (int id, String name) объектам класса Person
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getter поля id
    public int getId() {
        return id;
    }

    //Getter поля name
    public String getName() {
        return name;
    }

    //переопределим метод toString()
    public String toString(){

        //метод toString() будет возвращать строковое представление Объекта в виде id и имени
        return id + " : " + name;
    }
}

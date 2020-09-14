package org.lesson47.serializationpart3.transient_word;

import java.io.Serializable;

public class PersonB implements Serializable {

    //Слово transient означает, что мы не хотим сериализовывать поле int id;
    //теперь примитивный тип int будет хранить 0 (ноль)
    private transient int id;

    private String name;

    //Конструктор который назначает поля (int id, String name) объектам класса Person
    public PersonB(int id, String name) {
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

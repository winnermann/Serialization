//https://www.youtube.com/watch?v=nr4_JRKCGBU&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=48
package org.lesson47.serializationpart3.transient_word;

import java.io.Serializable;

//implements Serializable в названии класса Person означает разрешение для Java
// сериализовывать (сохранить в файл) объекты класса Person
public class Person implements Serializable {
    private int id;

    //Слово transient означает, что мы не хотим сериализовывать поле name
    //теперь ссылочный тип String будет ссылаться на null
    private transient String name;

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

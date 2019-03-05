package com.code.pattern.prototype;

import java.io.*;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sheep sheep1=new Sheep("多利1",new Date(13243543643L));
        System.out.println(sheep1);
        System.out.println(sheep1.getBirthday());

        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(sheep1);
        byte[] bytes=bos.toByteArray();


        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream ois= new ObjectInputStream(bis);
        Sheep sheep2=(Sheep)ois.readObject();
        System.out.println(sheep2);
        System.out.println(sheep2.getBirthday());


        sheep1.setBirthday(new Date(32543253461L));
        System.out.println(sheep2);
        System.out.println(sheep1.getBirthday());
        System.out.println(sheep2.getBirthday());


    }
}

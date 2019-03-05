package com.code.pattern.composite.example;

public class Client {
    public static void main(String[] args){
        AbstractFile f1,f2,f3,f5,f6;
        Folder f4=new Folder("我的收藏");
        f1=new ImageFile("1.jpb");
        f2=new TextFile("1.txt");
        f3=new VideoFile("1.avi");

        f4.add(f1);
        f4.add(f2);
        f4.add(f3);

        Folder f41=new Folder("我的视频");
        f5= new VideoFile("笑傲江湖.avi");
        f6=new VideoFile("神雕侠侣.avi");
        f41.add(f5);
        f41.add(f6);

        f4.add(f41);

        f4.killVirus();
    }
}

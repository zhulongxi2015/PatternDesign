package com.code.pattern.composite.example;

import java.util.ArrayList;
import java.util.List;

///////////抽象组件
public interface AbstractFile {
    void killVirus();
}
////////////////叶子组件
class ImageFile implements AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件 "+name+" 查杀");
    }
}
class TextFile implements AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本文件 "+name+" 查杀");
    }
}
class VideoFile implements AbstractFile{
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频文件 "+name+" 查杀");
    }
}



//////////////////容器组件
interface Composite extends AbstractFile{
    void add(AbstractFile abstractFile);
    void remove(AbstractFile abstractFile);
    AbstractFile getChild(int index);
}

class Folder implements Composite{
    private String name;
    //定义容器，用来存放叶子组件
    private List<AbstractFile> list=new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int index) {
        return list.get(index);
    }
    //杀毒操作
    @Override
    public void killVirus() {
        System.out.println("文件夹 "+name +" 查杀");

        for (AbstractFile sf:list){
            sf.killVirus();//递归
        }
    }
}
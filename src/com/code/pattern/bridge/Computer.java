package com.code.pattern.bridge;

public class Computer {
    protected Brand brand;
    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}
class DesktopComputer extends  Computer{
    public DesktopComputer(Brand b){
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("台式机");
    }
}

class LaptopComputer extends  Computer{
    public LaptopComputer(Brand b){
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("笔记本");
    }
}

class IpadComputer extends  Computer{
    public IpadComputer(Brand b){
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("平板");
    }
}
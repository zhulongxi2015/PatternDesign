package com.code.pattern.mediator;

public class Client {
    public static void main(String[] args){
        Mediator mediator =new President();

        Department market =new Market(mediator);
        Department finacial=new Finacial(mediator);
        Department development=new Development(mediator);

        market.selfAction();
        market.outAction();
    }
}

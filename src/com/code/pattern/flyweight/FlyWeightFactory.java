package com.code.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class FlyWeightFactory {
    private static Map<String ,FlyWeight> map=new HashMap<>();
    public static FlyWeight getFlyWeight(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else{
            FlyWeight flyWeight = new ConcreteFlyWeight(color);
            map.put(color,flyWeight);
            return flyWeight;
        }
    }
}

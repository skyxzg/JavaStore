package com.taobao.yiwei.designpattern.strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }
}

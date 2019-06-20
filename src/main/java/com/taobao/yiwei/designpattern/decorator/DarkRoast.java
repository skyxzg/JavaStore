package com.taobao.yiwei.designpattern.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

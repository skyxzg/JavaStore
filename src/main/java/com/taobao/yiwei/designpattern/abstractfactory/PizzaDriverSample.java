package com.taobao.yiwei.designpattern.abstractfactory;

/**
 * 抽象工厂模式
 * 提供一个接口，用于创建相关或者依赖对象的家族，而不需要明确指定具体类
 */
public class PizzaDriverSample {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyStyleCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(nyStyleCheesePizza);
        Pizza nyStyleClamPizza = nyPizzaStore.orderPizza("clam");
        System.out.println(nyStyleClamPizza);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoStyleCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(chicagoStyleCheesePizza);
        Pizza chicagoStyleClamPizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println(chicagoStyleClamPizza);
    }
}

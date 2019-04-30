package com.csri.decorate;

import com.csri.decorate.coffee.DarkRoast;
import com.csri.decorate.condiment.Milk;
import com.csri.decorate.condiment.Mocha;

/**
 * Created with IntelliJ IDEA.
 * User: wutianxiong
 * Date: 2019/4/30
 * Time: 14:41
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
    }
}

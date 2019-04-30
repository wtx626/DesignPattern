package com.csri.decorate.condiment;

import com.csri.decorate.Beverage;
import com.csri.decorate.CondimentDecorator;

/**
 * Created with IntelliJ IDEA.
 * User: wutianxiong
 * Date: 2019/4/30
 * Time: 14:46
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ".Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }
}

package com.csri.decorate.condiment;

import com.csri.decorate.Beverage;
import com.csri.decorate.CondimentDecorator;

/**
 * Created with IntelliJ IDEA.
 * User: wutianxiong
 * Date: 2019/4/30
 * Time: 14:37
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ".Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}

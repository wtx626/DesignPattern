package com.csri.decorate.coffee;

import com.csri.decorate.Beverage;

/**
 * Created with IntelliJ IDEA.
 * User: wutianxiong
 * Date: 2019/4/30
 * Time: 14:45
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.98;
    }
}

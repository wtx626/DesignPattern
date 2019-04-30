package com.csri.decorate.coffee;

import com.csri.decorate.Beverage;

/**
 * Created with IntelliJ IDEA.
 * User: wutianxiong
 * Date: 2019/4/30
 * Time: 14:35
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

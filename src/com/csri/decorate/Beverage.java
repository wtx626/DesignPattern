package com.csri.decorate;

/**
 * Created with IntelliJ IDEA.
 * User: wutianxiong
 * Date: 2019/4/30
 * Time: 14:30
 */
public abstract class Beverage {
    public String description = "unknow beverage";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

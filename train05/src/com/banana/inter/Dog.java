package com.banana.inter;

/**
 * Created by guodont on 15/12/18.
 */
public class Dog implements Animal,Animal2 {
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void walk() {
        System.out.println("吃饭");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void climb() {

    }
}

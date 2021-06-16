package com.company;


class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford is startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford is accelerate()";
    }

    @Override
    public String brake() {
        return "Ford is brake()";
    }
}












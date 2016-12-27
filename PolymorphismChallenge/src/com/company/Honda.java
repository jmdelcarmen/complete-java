package com.company;


class Honda extends Car {//============CAR CLASS

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda -> Start engine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> Accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}














package com.domain;

import com.domain.classes.Animal;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setWeight(10);
        System.out.println(animal.weight);
    }
}
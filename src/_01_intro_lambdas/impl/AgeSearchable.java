package _01_intro_lambdas.impl;


import _01_intro_lambdas.model.Cat;

public class AgeSearchable implements Searchable<Integer> {

    @Override
    public boolean test(Cat cat, Integer value) {
        return cat.getAge() == value;
    }


}

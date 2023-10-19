package _01_intro_lambdas.impl;

import _01_intro_lambdas.model.Cat;

public interface Searchable<T> {
    boolean test(Cat cat, Integer value);
}

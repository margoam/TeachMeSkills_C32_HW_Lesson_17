package com.teachmeskills.hw.lesson_17.task1.util;

@FunctionalInterface
public interface Transformer<T> {

    T doOperation(T obj);
}

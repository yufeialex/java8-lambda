package com.insightfullogic.java8.examples.chapter2;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class YufeiNote2 {
    // lambda表达式的几种形式
    Runnable noArguments = () -> System.out.println("Hello Wordl");
    ActionListener oneArguments = event -> System.out.println("button clicked");
    Runnable multiStatement = () -> {
        System.out.println("Hello");
        System.out.println("World");
    };
    BinaryOperator<Long> add = (x, y) -> x + y;
    BinaryOperator<Long> addExplict = (Long x, Long y) -> x + y;
}

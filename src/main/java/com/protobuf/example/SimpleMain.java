package com.protobuf.example;


import example.simple.Simple.SimpleMessage;

import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("hello world!");
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setId(42).setIsSimple(true).setName("My Simple Message Name");
        builder.addAllSampleList(Arrays.asList(1,2,3));
        System.out.println(builder.toString());

        SimpleMessage message = builder.build();
        message.getId();
        message.getName();
        message.getIsSimple();

    }
}

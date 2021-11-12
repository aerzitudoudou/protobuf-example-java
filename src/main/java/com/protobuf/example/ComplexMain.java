package com.protobuf.example;

import example.complex.Complex.*;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("complex example");

        DummyMessage oneDummy = newDummyMessage(55, "one dummy message");
        ComplexMessage.Builder builder = ComplexMessage.newBuilder();
        builder.setOneDummy(oneDummy);

        builder.addAllMultipleDummy(Arrays.asList(
                newDummyMessage(66, "second dummy message"),
                newDummyMessage(77, "third dummy message")));

        ComplexMessage message = builder.build();
        System.out.println(message.toString());

    }

    public static DummyMessage newDummyMessage(Integer id, String name){
        DummyMessage.Builder dummyMessageBuilder = DummyMessage.newBuilder();
        DummyMessage message = dummyMessageBuilder.setName(name)
                .setId(id)
                .build();
        return message;
    }
}

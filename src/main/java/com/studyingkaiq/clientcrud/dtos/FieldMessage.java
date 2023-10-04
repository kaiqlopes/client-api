package com.studyingkaiq.clientcrud.dtos;

public class FieldMessage {

    String name;
    String message;

    public FieldMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}

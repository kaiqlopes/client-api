package com.studyingkaiq.clientcrud.services.exceptions;

import javax.xml.crypto.Data;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}

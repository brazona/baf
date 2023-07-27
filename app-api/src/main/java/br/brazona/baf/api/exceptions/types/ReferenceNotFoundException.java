package br.brazona.baf.api.exceptions.types;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ReferenceNotFoundException extends RuntimeException {

    public ReferenceNotFoundException(String message) {
        super(message);
    }
}
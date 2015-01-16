package Bibl;

import Bibl.ResourceException;

public class ResourceException extends Exception {
    
    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }
    public ResourceException(String message) {
        super(message);
    }
    public ResourceException(Throwable cause) {
        super(cause);
    }
}
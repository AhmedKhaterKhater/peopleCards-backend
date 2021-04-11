package tech.getarray.employeemanager.exception;

public class UserNotFoundException extends  RuntimeException{

    public UserNotFoundException(String messege) {
        super(messege);
    }
}

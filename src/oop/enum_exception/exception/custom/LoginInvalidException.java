package oop.enum_exception.exception.custom;

public class LoginInvalidException extends RuntimeException {

    private String inputAccount;

    public LoginInvalidException(String message, String inputAccount) {
        super(message);
        this.inputAccount = inputAccount;
    }

    public String getInputAccount() {
        return inputAccount;
    }
}

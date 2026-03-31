package core.basesyntax;

public class PasswordValidator {
    private boolean isPasswordValid;
    private boolean isLengthValid;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        isPasswordValid = password.equals(repeatPassword);
        isLengthValid = password.length() >= 10 && repeatPassword.length() >= 10;
        //return (isPasswordValid && isLengthValid) ? true : false;
    }
}

package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        boolean result = false;
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Invalid password");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}

package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("1@qwe", "01234567890111","0123456789011");
        User user2 = new User("2@qwe", "01234567890","01234567890");
        UserService userService = new UserService();
        userService.registerUser(user1);
        userService.registerUser(user2);

    }
}

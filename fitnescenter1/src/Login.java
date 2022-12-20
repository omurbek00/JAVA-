import java.util.List;
import java.util.Scanner;

public class Login {
    public static User login( List<User> users) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please type your login & password: ");
            System.out.print("login: ");
            String login = sc.next();

            System.out.print("password: ");
            String password = sc.next();

            for (User user : users) {
                if (  user.username.equals(login) && user.password.equals(password)) {
                    System.out.println("successfully logged in");
                    return user;
                }
            }

            System.out.println("Sorry, login or password mismatched.");
            System.out.print("Do you want to continue: y/n ");
            String ex = sc.nextLine();
            if (ex.equals("n") || ex.equals("no")) {
                return null;
            }
        }
    }
}
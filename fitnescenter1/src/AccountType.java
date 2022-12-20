import java.io.IOException;
import java.util.Scanner;

public class AccountType {
    public static String choose() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("To run the program, please choose your account type:");
        System.out.println("1 - Director");
        System.out.println("2 - Manager");
        System.out.println("3 - Personal");
        System.out.println("4 - Client");
        String role = null;
        while (role == null) {
            System.out.print("Choose an account type: ");
            String choose = sc.nextLine();
            if (choose.equalsIgnoreCase("DIRECTOR") || choose.equals("1")) {
                role = "DIRECTOR";
            } else if (choose.equalsIgnoreCase("MANAGER") || choose.equals("2")) {
                role = "MANAGER";
            } else if (choose.equalsIgnoreCase("PERSONAL") || choose.equals("3")) {
                role = "PERSONAL";
            } else if (choose.equalsIgnoreCase("CLIENT") || choose.equals("4")) {
                role = "CLIENT";
            } else {
                System.out.println("Sorry, we could not find such an account type or you mistyped.");
                System.out.print("Do you want to continue: y/n ");
                String ex = sc.nextLine();
                if (ex.equals("n") || ex.equals("no")) {
                    sc.close();
                    return null;
                }
            }
        }
        sc.close();
        return role;
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        List<User> users = new ArrayList<>();
        User admin = new User();
        admin.name = "omur";
        admin.username = "admin";
        admin.password = "admin";
        admin.role = "DIRECTOR";
        users.add(admin);


        System.out.println("Welcome to 1Fit Center");
        while (true) {

            User user = Login.login( users);
            if ( user == null ) {
                break;
            }

            System.out.println("Welcome "+user.name);
            Action.selectMenu(user, users);
        }
    }


}
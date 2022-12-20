import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void listOfProcedures() throws IOException {
        String file = "src/files/listofprocedures.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void searchClients(List<User> users) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter username to search: ");
        String username = scanner.next();
        for(User user:users){
            if (user.username.equals(username))
            {
                user.profile();
                return;
            }
        }
        System.out.println("User not found ");

    }

    public static void showAllProcedures() throws IOException {
        String file = "src/files/showallprocedures.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void showSchedulesForProcedures() throws IOException {
        String file = "src/files/showschedulesforprocedures.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void buyProcedure() throws IOException {
        String file = "src/files/buyprocedure.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void searchProcedureByName() {
    }

    public static void schedules(User user) throws IOException {
        String file = "src/files/schedules.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void payments(User user) throws IOException {
        String file = "src/files/payments.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void lastVisitDate(User user) throws IOException {
        String file = "src/files/lastvisitdate.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void attendanceHistory(User user) throws IOException {
        String file = "src/files/attendancehistory.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void changeTimeAndNameProcedure() throws IOException {
        String file = "src/files/changetimeandnameprocedure.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void showVisitorWithTheHighestVisitTraffic() throws IOException {
        String file = "src/files/showvisitorWiththehighestvisittraffic.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void showVisitorWiththeMinimumNumberOfVisits() throws IOException {
        String file = "src/files/showvisitorwiththeminimumnumberofvisits.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void deletePersonal(List<User> users) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter username to delete: ");
        String username = scanner.next();
        for(User user:users){
            if (user.username.equals(username))
            {
                users.remove(user);
                System.out.println("User deleted successfully ");
                break;
            }
        }
    }

    public static void addPersonal(List<User> users) {
        Scanner sc = new Scanner(System.in);
        User newUser = new User();
        System.out.print("Enter name: ");
        newUser.name = sc.next();

        System.out.print("Enter user name: ");
        newUser.username = sc.next();

        System.out.print("Enter password: ");
        newUser.password = sc.next();

        System.out.print("Enter role: ");
        newUser.role = sc.next();

        users.add(newUser);

        System.out.print("User successfully added ");
    }
}
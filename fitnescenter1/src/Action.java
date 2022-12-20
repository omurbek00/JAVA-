import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Action {
    public static void selectMenu(User user, List<User> users) throws IOException {
        if (user.role.equals("DIRECTOR")) {
            director(user, users);
        } else if (user.role.equals("MANAGER")) {
            manager(user, users);
        } else if (user.role.equals("PERSONAL")) {
            personal(user, users);
        } else if (user.role.equals("CLIENT")) {
            client(user);
        }
    }

    public static void director(User user, List<User> users) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please select menu by number or (7) to exit.");
            System.out.println("Menu:");
            System.out.println("1. List of Procedures by clients");
            System.out.println("2. Search Clients");
            System.out.println("3. Show all Procedures");
            System.out.println("4. Change Price of Procedures ");
            System.out.println("5. Change Time and Name  Procedure ");
            System.out.println("6. Show Visitor with the highest  visit traffic ");
            System.out.println("7.  Show Visitor with the minimum number of visits");
            System.out.println("8. Delete Personal  ");
            System.out.println("9. Add Personal ");
            System.out.println("10. Exit");

            System.out.print("chose menu: ");
            int action = sc.nextInt();


            switch (action) {
                case 1:
                    Menu.listOfProcedures();
                    break;
                case 2:
                    Menu.searchClients(users);
                    break;
                case 3:
                    Menu.showAllProcedures();
                    break;
                case 4:
                    Menu.showSchedulesForProcedures();
                    break;
                case 5:
                    Menu.changeTimeAndNameProcedure();
                    break;
                case 6:
                    Menu.showVisitorWithTheHighestVisitTraffic();
                    break;
                case 7:
                    Menu.showVisitorWiththeMinimumNumberOfVisits();
                    break;
                case 8:
                    Menu.deletePersonal(users);
                    break;
                case 9:
                    Menu.addPersonal(users);
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }

    public static void manager(User user, List<User> users) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please select menu by number or (7) to exit.");
            System.out.println("Menu:");
            System.out.println("1. List of Procedures by clients");
            System.out.println("2. Search Clients");
            System.out.println("3. Show all Procedures");
            System.out.println("4. Change Price of Procedures ");
            System.out.println("5. Change Time and Name  Procedure ");
            System.out.println("6. Show Visitor with the highest  visit traffic ");
            System.out.println("7.  Show Visitor with the minimum number of visits");
            System.out.println("8. Exit");
            int action = sc.nextInt();

            switch (action) {
                case 1:
                    Menu.listOfProcedures();
                    break;
                case 2:
                    Menu.searchClients(users);
                    break;
                case 3:
                    Menu.showAllProcedures();
                    break;
                case 4:
                    Menu.showSchedulesForProcedures();
                    break;
                case 5:
                    Menu.changeTimeAndNameProcedure();
                    break;
                case 6:
                    Menu.showVisitorWithTheHighestVisitTraffic();
                    break;
                case 7:
                    Menu.showVisitorWiththeMinimumNumberOfVisits();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }

    public static void personal(User user, List<User> users) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please select menu by number or (7) to exit.");
            System.out.println("Menu:");
            System.out.println("1. List of Procedures by clients");
            System.out.println("2. Search Clients");
            System.out.println("3. Show all Procedures");
            System.out.println("4. Show schedules for Procedures");
            System.out.println("5. Buy a Procedure");
            System.out.println("6. Search Procedure by Name");
            System.out.println("7. Exit");

            int action = sc.nextInt();

            switch (action) {
                case 1:
                    Menu.listOfProcedures();
                    break;
                case 2:
                    Menu.searchClients(users);
                    break;
                case 3:
                    Menu.showAllProcedures();
                    break;
                case 4:
                    Menu.showSchedulesForProcedures();
                    break;
                case 5:
                    Menu.buyProcedure();
                    break;
                case 6:
                    Menu.searchProcedureByName();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }

    public static void client(User user) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please select menu by number or (6) to exit.");
            System.out.println("Menu:");
            System.out.println("1. Attendance History");
            System.out.println("2. Last Visited Date");
            System.out.println("3. Payment history");
            System.out.println("4. Schedules");
            System.out.println("5. Profile");
            System.out.println("6. Exit");
            System.out.print("enter menu: ");
            String action = sc.next();

            switch (action) {
                case "1":
                    Menu.attendanceHistory(user);
                    break;
                case "2":
                    Menu.lastVisitDate(user);
                    break;
                case "3":
                    Menu.payments(user);
                    break;
                case "4":
                    Menu.schedules(user);
                    break;
                case "5":
                    user.profile();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}
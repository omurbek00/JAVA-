import java.util.Date;

public class User {
    public String username;
    public String password;
    public String name;
    public String surname;
    public String role;
    public int height;
    public int weight;
    public String bloodType;
    public Date birthDate;


    public void profile() {
        System.out.println("User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bloodType='" + bloodType + '\'' +
                ", birthDate=" + birthDate +
                '}');
    }
}
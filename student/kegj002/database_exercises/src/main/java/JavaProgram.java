import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaProgram
{
    public static void main(String[] args) throws UsernameNotFound, PasswordNotFound {
        Properties database = new Properties();

        try {
            database.load(new FileInputStream("src/main/resources/database.properties"));
        } catch (IOException e) {
            System.out.println("Finner ikke filen");
        }

        if (!database.getProperty("username").isEmpty()) {
            System.out.print("Username: ");
            System.out.println(database.getProperty("username"));
        } else {
            throw new UsernameNotFound();
        }

        if (!database.getProperty("password").isEmpty()) {
            System.out.print("Password: ");
            System.out.println(database.getProperty("password"));
        } else {
            throw new PasswordNotFound();
        }

        System.out.println(database.getProperty("username"));
    }

    static class UsernameNotFound extends Exception {
        public UsernameNotFound() {
            super("Brukernavnet ikke funnet i database.properties");
        }
    }
    static class PasswordNotFound extends Exception {
        public PasswordNotFound() {
            super("Passord ikke funnet i database.properties");
        }
    }

}

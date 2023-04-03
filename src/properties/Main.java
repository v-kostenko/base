package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        FileInputStream fileInputStream;
        Properties properties = new Properties();

        try {
            fileInputStream = new FileInputStream("src/properties/config.properties");
            properties.load(fileInputStream);

            String name = properties.getProperty("db.name");
            String login = properties.getProperty("db.login");
            String password = properties.getProperty("db.password");

            System.out.println(name);
            System.out.println(login);
            System.out.println(password);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

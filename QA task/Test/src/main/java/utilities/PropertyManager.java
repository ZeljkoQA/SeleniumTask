package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager{

    private static String url;
    private static String login_name;
    private static String login_password;
    private static String blank_name;
    private static String blank_password;
    private static String wrongName;
    private static String wrongPassword;
    private static String firstName;
    private static String lastName;
    private static String zip;

    public static PropertyManager getInstance(){
        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        login_name = properties.getProperty("login_userName");
        login_password = properties.getProperty("login_password");
        blank_name = properties.getProperty("empty_name");
        blank_password = properties.getProperty("empty_password");
        wrongName = properties.getProperty("wrong_name");
        wrongPassword = properties.getProperty("wrong_password");
        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");
        zip = properties.getProperty("zip");
        return instance;
    }


    public String getUrl(){
        return url;
    }
    public String getLogin_name(){
        return login_name;
    }
    public String getLogin_password() {
        return login_password;
    }
    public String getBlank_name(){
        return blank_name;
    }
    public String getBlank_password(){
        return blank_password;
    }
    public String getWrongName(){
        return wrongName;
    }
    public String getWrongPassword(){
        return wrongPassword;
    }
    public String getFirstName()
    {return firstName;
    }
    public String getLastName()
    {return lastName;
    }
    public String getZip()
    {return zip;
    }
}

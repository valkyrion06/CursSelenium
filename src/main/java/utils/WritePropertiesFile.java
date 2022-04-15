package utils;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFile {
    public OutputStream outputStream;
    @Test
    public void writePropertiesFile(){
        try {
            outputStream= new FileOutputStream("logInDetails.properties");
            Properties properties = new Properties();
            properties.setProperty("username","TestUser");
            properties.setProperty("password","12345@67890");
            properties.setProperty("success","true");
            properties.store(outputStream,"Saved logInDetails.properties");

            System.out.println(properties);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

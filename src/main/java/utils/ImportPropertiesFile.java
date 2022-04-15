package utils;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import utils.WritePropertiesFile;

public class ImportPropertiesFile {

    FileInputStream inputFile;
    Properties file;

    public ImportPropertiesFile() throws IOException {
        this.inputFile = new FileInputStream("logInDetails.properties");
        file = new Properties();
        file.load(inputFile);
    }


    public String readPropertiesFile(String key) throws IOException {
            String value = file.getProperty(key);
            return value;
            //System.out.println(value);


    }
}
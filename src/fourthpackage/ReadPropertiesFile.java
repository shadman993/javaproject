package fourthpackage;

import jdk.internal.util.xml.impl.Input;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        /* try {
            InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("please fix the file path . there was a FileNotFoundException Exception");
        }*/

        InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties");

        properties.load(inputStream);

       String dbNameFromFile = properties.getProperty("dbName");
       String dbUserFromFile = properties.getProperty("dbUser");
       String dbPasswordFromFile = properties.getProperty("dbPassword");
        System.out.println(dbNameFromFile);
        System.out.println(dbPasswordFromFile);
        System.out.println(dbUserFromFile);




    }

    }


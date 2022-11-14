package com.cydeo.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties(); //class Properties extends Hashtable<Object,Object>

    static { //static block runs first before anything and ONCE
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    *This method is used to read value from a config.properties
    * @param keyword --> key name in config.properties file
    * @return --> value for the key. returns null if key isnt found
    * driver.get(ConfigReader.getProperty("env")
     */



    public static String getProperty(String key) {
        return properties.getProperty(key);
    }


}

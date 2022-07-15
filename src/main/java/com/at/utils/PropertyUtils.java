package com.at.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyUtils {


    private static final Properties properties =new Properties();
    private static Map<String,String> MAP=new HashMap<String,String>();

    public void readPropertyFileAndLoadIntoMap(){

        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream("");
            properties.load(fileInputStream);

            for (Map.Entry<Object,Object> entry :properties.entrySet()){
                
            }



        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}

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

    // if we create a static block we are not required call like method.
    // it will do automatically

    static {

        //FileInputStream fileInputStream= null;
        //implementing Autocloseable
        // try with resource
        try ( FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties")){

            properties.load(fileInputStream);

            for (Map.Entry<Object,Object> entry :properties.entrySet()){
                String key=String.valueOf(entry.getKey()) ;
                String value=String.valueOf(entry.getValue());
                MAP.put(key,value);
            }
        }

        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }


    public static String getValue(String key){
        return MAP.get(key);
    }

}

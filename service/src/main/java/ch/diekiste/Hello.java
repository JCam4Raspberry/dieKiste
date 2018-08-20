package ch.diekiste;

import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class Hello {

    public static void main(String[] args) {

        Hello obj = new Hello();
        System.out.println(obj.getFileWithUtil("signalk-rawdata.log.2017-06-27T16"));

    }

    private String getFileWithUtil(String fileName) {

        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}

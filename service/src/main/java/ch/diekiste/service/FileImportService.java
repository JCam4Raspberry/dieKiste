package ch.diekiste.service;


import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileImportService {

    public static void main(String ... args)  {

        FileImportService fis = new FileImportService();
        String content = fis.getFileWithUtil("signalk-rawdata.log.2017-06-27T16");
        String[] lines = content.split("\n");
        int number = 1;
        for (String line: lines) {
            System.out.println(number++ + ": " + line);
        }
    }


    public String getFileWithUtil(String fileName) {

        String result = "";

        try {
            result = IOUtils.toString(getClass().getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}

package com.atr.structural_patterns.decorator.example02;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        int c;
        try {
            StringBuffer stringBuffer = new StringBuffer("ASDugifwe BDSFBYIUSBDFKkashdkuas");
            byte[] bytes = stringBuffer.toString().getBytes();
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

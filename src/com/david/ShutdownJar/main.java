package com.david.ShutdownJar;

import java.io.*;

public class main {
    public static void main(String arg[]) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("shutdown -s -t 0");
        System.exit(0);
    }
}
package com.codegym.creational.singleton;

// phục việc debug
// áp dụng Singleton pattern

public class Logger { // Singleton
    private static Logger instance;
//    private static File file = new File("log.txt");
//    private static FileOutputStream stream;

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance  == null) {
            instance = new Logger();
//            stream = new FileOutputStream(file);
        }
        return instance;
    }

    public void log(Object text) {
//        stream.write((byte[]) text);
        System.out.println(text);
    }

    public void info(Object text) {
        System.out.println(text);
    }

}

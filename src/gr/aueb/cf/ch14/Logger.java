package gr.aueb.cf.ch14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static  Logger instance = null;

    private Logger(){

    }
    public static Logger getInstance() {
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(message + " " + timestamp);
    }
}

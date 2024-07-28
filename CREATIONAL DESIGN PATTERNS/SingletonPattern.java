 // Singleton Logger
class Logger {
    private static Logger instance;

    private Logger() {
        // private constructor
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Demo
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message.");
        logger2.log("This is another log message.");

        System.out.println("Logger instances are the same: " + (logger1 == logger2));
    }
}
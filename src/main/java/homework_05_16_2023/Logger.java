package homework_05_16_2023;

public class Logger {
    public void log(String message) {

    }

    public static class SomeClass {
        private Logger logger;

        public SomeClass(Logger logger) {
            this.logger = logger;
        }

        public void doSomething() {
            logger.log("Some message");
        }
    }
}

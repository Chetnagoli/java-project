public class TaskFactory {
    public static Task createTask(String type, String name) {
        switch (type) {
            case "Simple":
                return new SimpleTask(name);
            case "Complex":
                return new ComplexTask(name);
            default:
                throw new IllegalArgumentException("Unknown task type");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Singleton usage
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Config: " + configManager.getConfiguration());

        // Factory usage
        Task task = TaskFactory.createTask("Simple", "MyTask");
        TaskDecorator loggingTask = new LoggingTaskDecorator(task);
        TaskDecorator notifyingTask = new NotificationTaskDecorator(loggingTask);

        // Observer usage
        TaskSubject taskSubject = new TaskSubject();
        taskSubject.addObserver(taskName -> System.out.println("Observer notified of task: " + taskName));
        taskSubject.setTaskName("New Task");

        // Command usage
        Command command = new TaskCommand(task);
        command.execute();
        command.undo();
    }
}

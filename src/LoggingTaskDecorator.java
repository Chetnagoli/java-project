public class LoggingTaskDecorator extends TaskDecorator {
    public LoggingTaskDecorator(Task decoratedTask) {
        super(decoratedTask);
    }

    @Override
    public void execute() {
        System.out.println("Logging task execution.");
        decoratedTask.execute();
    }
}

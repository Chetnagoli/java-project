public class NotificationTaskDecorator extends TaskDecorator {
    public NotificationTaskDecorator(Task decoratedTask) {
        super(decoratedTask);
    }

    @Override
    public void execute() {
        decoratedTask.execute();
        System.out.println("Notifying after task execution.");
    }
}

public abstract class TaskDecorator implements Task {
    protected Task decoratedTask;

    public TaskDecorator(Task decoratedTask) {
        this.decoratedTask = decoratedTask;
    }

    @Override
    public void execute() {
        decoratedTask.execute();
    }
}


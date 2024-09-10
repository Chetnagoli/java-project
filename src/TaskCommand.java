import java.util.Stack;

public class TaskCommand implements Command {
    private Task task;
    private Stack<String> history = new Stack<>();

    public TaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.execute();
        history.push("Task executed");
    }

    @Override
    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Undoing: " + history.pop());
            // Implement specific undo logic if needed
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}

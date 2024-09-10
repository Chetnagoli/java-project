import java.util.ArrayList;
import java.util.List;

public class TaskSubject {
    private List<Observer> observers = new ArrayList<>();
    private String taskName;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(taskName);
        }
    }
}

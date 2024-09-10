public class ComplexTask implements Task {
    private String name;

    public ComplexTask(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Executing complex task: " + name);
    }
}
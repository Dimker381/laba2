import java.util.*;


class Department {
    private String name;
    private Employee manager;
    private List<Employee> employees = new ArrayList<>();


    public Department(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Имя отдела не может быть пустым");
        this.name = name;
    }


    public String getName() { return name; }


    public void setManager(Employee manager) {
        if (manager == null) throw new IllegalArgumentException("Начальник не может быть null");
        if (!employees.contains(manager)) employees.add(manager);
        this.manager = manager;
    }


    public Employee getManager() { return manager; }


    public void addEmployee(Employee e) {
        if (e != null && !employees.contains(e)) employees.add(e);
    }


    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
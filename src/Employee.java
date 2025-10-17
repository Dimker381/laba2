import java.util.*;


class Employee {
    private String name;
    private Department department;


    public Employee(String name, Department department) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Имя не может быть пустым");
        if (department == null) throw new IllegalArgumentException("Отдел не может быть null");
        this.name = name;
        this.department = department;
        department.addEmployee(this);
    }


    public String getName() { return name; }
    public Department getDepartment() { return department; }


    public List<Employee> getDepartmentEmployees() {
        return department.getEmployees();
    }


    @Override
    public String toString() {
        Employee mgr = department.getManager();
        if (mgr != null && mgr == this)
            return name + " начальник отдела " + department.getName();
        else if (mgr != null)
            return name + " работает в отделе " + department.getName() + ", начальник которого " + mgr.getName();
        else
            return name + " работает в отделе " + department.getName() + ", начальник которого не назначен";
    }
}
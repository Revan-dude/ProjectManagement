import java.util.Arrays;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private int age;
    private double salary;
    private List<String> skills;
    private Department department;

    public Employee(int id, String name, int age, double salary, List<String> skills, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.skills = skills;
        this.department = department;
    }

    public Employee(String line) {
        String[] tokens = line.split(",");
        this.id = Integer.parseInt(tokens[0]);
        this.name = tokens[1];
        this.department = Department.valueOf(tokens[2]);
        this.age = Integer.parseInt(tokens[3]);
        this.salary = Double.parseDouble(tokens[4]);
        String[] skills = tokens[5].split("[|]");
        this.skills = Arrays.stream(skills).toList();
    }

    public String toString() {
        return String.format("%d, %s, %d, %.2f, %s, %s",
                id, name, age, salary, department.name(), skills);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private List<Employee> employees;
    private List<Project> projects;
    private List<ProjectMember> projectMembers;
    private Map<Integer, Employee> empById;
    private Map<String, Project> projectById;

    public Main() throws IOException {
        employees = EmployeeReader.readEmployees();
        this.projects = ProjectReader.readProjects();
        this.projectMembers = ProjectMemberReader.readProjectMembers();
        this.empById = new HashMap<>();
        this.projectById = new HashMap<>();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println("Level 1 task 1:");
        System.out.println("----------------------------------------");
        main.level_1_task_1();
        System.out.println("Level 1 task 2:");
        System.out.println("----------------------------------------");
        main.level_1_task_2();
        System.out.println("Level 1 task 3:");
        System.out.println("----------------------------------------");
        main.level_1_task_3();
        System.out.println("Level 1 task 4:");
        System.out.println("----------------------------------------");
        main.level_1_task_4();
        System.out.println("Level 1 task 5:");
        System.out.println("----------------------------------------");
        main.level_1_task_5();
        System.out.println("Level 1 task 6:");
        System.out.println("----------------------------------------");
        main.level_1_task_6();
        System.out.println("Level 1 task 7:");
        System.out.println("----------------------------------------");
        main.level_1_task_7();
        System.out.println("Level 1 task 8:");
        System.out.println("----------------------------------------");
        main.level_1_task_8();
        System.out.println("Level 1 task 9:");
        System.out.println("----------------------------------------");
        main.level_1_task_9();
        System.out.println("Level 1 task 10:");
        System.out.println("----------------------------------------");
        main.level_1_task_10();
        System.out.println("Level 2 task 1:");
        System.out.println("----------------------------------------");
        main.level_2_task_1();
        System.out.println("Level 2 task 2:");
        System.out.println("----------------------------------------");
        main.level_2_task_2();
        System.out.println("Level 2 task 3:");
        System.out.println("----------------------------------------");
        main.level_2_task_3();
        System.out.println("Level 2 task 4:");
        System.out.println("----------------------------------------");
        main.level_2_task_4();
        System.out.println("Level 2 task 5:");
        System.out.println("----------------------------------------");
        main.level_2_task_5();
        System.out.println("Level 2 task 6:");
        System.out.println("----------------------------------------");
        main.level_2_task_6();
        System.out.println("Level 2 task 7:");
        System.out.println("----------------------------------------");
        main.level_2_task_7();
        System.out.println("Level 2 task 8:");
        System.out.println("----------------------------------------");
        main.level_2_task_8();
        System.out.println("Level 2 task 9:");
        System.out.println("----------------------------------------");
        main.level_2_task_9();
        System.out.println("Level 2 task 10:");
        System.out.println("----------------------------------------");
        main.level_2_task_10();
        System.out.println("Level 3 task 1:");
        System.out.println("----------------------------------------");
        main.level_3_task_1();
        System.out.println("Level 3 task 2:");
        System.out.println("----------------------------------------");
        main.level_3_task_2();
        System.out.println("Level 3 task 3:");
        System.out.println("----------------------------------------");
        main.level_3_task_3();
        System.out.println("Level 3 task 4:");
        System.out.println("----------------------------------------");
        main.level_3_task_4();
        System.out.println("Level 3 task 5:");
        System.out.println("----------------------------------------");
        main.level_3_task_5();
        System.out.println("Level 3 task 6:");
        System.out.println("----------------------------------------");
        main.level_3_task_6();
    }

    private void level_1_task_1() {
        employees.stream().
                forEach(System.out::println);
    }

    private void level_1_task_2() {
        employees.stream().
                filter(e -> e.getDepartment() == Department.IT)
                .forEach(System.out::println);
    }

    private void level_1_task_3() {
        employees.stream()
                .filter(e -> e.getSalary() > 4000)
                .forEach(System.out::println);
    }

    private void level_1_task_4() {
        List<Employee> employeeTemp = new ArrayList<>();

        employeeTemp = employees.stream()
                .filter(e -> e.getAge() > 25)
                .toList();

        employeeTemp.stream()
                .forEach(System.out::println);
    }

    private void level_1_task_5() {
        List<String> list = employees.stream()
                .map(e -> e.getName())
                .toList();

        list.stream()
                .forEach(System.out::println);
    }

    private void level_1_task_6() {
        List<String> list = employees.stream()
                .map(e -> e.getName().toUpperCase())
                .toList();

        list.stream()
                .forEach(System.out::println);
    }

    private void level_1_task_7() {
        for(int i = 0; i < Department.values().length; i++) {
            int count = 0;
            Department department = Department.values()[i];

            count = (int)employees.stream()
                    .filter(e -> e.getDepartment() == department)
                    .count();

            System.out.println(department.name() + " Count: " + count);
        }
    }

    private void level_1_task_8() {
        List<String> skillsList = employees.stream()
                .map(e -> String.join(",", e.getSkills()))
                .toList();

        skillsList.stream()
                .forEach(System.out::println);
    }

    private void level_1_task_9() {
        List<String> skillsList = employees.stream()
                .map(e -> String.join(",", e.getSkills()))
                .toList();

        List<String> distinctSkillsList = Arrays.stream(skillsList.stream()
                        .collect(Collectors.joining(","))
                                .split(","))
                                        .toList();
        distinctSkillsList = distinctSkillsList
                .stream()
                .collect(Collectors.toSet())
                .stream()
                .toList();


        distinctSkillsList.stream()
                .forEach(System.out::println);
    }

    private void level_1_task_10() {
        employees.stream()
                .filter(e -> e.getSkills().contains("Java"))
                .forEach(System.out::println);
    }

    private void level_2_task_1() {
        employees.stream()
                .sorted(Comparator.comparing((Employee::getSalary)))
                .forEach(System.out::println);
    }

    private void level_2_task_2() {
        employees.stream()
                .sorted(Comparator.comparing((Employee::getSalary)).reversed())
                .forEach(System.out::println);
    }

    private void level_2_task_3() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    private void level_2_task_4() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(3)
                .forEach(System.out::println);
    }

    private void level_2_task_5() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }

    private void level_2_task_6() {
        employees.stream()
                .filter(e -> e.getDepartment() == Department.IT)
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);
    }

    private void level_2_task_7() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .limit(10)
                .toList()
                .reversed()
                .stream()
                .limit(5)
                .forEach(System.out::println);
    }

    private void level_2_task_8() {
        employees.stream()
                .filter(e -> {
                    char firstLetter = e.getName().toUpperCase().charAt(0);

                    if (firstLetter == 'A' || firstLetter == 'F'){
                        return true;
                    }

                    else return false;
                })
                .forEach(System.out::println);
    }

    private void level_2_task_9() {
        employees.stream()
                .filter(e -> e.getSkills().size() >= 3)
                .forEach(System.out::println);
    }

    private void level_2_task_10() {
        System.out.println(String.join(",", Arrays.stream(Department.values())
                .map(a -> a.name())
                .toList()));
    }

    private void level_3_task_1() {
        Map<Department, List<Employee>> departmentEmployeeMap = new HashMap<>();

        employees.stream()
                .forEach(e -> departmentEmployeeMap.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e));

        departmentEmployeeMap.forEach((dept, employeesList) ->
                        System.out.println("Dept: " + dept.name() + " has these Employees: " + String.join(",", employeesList.stream().map(e -> e.getName()).toList()))
        );
    }

    private void level_3_task_2() {
        Map<Department, List<Employee>> departmentEmployeeMap = new HashMap<>();

        employees.stream()
                .forEach(e -> departmentEmployeeMap.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e));

        Map<Department, Integer> departmentEmployeeCountMap = new HashMap<>();

        employees.stream()
                .forEach(e -> departmentEmployeeCountMap.put(e.getDepartment(), (int) departmentEmployeeMap.get(e.getDepartment()).stream().count()));

        departmentEmployeeCountMap.forEach((dept, num) ->
                System.out.println("Dept: " + dept.name() + " has that many Employees: " + num)
        );
    }

    private void level_3_task_3() {
        Map<Department, List<Employee>> departmentEmployeeMap = new HashMap<>();

        employees.stream()
                .forEach(e -> departmentEmployeeMap.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e));

        Map<Department, Double> avgSalaryDepartmentMap = new HashMap<>();

        departmentEmployeeMap.forEach((d, empList) ->
                avgSalaryDepartmentMap.computeIfAbsent(d, k -> empList.stream().collect(Collectors.averagingDouble(Employee::getSalary)))
        );

        avgSalaryDepartmentMap.forEach((d, s) ->
                        System.out.println(String.format("Average Salary for Department: %s: %.2f", d.name(), s))
                );
    }

    private void level_3_task_4() {
        System.out.println("Overall highest Salary: " + employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get().getSalary());
    }

    private void level_3_task_5() {
        System.out.println("Overall lowest Salary for the IT: " + employees.stream()
                .filter(e -> e.getDepartment() == Department.IT)
                .min(Comparator.comparing(Employee::getSalary))
                .get());
    }

    private void level_3_task_6() {
        System.out.printf("Sum of all Salaries: %.2f%n",
                employees.stream()
                        .collect(Collectors.summarizingDouble(Employee::getSalary)).getSum());
    }

    private void level_3_task_7() {
        Map<Department, List<String>> departmentEmployeeMap = new HashMap<>();

        employees.stream()
                .forEach(e -> departmentEmployeeMap.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e.getName()));

        departmentEmployeeMap.forEach((dept, employeesList) ->
                System.out.println("Dept: " + dept.name() + " has these Employees: " + String.join(",", employeesList))
        );
    }

    private void level_3_task_8() {
        Map<Department, List<Employee>> departmentEmployeeMap = new HashMap<>();

        employees.stream()
                .forEach(e -> departmentEmployeeMap.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e));

        Map<Department, Double> avgSalaryDepartmentMap = new HashMap<>();

        departmentEmployeeMap.forEach((d, empList) ->
                avgSalaryDepartmentMap.computeIfAbsent(d, k -> empList.stream().collect(Collectors.averagingDouble(Employee::getSalary)))
        );

        double maxSal = 0;

        for(int i = 0; i < avgSalaryDepartmentMap.size(); i++) {
            double sal = avgSalaryDepartmentMap.get(Department.values()[i]);
            if(sal > maxSal){
                maxSal = sal;
            }
        }

        System.out.println("Maximum Salary: " + maxSal);
    }




    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<ProjectMember> getProjectMembers() {
        return projectMembers;
    }

    public void setProjectMembers(List<ProjectMember> projectMembers) {
        this.projectMembers = projectMembers;
    }

    public Map<Integer, Employee> getEmpById() {
        return empById;
    }

    public void setEmpById(Map<Integer, Employee> empById) {
        this.empById = empById;
    }

    public Map<String, Project> getProjectById() {
        return projectById;
    }

    public void setProjectById(Map<String, Project> projectById) {
        this.projectById = projectById;
    }
}

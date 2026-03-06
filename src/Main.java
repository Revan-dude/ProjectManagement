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
        this.empById = new HashMap<Integer, Employee>();
        this.projectById = new HashMap<String, Project>();

        employees.stream()
                .forEach(e -> empById.put(e.getId(), e));

        projects.stream()
                .forEach(p -> projectById.computeIfAbsent(p.getProjectId(), k -> p));
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
        System.out.println("Level 3 task 7:");
        System.out.println("----------------------------------------");
        main.level_3_task_7();
        System.out.println("Level 3 task 8:");
        System.out.println("----------------------------------------");
        main.level_3_task_8();
        System.out.println("Level 3 task 9:");
        System.out.println("----------------------------------------");
        main.level_3_task_9();
        System.out.println("Level 3 task 10:");
        System.out.println("----------------------------------------");
        main.level_3_task_10();
        System.out.println("Level 4 task 1:");
        System.out.println("----------------------------------------");
        main.level_4_task_1();
        System.out.println("Level 4 task 2:");
        System.out.println("----------------------------------------");
        main.level_4_task_2();
        System.out.println("Level 4 task 3:");
        System.out.println("----------------------------------------");
        main.level_4_task_3();
        System.out.println("Level 4 task 4:");
        System.out.println("----------------------------------------");
        main.level_4_task_4();
        System.out.println("Level 4 task 5:");
        System.out.println("----------------------------------------");
        main.level_4_task_5();
        System.out.println("Level 4 task 6:");
        System.out.println("----------------------------------------");
        main.level_4_task_6();
        System.out.println("Level 4 task 7:");
        System.out.println("----------------------------------------");
        main.level_4_task_7();
        System.out.println("Level 4 task 8:");
        System.out.println("----------------------------------------");
        main.level_4_task_8();
        System.out.println("Level 4 task 9:");
        System.out.println("----------------------------------------");
        main.level_4_task_9();
        System.out.println("Level 4 task 10:");
        System.out.println("----------------------------------------");
        main.level_4_task_10();
        System.out.println("Level 5 task 1:");
        System.out.println("----------------------------------------");
        main.level_5_task_1();
        System.out.println("Level 5 task 2:");
        System.out.println("----------------------------------------");
        main.level_5_task_2();
        System.out.println("Level 5 task 3:");
        System.out.println("----------------------------------------");
        main.level_5_task_3();
        System.out.println("Level 5 task 4:");
        System.out.println("----------------------------------------");
        main.level_5_task_4();
        System.out.println("Level 5 task 5:");
        System.out.println("----------------------------------------");
        main.level_5_task_5();
        System.out.println("Level 5 task 6:");
        System.out.println("----------------------------------------");
        main.level_5_task_6();
        System.out.println("Level 5 task 7:");
        System.out.println("----------------------------------------");
        main.level_5_task_7();
        System.out.println("Level 5 task 8:");
        System.out.println("----------------------------------------");
        main.level_5_task_8();
        System.out.println("Level 5 task 9:");
        System.out.println("----------------------------------------");
        main.level_5_task_9();
        System.out.println("Level 5 task 10:");
        System.out.println("----------------------------------------");
        main.level_5_task_10();
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
        Department dept = Department.values()[0];

        for(int i = 0; i < avgSalaryDepartmentMap.size(); i++) {
            double sal = avgSalaryDepartmentMap.get(Department.values()[i]);
            if(sal > maxSal){
                maxSal = sal;
                dept = Department.values()[i];
            }
        }

        System.out.printf("Department (%s) With highest average Salary: %.2f", dept.name(), maxSal);
    }

    private void level_3_task_9() {
        System.out.println("Employee with Overall highest Salary: " + employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get());
    }

    private void level_3_task_10() {
        employees.stream()
                .forEach(e -> System.out.println(e.getName() + " is " + e.getAge() + " years old."));
    }

    private void level_4_task_1() {
        System.out.println(employees.stream()
                .anyMatch(e -> e.getSalary() > 6000));
    }

    private void level_4_task_2() {
        System.out.println(employees.stream()
                .allMatch(e -> e.getAge() > 18));
    }

    private void level_4_task_3() {
        System.out.println(employees.stream()
                .anyMatch(e -> e.getSkills().isEmpty()));
    }

    private void level_4_task_4() {
        System.out.println(employees.stream()
                .filter(e -> e.getDepartment() == Department.IT)
                .findFirst());
    }

    private void level_4_task_5() {
        System.out.println(employees.stream()
                .filter(e -> e.getDepartment() == Department.SALES)
                .findAny());
    }

    private void level_4_task_6() {
        double sumSal = employees.stream()
                .reduce(0.0, (a, b) -> a + b.getSalary(), Double::sum);

        System.out.println("Sum of all Salaries using reduce: " + sumSal);
    }

    private void level_4_task_7() {
        System.out.println(employees.stream()
                .min(Comparator.comparing(Employee::getAge)));
    }

    private void level_4_task_8() {
        System.out.println(employees.stream()
                .max(Comparator.comparing(Employee::getAge)));
    }

    private void level_4_task_9() {
        System.out.println(employees.stream()
                .filter(e -> e.getDepartment() == Department.IT)
                .allMatch(e -> e.getSkills().contains("Git")));
    }

    private void level_4_task_10() {
        System.out.println(employees.stream()
                .filter(e -> e.getSkills().contains("Excel"))
                .sorted(Comparator.comparing(Employee::getName))
                .findFirst());
    }

    private void level_5_task_1() {
        List<Employee> employeeTemp = new ArrayList<>();

        employeeTemp = employees.stream()
                .filter(e -> projectMembers.stream()
                        .filter(pm -> pm.getProjectId().equals("P500"))
                        .map(ProjectMember::getEmployeeId)
                        .anyMatch(i -> i == e.getId()))
                .toList();

        employeeTemp.stream()
                .forEach(System.out::println);
    }

    private void level_5_task_2() {
        List<String> projectIds = new ArrayList<>();

        projectIds = projectMembers.stream()
                .filter(pm -> pm.getEmployeeId() == 3)
                .map(ProjectMember::getProjectId)
                .toList();

        projectIds.stream()
                .forEach(a -> System.out.printf("Employee with id 3 is working on: %s%n", projectById.get(a).getName()));

    }

    private void level_5_task_3() {
        Map<String, Integer> memberPerProjectCountMap = new HashMap<>();

        projectMembers.stream()
                .forEach(pm -> memberPerProjectCountMap.compute(pm.getProjectId(), (k, v) -> v == null ? 1 : v + 1));

        memberPerProjectCountMap.forEach((k, v) -> System.out.printf("Project: %s has %d members%n", k, v));
    }

    private void level_5_task_4() {
        Map<Department, Integer> memberPerProjectDepartment = new HashMap<>();

        Arrays.stream(Department.values()).toList()
                .forEach(dept -> projects.stream()
                        .filter(p -> p.getDepartment() == dept)
                        .forEach(p -> projectMembers.stream()
                                .forEach(pm -> memberPerProjectDepartment.compute(p.getDepartment(), (k, v) -> v == null ? 1 : v + 1))));

        memberPerProjectDepartment.forEach((dept, num) -> System.out.printf("Department (%s) has %d members%n", dept.name(), num));

    }

    private void level_5_task_5() {
        Map<String, Integer> projectIdAllocationSumMap = new HashMap<>();

        projects.stream()
                .forEach(p -> {
                            Integer sum = projectMembers.stream()
                            .filter(pm -> pm.getProjectId().equals(p.getProjectId()))
                                    .collect(Collectors.summingInt(ProjectMember::getAllocationPercent));

                            if(sum == 100) {
                                projectIdAllocationSumMap.put(p.getProjectId(), 100);
                            }
                });

        projectIdAllocationSumMap.forEach((k, v) -> System.out.printf("Project: %s has 100%% allocation%n", k));
    }

    private void level_5_task_6() {
        Map<Project, List<String>> distinctRolesPerProject = new HashMap<>();

        projects.stream()
                .forEach(p -> {
                    Set<String> roles = new HashSet<>();
                    projectMembers.stream()
                            .filter(pm -> pm.getProjectId().equals(p.getProjectId()))
                            .forEach(pm -> roles.add(pm.getRole()));
                    distinctRolesPerProject.put(p, new ArrayList<>(roles));
                });

        distinctRolesPerProject.forEach((p, roles) -> System.out.printf("Project: %s has these roles: %s%n", p.getName(), String.join(",", roles)));
    }

    private void level_5_task_7() {
        projects.stream()
                .forEach(p -> {
                    double maxSal = projectMembers.stream()
                            .filter(pm -> pm.getProjectId().equals(p.getProjectId()))
                            .map(pm -> empById.get(pm.getEmployeeId()))
                            .max(Comparator.comparing(Employee::getSalary))
                            .get().getSalary();

                    System.out.printf("Project: %s highest Salary is: %.2f%n", p.getName(), maxSal);
                });
    }

    private void level_5_task_8() {
        Project highestBudgetProject = projects.stream()
                        .max(Comparator.comparing(Project::getBudget)).get();
        System.out.println("Project with the highest budget is: " + highestBudgetProject.getName() + " with an Budget of: " + highestBudgetProject.getBudget());
    }

    private void level_5_task_9() {
        Map<Employee, Integer> allAllocationperEmployee = new HashMap<>();

        employees.stream()
                .forEach(e -> allAllocationperEmployee.put(e, (int)projectMembers.stream()
                        .filter(pm -> pm.getEmployeeId() == e.getId())
                        .collect(Collectors.summingInt(ProjectMember::getAllocationPercent))));

        allAllocationperEmployee.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println("Employee with the highest allocation is " + e.getKey().getName() + " with an allocation of: " + e.getValue() + "%"));
    }

    private void level_5_task_10() {
        projects.stream()
                .forEach(p -> {
                    Map<Employee, Integer> AllocationPerEmployee = new HashMap<>();
                    projectMembers.stream()
                            .filter(pm -> pm.getProjectId().equals(p.getProjectId()))
                            .forEach(pm -> AllocationPerEmployee.put(empById.get(pm.getEmployeeId()), pm.getAllocationPercent()));

                    AllocationPerEmployee.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                            .forEach(e -> System.out.printf("Project (Id: %s) %s: Employee %s with an allocation of: %d%%%n", p.getProjectId(), p.getName() ,e.getKey().getName(), e.getValue()));
                });
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

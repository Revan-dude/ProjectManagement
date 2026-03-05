public class Project {

    private String projectId;
    private String name;
    private double budget;
    private Department department;

    public Project(String projectId, String name, double budget, Department department) {
        this.projectId = projectId;
        this.name = name;
        this.budget = budget;
        this.department = department;
    }

    public Project(String line) {
        String[] tokens = line.split(",");
        this.projectId = tokens[0];
        this.name = tokens[1];
        this.department = Department.valueOf(tokens[2]);
        this.budget = Double.parseDouble(tokens[3]);
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

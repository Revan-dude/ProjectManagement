public class ProjectMember {

    private String projectId;
    private int employeeId;
    private String role;
    private int allocationPercent;

    public ProjectMember(String projectId, int employeeId, String role, int allocationPercent) {
        this.projectId = projectId;
        this.employeeId = employeeId;
        this.role = role;
        this.allocationPercent = allocationPercent;
    }

    public ProjectMember(String line) {
        String[] tokens = line.split(",");
        this.projectId = tokens[0];
        this.employeeId = Integer.parseInt(tokens[1]);
        this.role = tokens[2];
        this.allocationPercent = Integer.parseInt(tokens[3]);
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAllocationPercent() {
        return allocationPercent;
    }

    public void setAllocationPercent(int allocationPercent) {
        this.allocationPercent = allocationPercent;
    }
}

public class Employee {
    private String nickname;
    private String email;
    private char[] password;
    private EmployeeType employeeType;

    public Employee(String nickname, String email, char[] password, EmployeeType employeeType) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.employeeType = employeeType;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}

enum EmployeeType {
    ACTIVE,
    INACTIVE,
    DELETED
}

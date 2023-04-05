import java.util.List;

public class Manager<T> extends Employee {
    private List<Employee> listOfEmployees;
    private List<T> listOfRelationships;

    public Manager(String nickname, String email, char[] password, EmployeeType employeeType, List<Employee> listOfEmployees, List<T> listOfRelationships) {
        super(nickname, email, password, employeeType);
        this.listOfEmployees = listOfEmployees;
        this.listOfRelationships = listOfRelationships;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public List<T> getListOfRelationships() {
        return listOfRelationships;
    }

    public void setListOfRelationships(List<T> listOfRelationships) {
        this.listOfRelationships = listOfRelationships;
    }
}


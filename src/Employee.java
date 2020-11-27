public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private double salary;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate, double salary)
    {
        this.hireDate = hireDate;
        setBirthDate(birthDate);
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName){this.lastName = lastName; }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%10s %10s |-> Hired: %s; Birthday: %s; Salary: %.2f", firstName, lastName, hireDate, birthDate, salary);
    }
}

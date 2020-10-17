public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
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
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String securityNumber)
    {
        socialSecurityNumber = securityNumber;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber());
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[4];

        Date firstEmp = new Date(1999, 3, 21);
        Date secondEmp = new Date(2001, 5,7);
        Date thirdEmp = new Date(1997,12,25);
        Date fourthEmp = new Date(1995, 7,13);

        Date testHireDate = new Date(2016, 3, 4);
        Date testDate = new Date(2020, 5, 25);

        emps[0] = new Employee("Carapirea", "Cristian", firstEmp, testHireDate, 2000 );
        emps[1] = new Employee("Vladlen", "Alexandru", secondEmp, testHireDate, 2000 );
        emps[2] = new Employee("Cebotari", "Vladislav", thirdEmp, testHireDate, 2000 );
        emps[3] = new Employee("Curechi", "Andrei", fourthEmp, testHireDate,2000 );

        System.out.printf("Employees payroll processed on %s\n\n", testDate.toString());

        for (Employee tmpEmp: emps){
            double tmpPayroll = tmpEmp.getSalary();
            if (tmpEmp.getBirthDate().getMonth() == testDate.getMonth()){
                tmpPayroll += 100;
                tmpEmp.setSalary(tmpPayroll);
            }
            System.out.print(tmpEmp + "\n");
        }
    }
}

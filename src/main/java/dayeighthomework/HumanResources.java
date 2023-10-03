package dayeighthomework;

public class HumanResources {

    //Method to print the employee name from the employee object passed to the method
    public static void printBadge(Employee employee){
        String employeeName = employee.getName();
        System.out.println(employeeName);
    }
    // Method to issue badges for an array of employees
    public static void issueBadge(Employee[] employees) {
        for(Employee employee : employees) {
            printBadge(employee);
        }
    }

    // Method to print payment information for a payable person
    public static void printPaymentInfo(Employee employee) {
        if(employee instanceof SalariedEmployee){ //instanceof operator to check the type of the employee
            System.out.println("Payment type :  Salary ,Salary amount $"+ ((SalariedEmployee)employee).calculatePay());//this line performs an explicit cast (SalariedEmployee) to convert the employee reference from its base type (Employee) to the derived type (SalariedEmployee). This casting allows you to access the specific methods and properties of SalariedEmployee
        } else if (employee instanceof HourlyEmployee) {
            System.out.println("Payment type :  Hourly ,Weekly amount $"+ ((HourlyEmployee)employee).calculatePay());

        }


    }
}

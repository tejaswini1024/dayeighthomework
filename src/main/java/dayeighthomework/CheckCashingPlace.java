package dayeighthomework;

import java.net.StandardSocketOptions;

public class CheckCashingPlace {
    public static void main(String[] args) {
        // Create instances of  SalariedEmployee, HourlyEmployee, Entrepreneur
        HireDate hireDate1 = new HireDate("September", "27", "2023"); // creating an object

        //hireDate1 object of HireDate is passed as a parameter to the constructor of salariedEmployee
        SalariedEmployee salariedEmployee = new SalariedEmployee("wini", hireDate1, 90000.0);
       //getName() method is defined in Person class and not in SalariedEmployee class is example of inheritance
        System.out.println("SalariedEmployee Name : " + salariedEmployee.getName() + " pay:" + salariedEmployee.calculatePay() + " HireDate: " +salariedEmployee.getHireDate());

        HireDate hireDate2 = new HireDate("January", "15", "2023");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Zoey", hireDate2, 15.0, 40.0);
        System.out.println("HourlyEmployee Name :" + hourlyEmployee.getName() + " pay:" +hourlyEmployee.calculatePay() + " HireDate: " + hourlyEmployee.getHireDate() );

        Entrepreneur entrepreneur = new Entrepreneur("Sandy", 140000.0, 60000.0);
        Entrepreneur entrepreneur1 = new Entrepreneur();// object calling default constructor
        System.out.println("Entrepreneur Name : " + entrepreneur.getName() + " pay: " + entrepreneur.calculatePay());


        
        // Create an array of Employees
        Employee[] employees = {salariedEmployee, hourlyEmployee};
        //parent class doesnot know the methods that are defined in the child class exclusively

        //Issue Badge for all the employees
        HumanResources.issueBadge(employees);

        // Invoke the printPaymentInfo method for each payable person
        for(Employee emp:employees){
        HumanResources.printPaymentInfo(emp);
        }
    }
}










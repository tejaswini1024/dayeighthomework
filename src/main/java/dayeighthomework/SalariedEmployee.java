package dayeighthomework;

public class SalariedEmployee extends Employee  {
    private double salary;

    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name,hireDate);
        this.salary = salary;
    }

    // Getter and Setter methods for SalariedEmployee
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculatePay() {

        return this.salary/12 ; //monthly salary
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }
}


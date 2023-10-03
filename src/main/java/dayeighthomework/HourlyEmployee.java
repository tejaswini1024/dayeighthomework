package dayeighthomework;

public class HourlyEmployee extends Employee  {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, HireDate hireDate, double hourlyRate, double hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getter and Setter methods for HourlyEmployee
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double calculatePay() {
        // Calculate and return profit (revenue - expenses)
        return this.hourlyRate * this.hoursWorked ;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}

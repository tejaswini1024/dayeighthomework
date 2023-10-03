package dayeighthomework;

// Employee class (extends Person)
    public abstract class Employee extends Person implements IPayable { //
        private HireDate hireDate;//hireDate object for HireDate , just declaring

        public Employee(String name, HireDate hireDate) { // hireDate object for HireDate
            super(name); //super calls the parent class constructor
            this.hireDate = hireDate;
        }

        // Getter and Setter methods for Employee
        public HireDate getHireDate() {
            return hireDate;
        }

        public void setHireDate(HireDate hireDate) {
            this.hireDate = hireDate;
        }



    // Method to print badge
        public void printBadge() {
            System.out.println("Employee Name: " + getName());
            System.out.println("Hire Date: " + hireDate);
        }
    //public abstract double calculatePay();
}



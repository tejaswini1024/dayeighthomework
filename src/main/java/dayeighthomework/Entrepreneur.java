package dayeighthomework;

public class Entrepreneur extends Person implements IPayable {
        private double revenue;
        private double expenses;

        public Entrepreneur(String name, double revenue, double expenses) {
            super(name);//calls the constructor of person
            this.revenue = revenue;// this. refers to the object which is being used
            this.expenses = expenses;
        }

    public Entrepreneur(){//default constructor

    }

        // Getter and Setter methods for Entrepreneur
        public double getRevenue() {
            return revenue;
        }

        public void setRevenue(double revenue) {
            this.revenue = revenue;
        }

        public double getExpenses() {
            return expenses;
        }

        public void setExpenses(double expenses) {
            this.expenses = expenses;
        }

       @Override
        public double calculatePay() {
            // Calculate and return profit (revenue - expenses)
            return revenue - expenses;
        }

}


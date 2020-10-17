package lab1;

public class Main {

    public static void main(String[] args) {
        employee[] employees = new employee[3];
        employees[0] = new SalesEmployee(20000, 48, 389212);
        employees[1] = new MarketEmployee(23000, 55, 82838);
        employees[2] = new AccountEmployee(25000, 60, 180);
        for (employee Employee:employees) {
            Employee.information();
        }


    }
}

import java.util.Scanner;

class Employee {

    protected String name;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void calcSalary() {
    
    }
}

class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

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

    public void calcSalary() {
        salary = hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {

    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void calcSalary() {
        salary = annualSalary / 12;
    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hourly Employee Name: ");
        String hourlyName = scanner.nextLine();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = scanner.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyName, hourlyRate);
        hourlyEmployee.setHoursWorked(hoursWorked);
        hourlyEmployee.calcSalary();

        System.out.println("\nHourly Employee Details:");
        System.out.println("Name: " + hourlyEmployee.getName());
        System.out.println("Salary: $" + hourlyEmployee.getSalary());

        scanner.nextLine(); 

        System.out.print("\nEnter Salaried Employee Name: ");
        String salariedName = scanner.nextLine();

        System.out.print("Enter Annual Salary: ");
        double annualSalary = scanner.nextDouble();

        SalariedEmployee salariedEmployee = new SalariedEmployee(salariedName, annualSalary);
        salariedEmployee.calcSalary();

        System.out.println("\nSalaried Employee Details:");
        System.out.println("Name: " + salariedEmployee.getName());
        System.out.println("Salary: $" + salariedEmployee.getSalary());

        scanner.close();
    }
}

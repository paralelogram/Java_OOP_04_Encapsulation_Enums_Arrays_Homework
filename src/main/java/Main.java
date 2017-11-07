import java.util.Scanner;

public class Employee {
    private String name;
    private Departments department;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(Departments department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public Departments getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return department.equals(employee.department);
    }

    public static void main (String [] args) {
        Employee [] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("input info about employees");
        for (int i = 1; i <= employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("Name: " + i);
            employees[i].setName(scanner.nextLine());

            System.out.println("Department: " + i);
            employees[i].setDepartment(Departments.valueOf(scanner.nextLine().toUpperCase()));

            System.out.println("Salary: " + i);
            employees[i].setSalary(Double.valueOf(scanner.nextLine()));
        }

        System.out.println("please, enter department that you need");
        Departments dep = Departments.valueOf(scanner.nextLine().toUpperCase());

        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].department) {
                System.out.print(employees[i].getName() + " ");
                System.out.println(employees[i].getSalary());
            }
        }

        System.out.println();

        for(int i = 1; i < employees.length; ++i) {
            for (int j = 0; j < employees.length - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    double temp = employees[j].getSalary();
                    employees[j].setSalary(employees[j + 1].getSalary());
                    employees[j + 1].setSalary(temp);
                }
            }
        }

        System.out.println("sorted by salary\n");
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getName() + " ");
            System.out.print(employees[i].getDepartment() + " ");
            System.out.print(employees[i].getSalary() + "\n");
        }
    }
}
enum Departments {
    ADMINISTRATION, ACCOUNTING, MARKETING, PRODUCTION, SALES;

    @Override
    public String toString() {
        String lowercase = name().toLowerCase(java.util.Locale.US);
        return lowercase;
    }
}
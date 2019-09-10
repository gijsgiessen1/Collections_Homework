import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee Boris = new Employee("Boris","van Norren");
        Employee Lotje = new Employee("Lotje", "van Norren");
        Employee Sofie = new Employee("Sofie", "van Norren");
        Employee Rosie = new Employee("Rosie", "van Norren");
        Employee Bram = new Employee("Bram", "van der Giessen");
        Employee Billie = new Employee("Billie", "van Norren");
        Employee Sjimmie = new Employee("Sjimmie", "van Norren");
        Employee Scott = new Employee("Scott","van der Giessen");
        Employee Dwight = new Employee("Dwight", "van der Giessen");

        System.out.println("let's print the first list: " + Employee.getEmployeeNames());

        Employee.downSize(4);

        System.out.println("Let's print the list after downsizing: " +Employee.getEmployeeNames());
    }
}

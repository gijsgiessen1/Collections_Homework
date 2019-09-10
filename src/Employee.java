import java.util.LinkedList;
import java.util.ListIterator;

public class Employee {
    private String firstName;
    private String lastName;
    private String fullName;

    private static LinkedList<String> employeeNames = new LinkedList<String>();

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        this.fullName = lastName + " " + firstName;

        this.employeeNames.addFirst(fullName);

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public static LinkedList<String> getEmployeeNames(){

        return employeeNames;
    }

    public static void downSize(int n){
        ListIterator<String> employeeIterator = employeeNames.listIterator();

        int i = 0;
        while(employeeIterator.hasNext()){

                employeeIterator.next();

                i++;

                if(i == n){
                employeeIterator.remove();}

        }
    }

}

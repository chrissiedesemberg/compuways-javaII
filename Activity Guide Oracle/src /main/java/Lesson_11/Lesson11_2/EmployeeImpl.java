package Lesson_11.Lesson11_2;

import java.util.ArrayList;
import java.util.List;


public class EmployeeImpl {

    // not thread-safe
    private static Employee[] employeeArray = new Employee[10];

    // package level access
    EmployeeImpl()  {
    }

    public void add(Employee emp) throws InvalidOperationException {
            if( employeeArray[emp.getId()] != null){
                throw new InvalidOperationException("Can't add employee, employee "
                        + "id " + emp.getId() + " exists.");
            }
            try {
                employeeArray[emp.getId()] = emp;
            }
            catch (ArrayIndexOutOfBoundsException aioobe ){
                throw new InvalidOperationException("Can't add employee, id "
                        + "must be less than " + employeeArray.length);
            }
            }

    public void delete(int id) throws InvalidOperationException{
            if (employeeArray[id] == null ){
                 throw new InvalidOperationException("Can't delete employee, employee "
                        + "id " + id + " does not exist.");
            }
            try {
                employeeArray[id] = null;
            }
            catch (ArrayIndexOutOfBoundsException aioobe ){
                throw new InvalidOperationException("Can't delete employee, id "
                        + "must be less than " + employeeArray.length);
            }
    }

    public Employee findById(int id)  throws InvalidOperationException 
    {
        try {
            return employeeArray[id];
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            throw new InvalidOperationException("Cannot find employee, " +  aioobe); }
    
    }
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }

}

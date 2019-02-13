class EmployeeCount {
    //Encapsulation via private setters. 
    //Or have getter and setter methods in the class to set and get values from the fields. 
    private int numOfEmployees = 0;
    public void setNoOfEmployees(int count) {
        numOfEmployees = count;
    }
    public double getNoOfEmployees() {
        return numOfEmployees;
    }
}
public class EncapsulationExample {
    public static void main (String args[]) {
     EmployeeCount obj = new EmployeeCount();
     obj.setNoOfEmployees(5613);
     System.out.println("No Of Employees: " + (int)obj.getNoOfEmployees());   
    }
}

//benefit of encapsulation: 
    //can change implementation details of the class, but won't affect the classes using it. 
    
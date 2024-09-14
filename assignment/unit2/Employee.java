 package assignment.unit2;

class Employee {
    private int id;
    private int salary;
    private String name;

    public String getFormattedSalary() {
        return String.format("%.2f", salary);
    }

    
}
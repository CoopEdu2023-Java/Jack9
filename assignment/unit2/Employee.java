
class Employee {
    @SuppressWarnings("unused")
    private int id;
    private int salary;
    @SuppressWarnings("unused")
    private String name;

    public String getFormattedSalary() {
        return String.format("%.2f", salary);
    }

    
}
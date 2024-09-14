abstract class Entere{
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Entere{
    @Override
    public double calculateSalary(){
        return 0;
    }
    @Override
    public void displayInfo(){}
}
class Programmer extends Entere{
    @Override
    public double calculateSalary(){
        return 0;
    }
    @Override
    public void displayInfo(){}
}
abstract class Animal{
    abstract void makeSound();
}
class Lion extends Animal{
    @Override
    void makeSound(){
        System.out.println("Lion");
    }
}
class Tiger extends Animal{
    @Override
    void makeSound(){
        System.out.println("Tiger");
    }
}

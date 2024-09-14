public class animal {
    // makeSound 方法
    public void makeSound() {
        System.out.println("Some sound...");
    }
}

// 子类 Cat
class Cat extends animal {
    // 重写 makeSound 方法
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    // 测试方法
    public static void main(String[] args) {
        animal myAnimal = new animal(); // 创建 Animal 对象
        myAnimal.makeSound(); // 调用 Animal 的 makeSound 方法

        Cat myCat = new Cat(); // 创建 Cat 对象
        myCat.makeSound(); // 调用 Cat 的 makeSound 方法
    }
}

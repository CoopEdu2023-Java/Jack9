
public class Person {
    // 实例变量
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private int age;
    @SuppressWarnings("unused")
    private String country;

    // 无参数构造函数
    public Person() {
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

}

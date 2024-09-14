
// 父类 Shape
public class Shape {
    // getArea 方法，返回面积，默认为0
    public double getArea() {
        return 0;
    }
}

// 子类 Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // 构造函数
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 重写 getArea 方法，计算矩形的面积
    @Override
    public double getArea() {
        return width * height;
    }


}


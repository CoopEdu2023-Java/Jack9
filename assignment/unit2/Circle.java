
public class Circle {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }

    // 重载的计算面积方法，接受一个比率参数
    public double calculateArea(int ratio) {
        return ratio * calculateArea();
    }

    // 计算周长的方法
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}

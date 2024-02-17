package cn.oop;

/**
 * @author : Tongqh
 * @Description: TODO 手机类
 * @date Date : 2024-02-08
 */
public class Phone {
    private String name;
    private double price;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(String concant){
        System.out.println("打电话给"+concant);
    }
}

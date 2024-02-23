package cn.oop;

/**
 * @author : Tongqh
 * @Description: TODO 生成构造器
 * @date Date : 2024-02-08
 */
public class Phone2 {
    private String name;
    private double price;
    private String color;

    //存在有参构造器一定要有无参构造器
    public Phone2() {
    }

    public Phone2(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void call(String concant){
        System.out.println("打电话给"+concant);
    }
}

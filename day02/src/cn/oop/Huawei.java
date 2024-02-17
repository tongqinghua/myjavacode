package cn.oop;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-08
 */
public class Huawei {
    public static void main(String[] args) {
        Phone huawei = new Phone();
        huawei.setName("华为");
        huawei.setPrice(8999);
        huawei.setColor("blank");
        System.out.println(huawei.getName());
        System.out.println(huawei.getPrice());
        System.out.println(huawei.getColor());
        huawei.call("遥遥领先");
    }
}

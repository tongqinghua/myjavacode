package cn.LambdaDemo;

/**
 * @author : Tongqh
 * @Description: TODO lamdba表达式实例
 * @date Date : 2024-03-13
 */
public class AnimalDemo {
    public static void main(String[] args) {
        /*
        调用show方法1：创建子类实现接口方法，再new对象调用
         */

        /*
        调用show方法2：使用匿名内部类重写方法
         */
        show(new Animal() {
            @Override
            public void eat() {
                System.out.println("吃饭了");
            }
        });

        /*
        调用show方法3：lambda表达式
         */
        show(()->System.out.println("干饭了"));

    }

    public static void show(Animal a){
        a.eat();
    }
}

package cn.collectDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-07
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> s1 = new HashMap<>();
        s1.put("id","1");
        s1.put("name","tom");
        s1.put("age","13");
        System.out.println(s1);

        //HashMap获取值
        String name = s1.get("name");
        System.out.println(name);

        String sex = s1.get("sex");
        System.out.println(sex);

        String orDefault = s1.getOrDefault("sex", "性别保密");
        System.out.println(orDefault);

        //获取hashmap的所有k
        Set<String> allkey = s1.keySet();
        System.out.println(allkey);

        //获取hashmap的所有v
        Collection<String> allvalue = s1.values();
        System.out.println(allvalue);

        //遍历hashmap：通过遍历hashmap包含的所有key，在调用get方法得出v
        for (String key:allkey){
            System.out.println(key+"------>"+s1.get(key));
        }


    }
}

package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: cy
 * @Description:
 * @Date 14:08 2020/11/23
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();
        //1.添加元素
        collection.add("apple");
        collection.add("organe");
        collection.add("lemon");
        System.out.println(collection);
        System.out.println(collection.size());
        //2.删除元素
//        collection.remove("organe");
//        collection.clear();
        //3.遍历元素
        //3.1 使用foreach
        for (Object o:collection
             ) {
            System.out.println(o);
        }
        //3.2 使用迭代器
        //hasNext() 有没有下一个元素
        //next()  获取下一个元素
        //remove  删除当前元素
        Iterator it =  collection.iterator();
        while (it.hasNext()){
           Object o =  it.next();
            System.out.println(o);
        }
        //4.判断
        System.out.println(collection.contains("banana"));
        System.out.println(collection.isEmpty());
    }
}

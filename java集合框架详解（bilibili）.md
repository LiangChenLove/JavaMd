#### java集合框架详解（bilibili）

------

1. 集合

   * 概念：对象的容器，定义了对多个对象进行操作的常用方法。可实现数组的功能 

   * 与数组区别

     ​	1）数组长度固定，集合长度不固定

     ​	2）数据可以存储基本类型和引用类型，集合只能存储引用类型 

	* 位置：java.util.* 

2. Collection 接口

   ​		-- interface  Collection

   ​		-- Interface  List                    --   Interface Set

   ​        -- Class ArrayList 				 --  Class HashSet 

   ​		-- Class LinkedList				-- Interface SortedSet

   ​																	-- Class TreeSet

   * collection 是根接口，代表一组对象，称为“集合”

   * List 作为接口，特点有：有序、有下标、元素可重复

   * Set 作为接口，特点有：无序、无下标、元素不能重复

   * collection,list,set 作为接口，不能直接使用，而是使用下面的实现类

   * ArrayList 数组列表  LinkedList 链表

   * 方法：
     	1. Boolean add(Object obj) //添加一个对象
      	2. Boolean addAll(Collection c) //将一个集合中的所有对象添加到此集合中
      	3. void clear()//清空集合
      	4. boolean contains(Object o)//检查此集合是否包含o对象
      	5. boolean equals(Object o)//比较2集合是否相等
      	6. boolean isEmpty()//判断此集合是否为空
      	7. boolean remove(Object o)//移除此集合中的o对象
      	8. int size()//返回此集合中的元素个数
      	9. Object[] toArray()  //将集合转换成数组
      	10. Iterator iteartor() // 对集合进行迭代(遍历) （迭代器）
      	11. boolean removeAll(Collection c)//移除两个集合的交集
      	12. boolean retainAll(Collection c)//保留两个集合的交集
      
   * demo

      ```java
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
      //        collection.clear();//并没有真正删除元素，只是删除了集合中存储的指针而已
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
      
      ```

      

3. List接口和实现类

4. 泛型和工具类

5. Set接口和实现类

6. Map接口和实现类
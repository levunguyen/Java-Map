package _31_map;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    public static void main(String[] args) {
        /*
        implementation của Map như sau:
            HashMap
            Hashtable
            LinkedHashMap
            TreeMap
         */
        Map<Integer, String> myMap = new HashMap<>();
//      put(): thêm phần tử.
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
//      get(): lấy ra giá trị của key.
        System.out.println(myMap.get(2));
//      putAll(): thêm phần tử từ map khác.
        Map<Integer, String> myMap2 = new HashMap<>();
        myMap.put(4, "four");
        myMap.put(5, "five");
        myMap.putAll(myMap2);
//      remove(): xóa phần tử khỏi map.
        myMap.remove(4);
//      clear(): xóa hết phần tử của map.
        myMap.clear();
//      size(): trả về kích thước của map.
        System.out.println(myMap.size());
//      duyệt các phần tử trong map.
        for(Integer key: myMap.keySet()){
            System.out.println(myMap.get(key));
        }
//      containsKey(): kiểm tra map có chứa key đã tồn tại.
        System.out.println(myMap.containsKey(5));
//      containsValue(): kiểm tra map có chứa value đã tồn tại.
        System.out.println(myMap.containsValue("six"));
    }
}

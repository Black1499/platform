package com.nf147.platform.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author DZ
 * // TODO: 2019/3/10
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1","data1");
        map.put("key2","data2");
        map.put("key3","data3");

        //第一种方式
        System.out.println("通过Map.keySet()，遍历key，value");
        for (String key :map.keySet()) {
            System.out.println("key：" + key + "，value:" + map.get(key));
        }

        //第二种方式
        System.out.println("通过map.entrySet().iterator()，遍历key，value");
        Iterator<Map.Entry<String,String>> it =  map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> next  = it.next();
            System.out.println("key：" + next.getKey() + "，value:" + next.getValue());
        }

        //第三种方式
        System.out.println("通过Map.entrySet()，遍历key，value；推荐使用尤其是大容量时");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key：" + entry.getKey() + "，value:" + entry.getValue());
        }

        //第四种方式
        System.out.println("通过Map.values()，遍历所有的Value，但不能遍历Key");
        for(String v : map.values()){
            System.out.println("所有的Value：" + v);
        }

    }
}

package javaDataframe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    static void main() {
        Map<String , String> mapping  = new HashMap<>();
        mapping.put("in","India");
        System.out.println(mapping);
        mapping.put("in","India");
        mapping.put("en","England");
        mapping.put("us","United States");
        System.out.println(mapping);
        Map<String,String> tab = new HashMap<>();
        tab.put("br","Brazil");
        System.out.println("Before : "+tab );
        tab.putAll(mapping);
        System.out.println("Before : "+tab );
        tab.remove("en");
        System.out.println(tab);
        System.out.println(tab.get("br"));
        System.out.println(tab.getOrDefault("usa","NONE"));
        System.out.println(tab.size());
        System.out.println(tab.containsValue("ef"));
        System.out.println(tab.containsValue("India"));
        tab.replace("in","Indoniasia");
        System.out.println(tab);
        Set<String> set = tab.keySet();
        System.out.println(set);
        Collection<String> value = tab.values();
        System.out.println(value);
        Set<Map.Entry<String,String>> enrtyValue = tab.entrySet();
        System.out.println(enrtyValue);
    }
}

package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    public Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> resultMap = new HashMap<>();
        for(String item : collection1) {
            if(!resultMap.containsKey(item)) {
                resultMap.put(item, 1);
            } else {
                resultMap.replace(item, resultMap.get(item) + 1);
            }
        }

        return resultMap;
    }
}

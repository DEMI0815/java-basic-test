package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.section3.PracticeD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> resultMap = new HashMap<>();
        sameElement(collection1, resultMap);

        return resultMap;
    }

    public static void sameElement(List<String> list, Map<String, Integer> resultMap) {
        for(String item : list) {
            if(item.contains("-")) {
                String key = item.split("-")[0];
                Integer value = Integer.valueOf(item.split("-")[1]);
                if(!resultMap.containsKey(key)){
                    resultMap.put(key, value);
                } else {
                    resultMap.replace(key, resultMap.get(key) + value);
                }
            }else {
                if (!resultMap.containsKey(item)) {
                    resultMap.put(item, 1);
                } else {
                    resultMap.replace(item, resultMap.get(item) + 1);
                }
            }
        }
    }
}

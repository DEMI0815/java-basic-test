package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;
import cn.school.thoughtworks.section2.PracticeB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> resultMap = sameElementMap(collectionA);
        List<String> collectionBList = collectionB.get("value");

        for (String item : resultMap.keySet()) {
            if (collectionBList.contains(item)) {
                resultMap.replace(item, everyThreeMinusOne(item, resultMap));
            }
        }

        return resultMap;
    }

    private Map<String, Integer> sameElementMap(List<String> list) {
        Map<String, Integer> resultMap = new HashMap<>();
        PracticeB.sameElement(list, resultMap);
        return resultMap;
    }

    private Integer everyThreeMinusOne(String key, Map<String, Integer> collection) {
        int value = collection.get(key);
        return value - value / 3;
    }
}

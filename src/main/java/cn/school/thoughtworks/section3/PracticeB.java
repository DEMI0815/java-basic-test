package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> resultCollection = collectionA;
        List<String> collectionBList = collectionB.get("value");
        for (String item : resultCollection.keySet()) {
            if (collectionBList.contains(item)) {
                resultCollection.replace(item, everyThreeMinusOne(item, resultCollection));
            }
        }

        return resultCollection;
    }

    private Integer everyThreeMinusOne(String key, Map<String, Integer> collection) {
        int value = collection.get(key);
        return value - value / 3;
    }
}

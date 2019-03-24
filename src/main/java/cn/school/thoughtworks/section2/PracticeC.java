package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    private Map<String, Integer> resultMap = new HashMap<>();
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        for (String item : collection1) {
            if (item.contains("-"))
                splitUtil(item, "-");
            else if (item.contains(":"))
                splitUtil(item, ":");
            else if (item.contains("[") && item.contains("]")) {
                String tempItem  = item.substring(0, item.length()-1);
                splitUtil(tempItem, "\\[");
            } else {
                if (!resultMap.containsKey(item)) {
                    resultMap.put(item, 1);
                } else {
                    resultMap.replace(item, resultMap.get(item) + 1);
                }
            }

        }
        return resultMap;
    }

    private void splitUtil(String item, String separator) {
        String key = item.split(separator)[0];
        Integer value = Integer.valueOf(item.split(separator)[1]);
        if(!resultMap.containsKey(key)){
            resultMap.put(key, value);
        } else {
            resultMap.replace(key, resultMap.get(key) + value);
        }
    }
}

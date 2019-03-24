package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> resultList = new ArrayList<>();
        for (List<String> collection2List : collection2) {
            resultList.addAll(collection1.stream().filter(collection2List::contains).collect(Collectors.toList()));
        }
        resultList = new ArrayList<>(new LinkedHashSet<>(resultList));
        return resultList;
    }
}

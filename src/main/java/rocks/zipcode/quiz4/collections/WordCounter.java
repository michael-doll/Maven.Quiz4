package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    List<String> strings;
    public WordCounter(String... strings) {
       this.strings = Arrays.asList(strings);
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String,Integer> countMap = new HashMap<>();
        for(String string : strings) {
            if (!countMap.containsKey(string)){
                countMap.put(string,1);
            }else{
                countMap.put(string,countMap.get(string)+1);
            }
        }
        return countMap;
    }
}

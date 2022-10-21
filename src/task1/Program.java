package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static List<Object> getIntegersFromList(final List<Object> list){
        return list.stream().filter(s->s instanceof Integer).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b')));
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b',0,15)));
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b',"aasf","1","123",231)));
    }
}

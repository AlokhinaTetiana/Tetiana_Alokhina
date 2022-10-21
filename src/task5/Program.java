package task5;

import task5.Friend;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Program {
    public static String meeting(String str) {
        return Arrays.stream(str.split(";"))
                .map(String::toUpperCase).map(Friend::new)
                .sorted(Comparator.comparing(Friend::getLastName)
                        .thenComparing(Friend::getFirstName))
                .map(Friend::toString)
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }
}

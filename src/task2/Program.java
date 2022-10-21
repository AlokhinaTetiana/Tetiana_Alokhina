package task2;

public class Program {
    public static Character first_non_repeating_letter(String str){
        return str.chars()
                .mapToObj(x->(char) x)
                .filter(x->str.chars().mapToObj(s->(char) s)
                        .filter(s->x==Character.toLowerCase(s)||x==Character.toUpperCase(s))
                        .count()==1)
                .findFirst().orElse(' ');
    }
    public static void main(String[] args) {
        System.out.println(first_non_repeating_letter("stress"));
        System.out.println(first_non_repeating_letter("sTreSS"));
        System.out.println(first_non_repeating_letter("Cucumber"));
    }
}

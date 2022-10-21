package task4;

import java.util.Arrays;

public class Program {
    public static long count_pairs(int target, int[] arr){
        return Arrays.stream(arr)
                .mapToLong(el1-> Arrays.stream(arr).filter(el2->(el1+el2==target)).count())
                .sum()/2;
    }
    public static int count_pairs_for(int target, int[] arr){
        int n=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target) n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int target =5;
        int[] array={1, 3, 6, 2, 2, 0, 4, 5};
        System.out.println(count_pairs(target,array));
        System.out.println(count_pairs_for(target,array));
    }
}

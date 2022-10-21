package task3;

public class Program {
    public static int digital_root(int number){
        while(Integer.toString(number).length()!=1){
            int sum=0;
            int t = Integer.toString(number).length();
            for(;t>0;t--){
                int r=(int)Math.pow(10,t-1);
                int a=number/r;
                sum=sum+a;
                number-=a*Math.pow(10,(t-1));
            }
            System.out.println("->"+sum);
            number=sum;
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println("result is: "+digital_root(942)+"\n");
        System.out.println("result is: "+digital_root(493193));
    }
}

import java.util.Scanner;
public class Way_too_long_words {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String a = sc.next();
            if(a.length() > 10){
                System.out.print(a.charAt(0));
                System.out.print(a.length()-2);
                System.out.print(a.charAt(a.length()-1));
            }else
                System.out.println(a);
            System.out.println("");
        }
    }
}

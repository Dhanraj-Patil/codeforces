import java.util.Scanner;
public class Team {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int count = 0;
            for(int j=0;j<3;j++){
                int n = sc.nextInt();
                if(n == 1)
                    count++;
            }
            if(count >= 2)
                ++c;
        }
        System.out.println(c);
    }
}

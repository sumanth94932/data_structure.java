import java.util.*;
class iterativensum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=0;
        System.out.println("start");
        for(int i=0;i<=n;i++){
            temp+=i;
                
                System.out.println("1 + 2 + ... + " + i + " = " + temp);
            

        }

    }
}
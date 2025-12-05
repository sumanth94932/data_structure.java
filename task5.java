public class task5 {
    public static void main(String[] args) {
        String str="missippi";
        String res=" ";
        for(int i=0;i<str.length();i++){
            if(i>0 && str.charAt(i)==str.charAt(i-1))
            {
                continue;
            }
            res=res+str.charAt(i);
        }
        System.out.println(res);
    }
    
}

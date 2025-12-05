public class strings {
    public static void main(String[] args) {
        String str="abcdacbababcababc";
        String target="abc";
        int n=str.length();
        int m=target.length();
        for(int i=0;i<n-m;i++){
            int j=0;
            while(j<m && str.charAt(i+j)==target.charAt(j)){
                j++;
            }
            if(j==0){
                System.out.println("the index of:"+i);
            }
        }
    }
    
}

import java.util.Arrays;
class SecLarge {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int max=a[0];
        int SecMax=-1;
        //for first max
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            {
                max=a[i];
            }
          }
        for (int i=0;i<a.length;i++){
            if (a[i]!=max){
                if(SecMax==-1||a[i]>SecMax){
                    SecMax=a[i];
                }

            }
        }
        System.out.println(max);
        System.out.println(SecMax);
    }    
}

public class ArrMaxMin {
    public static void main(String[] args) {
        int[]a={8,0,3,4,-3,0};
        maxmin(a);
    }
    public static void maxmin(int[]a){
        if (a.length==0) {
            System.out.println("The given array is empty--");
            return;
        }
        int max=a[0],min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("Max :"+max+": Min :"+min);
    }
}

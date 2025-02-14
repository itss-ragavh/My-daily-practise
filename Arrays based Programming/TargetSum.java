public class TargetSum {
    public static void main(String[] args) {
        int[]a={2,3,7,8,4,2};
        solve(a,10);
    }
    public static void solve(int[]a,int target){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]+a[j]==target) {
                    System.out.print(a[i]+"+"+a[j]+ "="+target+"    ");
                }
            }
        }
    }
}

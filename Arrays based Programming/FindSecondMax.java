import java.util.Arrays;
class  FindSecondMax
{
	public static void main(String[] args) 
	{
		System.out.println("\nThe Given Array is:");
		int[]a={1,3,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		int res=secMax(a);
		System.out.println("\n\tThe Second largest Element in Array is: "+res);
	}
	public static int secMax(int[]nums)
	{
		if (nums.length==0) {
			return -1;
		}
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>max){
				secondMax=max;
				max=nums[i];
			}
			else if (nums[i]<max && nums[i]>secondMax) {
				secondMax=nums[i];
			}
		}
		return secondMax;
	}
}

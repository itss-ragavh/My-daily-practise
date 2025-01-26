import java.util.Arrays;
public class SingleNumber {
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
       for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++;  // Skip the next element since it is the same
            }
       }
        return nums[nums.length - 1];
    }

    public static void main(String[]args){
        int[]nums1={2,2,1};
        int[]nums2={4,1,2,1,2};
        int[]nums3={1};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }
}
public class RemoveElementOptimizedApproch {

   public static int removeElement(int[] nums, int x) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != x) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
       public static void main(String[] args) {
           int[] nums = {3, 2, 2, 3, 4, 3};
        int x = 3;
        int newLen = removeElement(nums, x);
        System.out.println("New length = " + newLen);
       }
}
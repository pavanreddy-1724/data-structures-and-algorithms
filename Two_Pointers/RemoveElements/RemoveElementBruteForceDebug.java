public class RemoveElementBruteForceDebug {
    public static int removeElement(int[] nums, int x) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i] == x){
                for(int j = i; j < n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            } else{
                i++;
            }
        }
        return n;  
    }
    public static void main(String[] args) {
         int[] nums = {3, 2, 2, 3, 4, 3};
        int x = 3;
        int newLen = removeElement(nums, x);
        System.out.println("New length = " + newLen);
    }
}

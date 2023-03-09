
public class class3 {
	
	 /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public static int searchInsert(int[] nums, int target) {
    	if (nums.length == 1) {
    		if (nums[0] > target) {
    			return 0;
    		} else {
    			return 1;
    		}
    	} else {
    	 for (int i = 0; i < nums.length - 1; i++) {
    		 System.out.println(i);
    		 if (target > nums[i] && target < nums[i + 1]) {
    			
                 return i + 1;
             } 
//             else if (nums[i]> target) {
//                 return i;  
//             }
         }
    	}
         return nums.length;
    }
    
    public static void main(String[] args) {
//    	 int[] nums = {1, 3, 5, 6};
//         int target = 4;
////         int[] nums = {1, 3, 5, 6};
////         int target = 2;    	
////    	int[] array = new int[] {1,3,5,6};
////    	int target = 7;
////    	  int[] nums = {2};
////          int target = 1;
          int[] nums = {1, 3, 5, 6, 8};
         int target = 7;
    	
//		System.out.println(searchInsert(nums, target));
		searchInsert(nums, target);
	}
}
public class Main {
    public static boolean containsDuplicate(int nums[]){
        for(int i =0; i<nums.length; ++i){
            for(int j =0; j<i; ++j){
                if(nums[i]==nums[j]) {
                    System.out.println("Array contains duplicates");
                    return true;
                }

            }
        }
        System.out.println("Array doesn't contain duplicates");
        return false;
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,1,2,3};
        System.out.println(containsDuplicate(nums));
    }
}

public class DuplicateFinder {

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Move slow and fast pointers to find intersection
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Move slow to the start and continue until they meet
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(array);
        System.out.println("Duplicate element: " + duplicate);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {

        // Store all numbers in a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check every number
        for (int num : set) {

            // Start a sequence only if there is no previous number
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Keep extending the sequence
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
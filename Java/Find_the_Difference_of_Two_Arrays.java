class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = convertToSet(nums1);
        Set<Integer> set2 = convertToSet(nums2);

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> uniqueToNums1 = new ArrayList<>();
        List<Integer> uniqueToNums2 = new ArrayList<>();

        for (int value : set1) {
            if (!set2.contains(value)) {
                uniqueToNums1.add(value);
            }
        }

        for (int value : set2) {
            if (!set1.contains(value)) {
                uniqueToNums2.add(value);
            }
        }

        answer.add(uniqueToNums1);
        answer.add(uniqueToNums2);
        return answer;
    }

    private Set<Integer> convertToSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value : nums) {
            set.add(value);
        }
        return set;
    }
}

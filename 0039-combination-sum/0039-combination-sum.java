class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index == candidates.length) return;
        current.add(candidates[index]);
        backtrack(candidates, index, target - candidates[index], current, res);
        current.remove(current.size() - 1);

        backtrack(candidates, index + 1, target, current, res);
    }
}

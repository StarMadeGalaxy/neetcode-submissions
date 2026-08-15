class Solution {
    public boolean isAnagram(String s, String t) {
        char[] as = s.toCharArray();
        char[] at = t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);
        return Arrays.toString(as).equals(Arrays.toString(at));
    }
}

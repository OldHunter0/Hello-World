package leetcode.editor;

class Solution {

    public int firstUniqChar1(String s) {
        int[] map=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            int index=c-'a';
            map[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            int index1=c-'a';
            if(map[index1]==1){
                return i;
            }
        }
        return -1;
    }
}
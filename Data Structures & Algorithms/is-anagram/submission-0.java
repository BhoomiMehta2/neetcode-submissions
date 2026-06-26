class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1= new HashMap<>();
        for(char i:s.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        HashMap<Character,Integer> map2= new HashMap<>();
        for(char a:t.toCharArray()){
            map2.put(a,map2.getOrDefault(a,0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }
        return false;


    }
}

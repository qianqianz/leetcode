public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.containsKey(key)) {
                ArrayList<String> temp = map.get(key);
                temp.add(s);
                map.put(key, temp);
            }else{
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(s);
                map.put(key,temp);
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        for(ArrayList<String> temp : map.values()) {
            if(temp.size() > 1){
                result.addAll(temp);
            }
        }
        return result;
    }
}
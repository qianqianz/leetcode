public class Solution {
    static Map<Character, String> letterMap = new HashMap<Character, String>();
    static{
        letterMap.put('1', "");
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
    }
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<String>();
        char[] element = new char[digits.length()];
        combination(result, 0, element, digits);
        return result;
    }
    public static void combination(ArrayList<String> result, int index, char[] element, String digits) {
        if(index == digits.length()) {
            result.add(new String(element));
            return ;
        }
        else{
            char temp = digits.charAt(index);
            String letters = letterMap.get(temp);
            for(int i = 0; i < letters.length(); i++) {
                element[index] = letters.charAt(i);
                combination(result, index + 1, element, digits);
            }
        }
    }
}
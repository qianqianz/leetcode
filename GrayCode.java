public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        if(n == 0) {
            return result;
        }
        result.add(1);
        if(n == 1) {
            return result;
        }
        for(int i = 1; i < n; i++) {
            int temp = 1;
            for(int j = 0; j < i; j++) {
                temp *=2;
            }
            for(int j = 0; j < temp; j++) {
                result.add(temp + result.get(temp-1-j));
            }
        }
        return result;
    }
}
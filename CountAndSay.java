public class Solution {
    public String countAndSay(int n) {
        if( n == 0) return "1";
        StringBuilder s = new StringBuilder();
        s.append(1);
        return calValue(s,n).toString();
    }
    public static StringBuilder calValue(StringBuilder n, int order){
        if(order == 1) return n;
        else{
            StringBuilder result = new StringBuilder();
            int length = n.length();
            char former = n.charAt(0);
            int counter = 1;
            for(int i = 1; i < length ; i++) {
                if(n.charAt(i) == former) {
                    counter ++;
                }else{
                    result.append(counter);
                    result.append(former);
                    former = n.charAt(i);
                    counter = 1;
                }
            }
            result.append(counter);
            result.append(former);
            return calValue(result, order-1);
        }
    }
}
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<Integer>();
        int result = 0;
        for(int i = 0; i < tokens.length; i ++) {
            int first = 0;
            int second = 0;
            if(tokens[i].equals("+")) {
                first = numbers.pop();
                second = numbers.pop();
                numbers.push(first + second);
            }else if(tokens[i].equals("*")) {
                first = numbers.pop();
                second = numbers.pop();
                numbers.push(first * second);
            }else if(tokens[i].equals("/")) {
                first = numbers.pop();
                second = numbers.pop();
                numbers.push(second/first);
            }else if(tokens[i].equals("-")) {
                first = numbers.pop();
                second = numbers.pop();
                numbers.push(second - first);
            }else{
                numbers.push(Integer.valueOf(tokens[i]));
            }
        }
        return numbers.pop();
    }
}
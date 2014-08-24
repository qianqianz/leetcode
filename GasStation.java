public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        int total = 0;
        for(int i = 0; i < gas.length; i++) {
            int temp = gas[i] - cost[i];
            total += temp;
            if(temp < min){
                min = temp;
                index = i+1;
            }
            if(temp == min && index == i) {
                index = i+1;
            }
        }
        return total>=0?(index%gas.length):-1;
    }
}
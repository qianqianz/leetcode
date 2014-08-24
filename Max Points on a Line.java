/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        int len = points.length;
        int max = 0;
        if(len <= 2)    return len;
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        for(int i = 0; i < len-1; i++) {
            int count = 0;
            map.clear();
            for(int j = 0; j < len; j++) {
                if(i != j)
                if(points[i].x == points[j].x && points[i].y == points[j].y) {
                    count ++;
                }
            }
            for(int j = 0; j < len; j++) {
                if(i != j){
                    double ratio = 0;
                    if(points[i].x != points[j].x || points[i].y != points[j].y) {
                        if(points[i].x == points[j].x){
                            ratio = Double.MAX_VALUE;
                        }else{
                            ratio = (double) (points[i].y - points[j].y) / (points[i].x - points[j].x);
                        }
                        if(map.containsKey(ratio)){
                            map.put(ratio, map.get(ratio)+1);
                        }else{
                            map.put(ratio, 2);
                        }
                    }
                }
            }
            if(map.isEmpty()) {
                max = Math.max(max, count+1);
            }else{
                for(int temp : map.values()) {
                    max = Math.max(max, temp + count);
                }
            }
        }
        return max;
    }
}
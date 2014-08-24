/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals.size() < 2) return intervals;
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start - b.start;
            }
        });
        ArrayList<Interval> result = new ArrayList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i ++ ) {
            Interval temp = intervals.get(i);
            if(temp.start > end) {
                result.add(new Interval(start, end));
                start = temp.start;
                end = temp.end;
            }else if(temp.start >= start && temp.end > end){
                end = temp.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
}
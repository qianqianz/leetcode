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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int insert_begin = newInterval.start;
        int insert_end = newInterval.end;
        List<Interval> result = new ArrayList<Interval>();
        for(int i = 0; i < intervals.size(); i++) {
            int begin = intervals.get(i).start;
            int end = intervals.get(i).end;
            if(insert_end < begin){
                result.add(new Interval(insert_begin, insert_end));
                insert_begin = begin;
                insert_end = end;
            }else if(insert_begin > end){
                result.add(intervals.get(i));
            }else if(insert_begin >= begin && insert_end<= end){
                return intervals;
            }else{
                insert_begin = insert_begin< begin?insert_begin: begin;
                insert_end = insert_end > end?insert_end: end;
            }
        }
        result.add(new Interval(insert_begin, insert_end));
        return result;
    }
}
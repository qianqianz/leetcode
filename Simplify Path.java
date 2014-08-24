public class Solution {
    public String simplifyPath(String path) {
        Stack<String> p = new Stack<String>();
        String[] s = path.split("/");
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("..")){
                if(!p.isEmpty()) {
                    p.pop();
                }
            }else if(!s[i].equals(".") && !s[i].equals("/") && !s[i].equals("")){
                p.push(s[i]);
            }
        }
        String result = "";
        while(!p.isEmpty()){
            result = "/" + p.pop() + result;
        }
        if(result.equals("")) {
            result = "/";
        }
        return result;
    }
}
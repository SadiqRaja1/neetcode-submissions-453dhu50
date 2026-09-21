class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i < str.length()) {
            StringBuilder lastIndHelp = new StringBuilder();
            while(str.charAt(i) != '#') {
                lastIndHelp.append(str.charAt(i));
                i++;
            }
            int lastInd = Integer.parseInt(lastIndHelp.toString());
            i++;
            ans.add(str.substring(i,i+lastInd));
            i+=lastInd;
        }
        return ans;
    }
}

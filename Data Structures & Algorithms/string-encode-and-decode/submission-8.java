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
        while(i<str.length()){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) !='#'){
                sb.append(str.charAt(i));
                i++;
            }
            i++;
            int num = Integer.parseInt(sb.toString());
            ans.add(str.substring(i,i+num));
            i+=num;
        }
        return ans;
    }
}

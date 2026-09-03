class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String st : strs){
            sb.append(st.length());
            sb.append(',');
        }
        sb.append('#');
        for(String st : strs){
            sb.append(st);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        System.out.println(str);
        int i=0;
        while(str.charAt(i) != '#'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ','){
                sb.append(str.charAt(i));
                i++;
            }
            num.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;

        for(int n : num){
            ans.add(str.substring(i,i+n));
            i+=n;
        }

        return ans;
    }
}

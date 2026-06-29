class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length());
            sb.append(',');
        }

        sb.append('#');

        for(String s : strs) {
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(str.charAt(i) != '#'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            list.add(Integer.parseInt(sb.toString()));
            i++;
        }

        i++;

        for(int num : list) {
            ans.add(str.substring(i, i+num));
            i+=num;
        }


        return ans;
    }
}

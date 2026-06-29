class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }

        System.out.println(sb);

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j=i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int num = Integer.parseInt(str.substring(i,j));

            i=j+1;

            ans.add(str.substring(i,num+i));
            i +=num;
        }

        return ans;
    }
}

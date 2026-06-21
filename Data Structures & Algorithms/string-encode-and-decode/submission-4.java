class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append(',');
        }

        sb.append('#');

        for(String s : strs){
            sb.append(s);
        }

        System.out.println(sb.toString());

        return sb.toString();
        
    }

    public List<String> decode(String str) {
        List<Integer> nums = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int index = 0;
        while(str.charAt(index) != '#'){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(index) != ','){
                sb.append(str.charAt(index));
                index++;
            }
            nums.add(Integer.parseInt(sb.toString()));
            index++;
        }

        index++;
        for(int num : nums){
            ans.add(str.substring(index, index+num));
            index+=num;
        }

        return ans;
    }
}

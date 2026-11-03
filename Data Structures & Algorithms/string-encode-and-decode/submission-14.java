class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            encoded_string.append(strs.get(i).length());
            encoded_string.append('#');
            encoded_string.append(strs.get(i));
        }

        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            StringBuilder stringSize = new StringBuilder();
            while(str.charAt(i) != '#') {
                stringSize.append(str.charAt(i));
                i++;
            }
            int currSize = Integer.parseInt(stringSize.toString());
            i++;
            ans.add(str.substring(i, i+currSize));
            i+=currSize;
        }
        return ans;
    }
}

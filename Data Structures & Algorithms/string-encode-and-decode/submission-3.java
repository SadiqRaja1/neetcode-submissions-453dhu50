class Solution {

    public String encode(List<String> strs) {
        List<Integer> hash = new ArrayList<>();

        int n = strs.size();

        StringBuilder res = new StringBuilder();

        for(String s : strs) {
            hash.add(s.length());
        }

        for(int num : hash) {
            res.append(num).append(',');
        }

        res.append('#');

        for(String s : strs) {
            res.append(s);
        }

        System.out.println(res);

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        int i = 0;
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

        for(int j : num){
            list.add(str.substring(i, i+j));
            i+=j;
        }
        return list;
    }
}

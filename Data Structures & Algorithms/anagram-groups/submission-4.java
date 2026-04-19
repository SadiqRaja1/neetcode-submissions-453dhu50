class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> helper = new HashMap<>(); 

        for(String s : strs){
            char ch [] = s.toCharArray();
            
            Arrays.sort(ch);

            String st = new String(ch);

            if(!helper.containsKey(st)) {
                List<String> helperSt = new ArrayList<>();
                helperSt.add(s);

                helper.put(st,helperSt);
            }else {
                helper.get(st).add(s);
            }

        }
        return new ArrayList<>(helper.values());
    }
}

class TimeMap {
    class TimeStampedValue{
        int timeStamp;
        String value;

        TimeStampedValue(int timeStamp, String value){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }

    private Map<String, ArrayList<TimeStampedValue>> entriesByKey;

    public TimeMap() {
        entriesByKey = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        entriesByKey.putIfAbsent(key, new ArrayList<>());
        entriesByKey.get(key).add(new TimeStampedValue(timestamp, value));
        
    }
    
    public String get(String key, int timestamp) {
        if(!entriesByKey.containsKey(key)){
            return "";
        }

        ArrayList<TimeStampedValue> list = entriesByKey.get(key);

        int start = 0;
        int end = list.size() -1;
        int matchIndex = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(list.get(mid).timeStamp <= timestamp){
                matchIndex = mid;
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }

        return matchIndex == -1? "" : list.get(matchIndex).value;
    }
}

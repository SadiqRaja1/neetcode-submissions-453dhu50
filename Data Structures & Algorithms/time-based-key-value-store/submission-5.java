class TimeMap {

    class TimeStampedValue {
        int timestamp;
        String value;

        TimeStampedValue(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
    private Map<String, ArrayList<TimeStampedValue>> enquireByKey;
    public TimeMap() {
        enquireByKey = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!enquireByKey.containsKey(key)) {
            enquireByKey.put(key, new ArrayList<>());
        }

        enquireByKey.get(key).add(new TimeStampedValue(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!enquireByKey.containsKey(key)){
            return "";
        }

        ArrayList<TimeStampedValue> list = enquireByKey.get(key);

        int start = 0;
        int end = list.size() - 1;
        int matchInd = -1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(list.get(mid).timestamp <=timestamp){
                matchInd = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return matchInd == -1?"":list.get(matchInd).value;
    }
}
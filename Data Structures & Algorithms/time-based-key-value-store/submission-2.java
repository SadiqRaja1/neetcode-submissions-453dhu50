class TimeMap {

    class TimeStampedValues{
        int timeStamp;
        String value;

        TimeStampedValues(int timeStamp, String value){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }

    private Map<String, ArrayList<TimeStampedValues>> enquireByTime;

    public TimeMap() {
        enquireByTime = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!enquireByTime.containsKey(key)){
            enquireByTime.put(key, new ArrayList<>());
        }
        enquireByTime.get(key).add(new TimeStampedValues(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!enquireByTime.containsKey(key)) {
            return "";
        }

        ArrayList<TimeStampedValues> list = enquireByTime.get(key);

        int start = 0;
        int end = list.size()-1;
        int matchIndex = -1;

        while (start <= end) {
            int mid = start+(end-start)/2;

            if(list.get(mid).timeStamp <= timestamp){
                matchIndex = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return matchIndex == -1?"": list.get(matchIndex).value;
    }
}
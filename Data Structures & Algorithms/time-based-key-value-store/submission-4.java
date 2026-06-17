class TimeMap {
    class TimeStampedValues{
        int timeStamp;
        String values;

        TimeStampedValues(int timeStamp, String values){
            this.timeStamp = timeStamp;
            this.values = values;
        }
    }
    
    private Map<String,ArrayList<TimeStampedValues>> enquiryByKey;
    public TimeMap() {
        enquiryByKey = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!enquiryByKey.containsKey(key)){
            enquiryByKey.put(key, new ArrayList<>());
        }

        enquiryByKey.get(key).add(new TimeStampedValues(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!enquiryByKey.containsKey(key)){
            return "";
        }

        ArrayList<TimeStampedValues> list = enquiryByKey.get(key);

        int start =0;
        int end = list.size()-1;
        int matchInd = -1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(list.get(mid).timeStamp <= timestamp){
                matchInd = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return matchInd == -1? "":list.get(matchInd).values;
    }
}
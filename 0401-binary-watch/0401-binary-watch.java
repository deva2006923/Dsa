class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    String k=(j>9)?String.valueOf(j):"0"+String.valueOf(j);
                    ans.add(i+":"+k);
                }
            }
        }
        return ans;
        
    }
}
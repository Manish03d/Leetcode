class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxSum = 0;
        for(String it : sentences){
            int words= 1;
            for(char i : it.toCharArray()){
                if(i==' ') words++;
            }
            maxSum =Math.max(maxSum,words);
        }
        return maxSum;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        for(int i=0;i<names.length-1;i++){
            for(int j=0;j<names.length-i-1;j++){
                if(height[j+1]>=height[j]){
                    int temp=height[j];
                    height[j]=height[j+1];
                    height[j+1]=temp;
                    String s=names[j];
                    names[j]=names[j+1];
                    names[j+1]=s;
                }
            }
        }
        return names;
    }
}
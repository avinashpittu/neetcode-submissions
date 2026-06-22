class Solution {
    public int[] countBits(int n) {

        int[] res = new int[n+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<32;j++){
                if(((1<<j)&i) !=0){
                    res[i] +=1;
                }
            }
        }
        return res;
        
    }
}

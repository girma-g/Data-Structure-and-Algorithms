


class Solution {
    public int commonFactors(int a, int b) {
        int count1=0,count2=0;
        if(a<=b){
            for(int i=1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    count1++;
                }
            }
        }
        if(b<a){
            for(int i=1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    count2++;
                }
            }
        }
        if(a<=b) {
            return count1;
        }
        return count2;
    }
}
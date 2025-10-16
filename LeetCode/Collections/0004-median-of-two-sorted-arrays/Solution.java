
// Problem: 4. Median of Two Sorted Arrays
// Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] myNums = new int [nums1.length+nums2.length];
        int x=0,y=0,z=0,temp=0;
        for(int i=0;i<nums1.length;i++){
            myNums[x] = nums1[i];
            x++;
        }
        for(int j=nums1.length;j<myNums.length;j++){
            myNums[x] = nums2[y];
            x++;
            y++;
        }
        for(int i=0;i<myNums.length;i++){
            for(int j=i+1;j<myNums.length;j++){
                if(myNums[i]>myNums[j]){
                    temp = myNums[i];
                    myNums[i] = myNums[j];
                    myNums[j] = temp;
                }
            }
        }
        double mid = 0;
        if(myNums.length%2!=0){
            mid =  myNums[myNums.length/2]  ;
        }
        if(myNums.length%2==0){
            z = myNums.length/2;
            mid = (myNums[z-1]+myNums[z]);
            mid  = mid/2;
        }
        return mid;
    }
}
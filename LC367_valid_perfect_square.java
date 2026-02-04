class Solution {
    public boolean isPerfectSquare(int num) {
        int s=0;
        int e=num;
        while(s<=e){
            int mid=s+(e-s)/2;
            long sq=(long)mid * (long)mid;
            if(sq < num){
                s=mid+1;
            }
            else if(sq > num){
                e=mid-1;
            }
            else
            return true;
        }
        return false;
    }
}
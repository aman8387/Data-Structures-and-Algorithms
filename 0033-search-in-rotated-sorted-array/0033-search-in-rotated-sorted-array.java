class Solution {
    public int search(int[] a, int target) {
        int str = 0;
        int end = a.length-1;
        while(str <= end){
            int mid = str+(end-str)/2;
            if(a[mid]==target){
                return mid;
            }
            if(a[str]<=a[mid]){
                if(a[str]<=target && target<=a[mid]){
                    end = mid-1;
                }else{
                    str=mid+1;
                }
            }else{
                if(a[mid]<=target && target<=a[end]){
                    str = mid+1;
                }else{
                    end= mid-1;
                }
            }
            
        }return -1;
       

    }
}
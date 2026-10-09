/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
  
  public int findInMountainArray(int target, MountainArray nums) {
    int peak = findPeak(nums);

    int leftResult =binarySearch(nums,target,0,peak,true);

    if(leftResult !=-1){
      return leftResult;
    }

    return binarySearch(nums,target,peak+1,nums.length()-1,false);

  }

  private int findPeak(MountainArray nums) {

    int start = 0;
    int end = nums.length() - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;

      if (nums.get(mid) < nums.get(mid + 1)) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return start;
  }

  private int binarySearch(MountainArray arr,int target,int start,int end,boolean isAscending){
    while(start<=end){
      int mid=start+(end-start)/2;
      int val=arr.get(mid);

      if(val== target){
        return mid;
      }

      if(isAscending){
        if(val<target){
          start=mid+1;
        }else{
          end=mid-1;
        }
      }else{
        if(val>target){
          start=mid+1;
        }else{
          end= mid-1;
        }
      }
    }
    return -1;

  }

}

/*

find the peak  compare it with target and see if we need to call the assenfing or decending side of the array or not.


*/
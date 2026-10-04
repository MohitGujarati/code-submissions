class Solution {
  public int[] searchRange(int[] nums, int target) {

    int start=findBound(nums,target,true,0);

    if(start==-1){
      return new int[] {-1,-1};
    }

    int end =findBound(nums,target,false,start);

    return new int[] {start,end};

  }

  private int findBound(int[] nums,int target,boolean isfirst,int startIdx){

    int start=startIdx;
    int end =nums.length-1;

    int res=-1;

    while(start<=end){
      int mid=start+(end-start)/2;

      if(nums[mid]==target){
        res=mid;
        if(isfirst){
          end=mid-1;
        }else{
          start=mid+1;
        }
      }else if (nums[mid]<target){
        start=mid+1;
      }else{
        end=mid-1;
      }
    }

    return res;
  }

}
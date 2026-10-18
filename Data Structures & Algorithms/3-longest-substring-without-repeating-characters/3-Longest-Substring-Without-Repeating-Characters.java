class Solution {
    public int lengthOfLongestSubstring(String s) {

      int i =0;
      int j=0;
      int maxLen=0;

      HashMap<Character,Integer>map=new HashMap<>();


      while(j<s.length()){

//add incomming 
        char rightChar=s.charAt(j);
        map.put(rightChar, map.getOrDefault(rightChar,0)+1);

//if all char in map are unique length will be same as current window 
        if(map.size()==j-i+1){
          maxLen=Math.max(maxLen,j-i+1);
          j++;
        }

//if its not remove the the leftcjar and do i++
        else if(map.size()<j-i+1){

          while(map.size()<j-i+1){
            char leftChar =s.charAt(i);
            map.put(leftChar,map.get(leftChar)-1);
//if the left char is 0 remove it
            if(map.get(leftChar)==0){
              map.remove(leftChar);
            }
//move pointer ahead
            i++;
          }
//move this pointer ahead
          j++;
        }
      }
     return maxLen;   
    }
    

}
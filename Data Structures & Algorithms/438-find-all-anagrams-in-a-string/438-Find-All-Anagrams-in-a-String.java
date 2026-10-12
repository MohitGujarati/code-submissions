class Solution {
    public List<Integer> findAnagrams(String s, String p) {

      List <Integer>result =new ArrayList<>();

      if(s.length()<p.length()) return result;

      int[] map =new int[26];
      int count=0;

//populate map with string p
      for(char c :p.toCharArray()){
        if(map[c-'a']==0) count++;
        map[c-'a']++;
      }

      int i=0;
      int j=0;

  

      while(j<s.length()){

        char rightChar=s.charAt(j);
        map[rightChar - 'a']--;

        if(map[rightChar - 'a']==0){
          count--;
        }

        if(j-i+1==p.length()){
          if(count==0){
            result.add(i);
          }

          char leftChar=s.charAt(i);
          if (map[leftChar - 'a']==0){
            count++;
          }

          map[leftChar - 'a']++;

          i++;
        }

        j++;
      }
        return result;
    }
}
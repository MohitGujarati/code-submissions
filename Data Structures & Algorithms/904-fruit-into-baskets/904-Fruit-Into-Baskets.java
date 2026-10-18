class Solution {
    public int totalFruit(int[] fruits) {

      int i =0;
      int j=0;
      int maxFruits=0;

      HashMap<Integer,Integer>map=new HashMap<>();


      while(j<fruits.length){

        int rightChar=fruits[j];
        map.put(rightChar,map.getOrDefault(rightChar,0)+1);

      
      while(map.size()>2){

        int leftFruit=fruits[i];
        map.put(leftFruit,map.get(leftFruit)-1);

        if(map.get(leftFruit)==0){
          map.remove(leftFruit);
        }
        i++;
      }

      maxFruits= Math.max(maxFruits,j-i+1);

      j++;

      }

      return maxFruits;
        
    }
}
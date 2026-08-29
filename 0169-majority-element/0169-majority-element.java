class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num))
                 map.put(num,map.getOrDefault(num,0)+1);
            else
             map.put(num,1);
        }
        int max=0;
        int ans=0;
      for(int num : nums){
           if(map.containsKey(num)){
              max = Math.max(map.get(num),max);
            if(map.get(num)>=max)
                    ans=num;
           }
      }
      return ans;
    }
}
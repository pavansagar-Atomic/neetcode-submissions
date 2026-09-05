class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int psum=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            psum+=nums[i];
            int remove=psum-k;
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return count;        
    }
}
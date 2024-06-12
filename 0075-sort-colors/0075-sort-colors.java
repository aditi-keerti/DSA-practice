class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;int a=0;int b=0;int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
               if(nums[i]==1){
                   a++;
               }else{
                   b++;
               }
            }
            else{
                  nums[j]=0;
                  j++;
            }
        
        }
        while(j<n){
            if(a>0){
                nums[j]=1;
                j++;a--;
            }else if(b>0){
                nums[j]=2;
                j++;b--;
            }
        }

    }
}
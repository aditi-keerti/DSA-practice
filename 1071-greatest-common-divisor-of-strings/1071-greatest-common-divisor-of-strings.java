class Solution {
    public String gcdOfStrings(String str1, String str2) {
         int n=str1.length();int m=str2.length();
        for(int i=Math.min(n,m);i>=1;--i){
            if(valid(str1,str2,i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }
    public static boolean valid(String str1,String str2,int k){
         int n=str1.length();int m=str2.length();
        if(n%k>0||m%k>0){
            return false;
        }
        else{
            String base=str1.substring(0,k);
            return str1.replace(base,"").isEmpty()&&str2.replace(base,"").isEmpty();
        }
    }
}
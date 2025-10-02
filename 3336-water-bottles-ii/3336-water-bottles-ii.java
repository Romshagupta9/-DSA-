class Solution {
    public int maxBottlesDrunk(int num, int ex) {
        int ans=0, emp=0;
        while(num>0){
            ans+=num;
            emp+=num;
            num=0;
            if(emp<ex) break;
            emp-=ex;
            ex+=1;
            num+=1;
            if(num+emp<ex) break;
        }
        return ans+num;
    }
}
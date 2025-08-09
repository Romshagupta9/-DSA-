class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i : asteroids){
            if(st.isEmpty() || i>0){//blind insertion
              st.push(i);
            }
            else{
                while(!st.isEmpty()){
                    int new_i=Math.abs(i);
                    int top=st.peek();
                    if(top<0){
                        st.push(i);
                        break;
                    }
                    else if(new_i<top){
                        break;
                    }
                    else if(new_i==top){
                        st.pop();
                        break;
                    }
                    else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(i);
                            break;
                        }
                    }
                }
            }
        }
        int [] arr= new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        } 
        return arr;
    }
}
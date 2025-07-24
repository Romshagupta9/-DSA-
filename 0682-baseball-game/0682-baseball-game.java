class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
               record.pop();
            }
            else if(operations[i].equals("D")){
                int v=record.peek();
                int d=v*2;
                record.push(d);
            }
            else if(operations[i].equals("+")){
                int a=record.get(record.size()-1);
                int b=record.get(record.size()-2);
                int c=a+b;
                record.push(c);
            }
            else{
            record.push(Integer.parseInt(operations[i]));
        }

        }
        int sum=0;
        for(int i: record){
            sum=sum+i;
        }
        return sum;
    }
}
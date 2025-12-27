class Solution {
    public int mostBooked(int n, int[][] meetings) {
        
        PriorityQueue<Integer> emptyRooms = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            emptyRooms.offer(i);
        }
        PriorityQueue<int []> lastRoomFilled = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0])
                return a[1]-b[1];
            return a[0]-b[0];
    });

        int []cnt = new int[n];

        Arrays.sort(meetings, (a, b) -> {
            if(a[0]==b[0])
                return a[1]-b[1];
            return a[0]-b[0];
        });

        int startTime = meetings[0][0];
        for(int i=0;i<meetings.length;i++){
            
            int start = meetings[i][0], end = meetings[i][1];
            // empty the rooms where meetings are done
            while(!lastRoomFilled.isEmpty() && start>=lastRoomFilled.peek()[0]){
                int []meetingInfo = lastRoomFilled.poll();
                emptyRooms.offer(meetingInfo[1]);
            }


            if(!emptyRooms.isEmpty()){
                int roomNumber = emptyRooms.poll();
                lastRoomFilled.offer(new int[]{end, roomNumber});
                cnt[roomNumber]++;
            }else{
                int []meetingInfo = lastRoomFilled.poll();
                int newEndingTime = meetingInfo[0];
                lastRoomFilled.offer(new int[]{newEndingTime + (end -  start), meetingInfo[1]});
                cnt[meetingInfo[1]]++;
            }
        }

        int ans = 0, mx = 0;
        for(int i=0;i<n;i++){
            if(cnt[i]>mx){
                ans = i;
                mx = cnt[i];
                // System.out.println(mx);
            }
        }
        return ans;
         
    }
}
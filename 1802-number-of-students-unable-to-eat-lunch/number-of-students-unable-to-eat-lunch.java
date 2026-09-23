class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int student:students){
            q.offer(student);
        }

        int i = 0;
        int rotation = 0;
        while(!q.isEmpty()){
            if(q.peek() != sandwiches[i]){
                q.offer(q.poll());
                rotation++;
            }

            else {
                q.poll();
                i++;
                rotation = 0;
            }
            if (rotation == q.size()){
                break;
            }
    }
    return q.size();
    }
}
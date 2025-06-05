import java.util.*;
class MinimumCostRope
{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int arr[] = {4, 3, 2, 6};

        for(int i:arr)
        {
            pq.add(i);
        }

        int result =0;
        while(pq.size() > 1)
        {
            int first = pq.poll();
            int second = pq.poll();
            
            result += (first + second);
            pq.add(first + second);
        }

        System.out.println(result);
    }
}
package DSpracto;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr= {
                {1,4,5,6,},
                {5,2,1},
                {1,2,3,9}
        };
        int maxx = maximumWealth(arr);
        System.out.println(maxx);
    }

    public static int maximumWealth(int[][] accounts){
        //person: row, account:col;
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            //when starting a new col, take new sum of that row
            for (int anInt : ints) {
                sum += anInt;
            }
            //now we've sum of accouunts of the person; check it with overall answer;
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

package practice.leetcode.mySolution;


// https://www.youtube.com/watch?v=deh7UpSRaEY&ab_channel=MissWright
public class PaintFence {

    public static void main(String[] args) {
        int n =3, k=4;
        int numways =   numWaysToPint(n, k);
        System.out.println(numways);
    }


    public static int numWaysToPint(int n, int k){
        if(n==0) return 0;

        if (n==1) return k;

        int same = k * 1;
        int diff = k * (k-1);

        for (int i=3; i<=n; i++){
            int diffTemp = diff;
            // to make 2nd and 3rd diff
            diff = (same * (k-1))   +  (diff * (k-1));

            // to make 2nd and 3rd same;
            same = diffTemp * 1;

        }

        return same + diff;
    }
}

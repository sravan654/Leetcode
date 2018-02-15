package Jewelandstones;

/**
 * Created by apuris on 16/02/18.
 */
public class BruteForce {

    public static int numJewelsInStones(String J, String S){
        int res = 0;
        for (char s:S.toCharArray())
            for (char j:J.toCharArray())
                if (j == s){
                    res++;
                    break;
                }
        return res;
    }

    public static void main(String[] args){
        String S = "aAAbbbbb";
        String J = "aA";
        int noOfJewels = numJewelsInStones(S, J);
        System.out.println(noOfJewels);
    }
}


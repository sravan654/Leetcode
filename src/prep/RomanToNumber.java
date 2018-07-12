package prep;

/**
 * Created by apuris on 09/05/18.
 */
public class RomanToNumber {

    public static void main(String[] args){

        RomanToNumber ob = new RomanToNumber();

        String str = "MCMIV";
        System.out.println("Roman to integer is : " + ob.romanToDecimal(str));
    }

    private int romanToDecimal(String str) {

        int res = 0;

        for(int i=0; i<str.length(); i++){

            int s1 = value(str.charAt(i));

            if(i+1 < str.length()){

                int s2 = value(str.charAt(i+1));

                if(s1 > s2){
                    res = res + s1;
                }
                else {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
                i++;
            }
        }
        return res;
    }

    private int value(char c) {
        if (c == 'I')
            return 1;
        if (c=='V')
            return  5;
        if (c=='X')
            return 10;
        if (c=='L')
            return 50;
        if (c=='C')
            return 100;
        if (c=='D')
            return 500;
        if (c=='M')
            return 1000;
        return -1;
    }

}
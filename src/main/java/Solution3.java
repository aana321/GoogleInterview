public class Solution3 {

    static final int CHAR = 26;

    static boolean isIsoMorphic(String s1, String s2){

        int n = s1.length();
        int m = s2.length();

        if(n != m){

            return false;
        }
        int[] countCharS1 = new int[CHAR];
        int[] countCharS2 = new int[CHAR];

        for(int i = 0; i< n; i++){

            countCharS1[s1.charAt(i) - 'a']++;
            countCharS2[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++){

            if(countCharS1[s1.charAt(i) - 'a'] != countCharS2[s2.charAt(i) - 'a']){

                return false;
            }
        }

        return true;
    }

    public static  void main(String[] args){

        String s1 = "aabc";
        String s2 = "xzyz";

        System.out.println(isIsoMorphic(s1, s2));
    }
}

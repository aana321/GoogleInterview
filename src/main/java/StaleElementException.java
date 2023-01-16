public class StaleElementException {

        public static String rotate(String s, int position){

            String ans = s.substring(position) + s.substring(0, position); //Time Complexity O(n) --> space O(n);
            System.out.println(s.substring(position));
            System.out.println(s.substring(0,position));
            //String ans = "";
            return ans;

        }

        public static void main(String[] args){
            String s = "Walmart";
            int position = 1;

            System.out.println(rotate(s, position));
        }



}


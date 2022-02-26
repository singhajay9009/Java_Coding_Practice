package practice_old;

public class ReverseInteger {

    public static void main(String[] args) {
      //  System.out.println(new ReverseInteger().reverse(534236469));
        System.out.println(new ReverseInteger().reverseInt(-42364690));
    }
    public int reverse(int x) {
        long revNum = 0;
        while(x!=0){
            revNum = revNum * 10 + x % 10;
            x = x/10;
        }

        if(revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE){
            return 0;
        }
        else {
            return (int) revNum;
        }

    }

   /////////// // This is String solution //////////////////////

        public int reverseInt(int x) {
            try {
                String s = new StringBuilder().append(Math.abs(x)).reverse().toString();
                return (x>0) ? Integer.parseInt(s) : -1 * Integer.parseInt(s);
            }
            catch (Exception e){
                return 0;
            }

        }

    ///////////// This is JS solution //////////////////////////////
    /*
            var reverse = function(x) {
            const limit = 2147483648;
            const k = x < 0 ? -1 : 1;
            const n = Number(String(Math.abs(x)).split('').reverse().join(''));
                return n > limit ? 0 : n * k;
            };
        */


        public int reverseInteger(int x){
            // one line solution, but lots of objects are being created. Not good!
            //  return Integer.parseInt(new StringBuilder(x).reverse().toString());

            // 123 -> 321

            return 0;
        }



    }






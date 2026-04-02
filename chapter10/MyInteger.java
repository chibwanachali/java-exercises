public class MyInteger{
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
     }

     public boolean isEven(){
        return (this.value % 2 == 0);
     }
     public boolean isOdd(){
        return (this.value % 2 != 0);
     }
     public boolean isPrime(){
        if (this.value <= 1)
         return false;
        for (int i = 2; i <= Math.sqrt(this.value); i++){
            if (this.value % i == 0){
                return false;
            }
        }
        return true;
     }

     public static boolean isEven(int i){
        return (i % 2 == 0);
     }
     public static boolean isOdd(int i){
        return (i % 2 != 0);
     }
     public static boolean isPrime(int v){
        if (v <= 1)
         return false;
        for (int i = 2; i <= Math.sqrt(v); i++){
            if (v % i == 0){
                return false;
            }
        }
            return true;
     }
     
      // Static methods: for MyInteger
    public static boolean isEven(MyInteger mi) {
        return mi.isEven();
    }

    public static boolean isOdd(MyInteger mi) {
        return mi.isOdd();
    }

    public static boolean isPrime(MyInteger mi) {
        return mi.isPrime();
    }

    // equals methods
    public boolean equals(int otherValue) {
        return this.value == otherValue;
    }

    public boolean equals(MyInteger other) {
        return this.value == other.value;
    }

    // parseInt(char[])
    public static int parseInt(char[] chars) {
        int result = 0;
        for (char c : chars) {
            result = result * 10 + (c - '0'); // convert char '5' to number 5
        }
        return result;
    }

    // parseInt(String)
    public static int parseInt(String s) {
        return Integer.parseInt(s); // built-in
    }

}
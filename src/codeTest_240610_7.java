public class codeTest_240610_7 {
    public static void main(String[] args) {
//        3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
//        하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
//                기본적으로 중복되지 않는 숫자만 합산합니다.
//
//        System.out.println(sumUnique(1, 2, 3)); // 6
//        System.out.println(sumUnique(3, 2, 3)); // 2
//        System.out.println(sumUnique(3, 3, 3)); // 0
    }

//     static int sumUnique(int a, int b, int c) {
//        if(a == b && b == c) return 0;
//        if(a == b) return c;
//        if(a == c)return b;
//        if(b == c) return a;
//        return a + b + c;
//    } //순서가 바뀌면 안된다. 순서가 중요한 코드

//        static int sumUnique ( int a, int b, int c){
//            boolean i = a == b;
//            boolean j = a == c;
//            boolean k = b == c;
//
//            if (i && j) return 0;
//            if (i) return c;
//            if (j) return b;
//            if (k) return a;
//            return a + b + c;
//
//        }

//    public static int sumUnique(int a, int b, int c) {
////        3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
////        하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
////                기본적으로 중복되지 않는 숫자만 합산합니다.
//        if( a == b && b == c) return 0;
//        if(a == b) return c;
//        if(a == c) return b;
//        if(b == c) return a;
//        return a + b + c;
//    }
    }


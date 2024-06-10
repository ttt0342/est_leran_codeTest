public class codeTest_240610_6 {
    public static void main(String[] args) {
//        정수 n이 주어졌을 때, 숫자를 문자열 형태로 변환하고 뒤에 "!"를 붙여 반환하세요.
//        예를 들어, 정수가 13인 경우 이 메서드는 "13!"을 반환해야 합니다.
//        하지만, 숫자가 3으로 나누어 떨어지면 숫자 대신 "새콤!"를 반환하고,
//        5로 나누어 떨어지면 "달콤!"를 반환하며, 3과 5 모두로 나누어 떨어지면
//        "새콤달콤!"를 반환해야 합니다.
//
//        secomDalcom(1)   ---> "1!"
//        secomDalcom(2)   ---> "2!"
//        secomDalcom(3)   ---> "새콤!"
        System.out.println(secomDalcom(10));
    }

//    static String secomDalcom(int n){
//        if(n%3==0){
//            return "새콤!";
//        }else if (n %5==0){
//            return "달콤!";
//        }else if(n%3==0 && n %5==0){
//            return "새콤달콤!"
//        }else{
//          return n + "!";
//    }

//    static String secomDalcom(int n){
//        return (n%3==0)? "새콤!" : (n %5==0)? "달콤!" : (n%3==0) && (n%5==0)? "새콤달콤" : "!" + n;
//    }

    //풀이 1 - 가독성이 떨어짐
//    static String secomDalcom(int n){
//        if(n%3==0 && n %5==0){
//            return "새콤달콤!";
//        }else if (n%3==0){
//            return "새콤!";
//        }else if (n %5==0){
//            return "달콤!";
//        }else {
//            return n + "!";
//        }
//    }

    //풀이 2 - 유연하게 코드 수정이 가능하다. 이러한 방법으로 코드 작성 권장
    static String secomDalcom(int n){
        boolean secom = n %3==0;
        boolean dalcom = n %5==0;

        if(secom && dalcom) return "새콤달콤!";
        if(secom) return "새콤!";
        if(dalcom) return "달콤!";
        return n + "!";
    }

    //완전 풀이
//    public static String secomDalcom(int n) {
//       if(n % 3 == 0 && n %5 == 0){
//           return "새콤달콤";
//       }else if( n%3 == 0 ){
//           return "새콤!";
//       } else if(n%5 == 0){
//           return "달콤!";
//       } else{
//           return n + "!";
//       }

//        boolean secom = n % 3 == 0;
//        boolean dalcom = n % 5 == 0;
//
//        if(secom && dalcom) return "새콤달콤";
//        if(secom) return "새콤!";
//        if(dalcom) return "달콤!";
//        return n+"!";
//    }
}

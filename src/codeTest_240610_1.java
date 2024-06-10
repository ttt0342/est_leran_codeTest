public class codeTest_240610_1 {
    public static void main(String[] args) {
        // for나 while문은 횟수가 명확할때 사용함, 특징: 직관적
        // 코드가 직관적이다.
        // 재귀 함수의 장점 코드가 간결해짐
        //그러나 코드를 파악하기 어려움

        // 피보나치 수열 for문으로 했었으나 재귀함수로 가능함

        // 문자열 데이터를 전달 받으면 각각의 문자열 사이에 @ 표시를 집어 넣는 함수를 만들어 봅니다.
        // 단, 재귀 함수를 이용하여 풀어보세요.

        System.out.println(printAt("hello")); // "h@e@l@l@o"
    }

//    static String printAt(String str) {
////        str.charAt(0) + "@" + str.charAt(1) + "@" + str.charAt(2) + "@" + str.charAt(3) + "@"
//        if(str.length() <= 1){
//            return str;
//        }
//
//        return str.charAt(0) + "@" + printAt(str.substring(1));
//        // 0번째 다음에 @ 넣고 문자열 출력하기
//        // 이제 문자열을 하나씩 줄이는 과정 필요 - substring 활용
//        // 재귀함수 정지 = return 키워드 사용하기
//    }

    //풀이
//    static String printAt(String str){
//
//        if(str.length() <= 1){
//            return str;
//        }
//
//        return str.charAt(0)+"@"+printAt(str.substring(1));
//
//    }

    //while문으로 바꿔서 작성하기 -> 재귀함수에 비해 코드 길이가 긺
    static String printAt(String str){
        int i = 0;
        String result = "";

        if (str.length() <= 1) {
            return str;
        }

        while(i < str.length() -1){ //길이보다 인덱스값이 1 작으므로
            result += str.charAt(i) + "@";
            i++;
        }

        result += str.charAt(i);

        return result;
    }


    //풀이
//    static String printAt(String str){
//
//        int i=0;
//        String result = "";
//
//        if(str.length() <= i){
//            return str;
//        }
//
//        while(i < str.length()-1){
//            result += str.charAt(i) + "@";
//            i++;
//        }
//
//        result += str.charAt(i);
//
//        return result;
//
//
////        if(str.length() <= 1){
////            return str;
////        }
////
////        return str.charAt(0)+"@"+printAt(str.substring(1));
//
//    }

}


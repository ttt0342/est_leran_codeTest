public class codeTest_240610_9 {
    public static void main(String[] args) {
        //주어진 문자열에서 모든 별표()와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.
        //예를 들어, "ab**cd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다.

//        System.out.println(starSideDel("cd*zq")); // "cq"
//        System.out.println(starSideDel("ab**cd")); // "ad"
//        System.out.println(starSideDel("wacy*xko")); // "wacko"
//        System.out.println(starSideDel("a*bc*d"));

    }


    //수정된 내용으로 확인
//    static String starSideDel(String str) {
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            //현재 문자가 별인 경우
//            if(str.charAt(i) == '*'){
//                //두번 건너뛰도록 만들겠습니다.
//                i++; //현재 문자가 별이라면 다음 문자도 넘겨야 하기 때문에 증감, 즉 i에 2를 더한다.
//                continue; //for문 안에서
//            }
//
//            //현재 문자가 별이 아닌 경우
//            if((i==0 || str.charAt(i-1) != '*') && (i==str.length()-1 || str.charAt(i+1) != '*')){
                //현재 문자가 첫번쨰 문자일 경우 오류발생하므로,
                //첫번째 문자일 경우, 마지막 문자일 경우를 포함한다.
//                result += String.valueOf(str.charAt(i));
//            }
//
////            if(i == 0 && str.charAt(i) != '*'){
////                result += String.valueOf(str.charAt(i));
////            }
////
////            if (i>0 && (str.charAt(i) != '*') && (str.charAt(i -1) - 1 != '*')) {  //별이 아닌 경우
////                result += String.valueOf(str.charAt(i));
////            }
////
////            if (i>0 && str.charAt(i) == '*' && str.charAt(i) - 1 != '*') {
////                result = result.substring(0, result.length() - 1);
////                //원래 있던 값을 제거하고 다시 재할당
////            }
//        }
//        return result;

    //풀이 확인하기
    static String starSideDel(String str){

        String result = "";

        for(int i=0; i <str.length(); i++){

            // 현재 문자가 *인 경우
            if(str.charAt(i) == '*'){
                // 두번 건너뛰도록 만들겠습니다.
                i++;
                continue;
            }

            // 현재 문자가 *이 아닌 경우
            if( (i==0 || str.charAt(i -1) != '*' ) && (i == str.length() -1 || str.charAt(i +1) != '*' )){
                result += String.valueOf(str.charAt(i));
            }

            if(i == 0 && str.charAt(i) != '*'){
                result += String.valueOf(str.charAt(i));
            }

            if(i>0 && str.charAt(i) != '*' && str.charAt(i -1) != '*'){
                result += String.valueOf(str.charAt(i));
            }

            if(i>0 && str.charAt(i) == '*' && str.charAt(i-1) != '*'){
                result = result.substring(0, result.length() -1);
            }
        }

        return result;
    }
}




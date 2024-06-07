public class codeTest_240606_2 {
    public static void main(String[] args) {
        System.out.println(getMiddleThree("he"));
    }

    //substring을 사용해서 문제 해결하기
    //주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
    //예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
    //만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.
    //
    //예제
    //입력: "Monitor"
    //출력: "nit"
    //
    //요구사항
    //문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
    //문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.
//    public static String getMiddleThree(String str) {
//        //public - 접근자, String, int, void 등 입력하는 것 = 어떤 타입의 값을 받는지
//
//        if (str.length() < 3) {
//            System.out.println(str);
//        } else {
//            int middleText = str.length() / 2;
//        }
//        String result = str.substring(middleText-1, middleText+1);
//        return result;
//    }
    static String getMiddleThree(String str) {
        String result = str; //"" - 빈 문자열 사용, 3글자 미만일 때를 위해 str로 선언
        //else 입력하면 코드가 길어지므로 위에서 String을 선언하여 코드 줄이기
        // Moniter
        //"Moniter".length()/2
        //"Hello".length()/2 - 문자열 길이 나타냄


        // substring()

        if (str.length() >= 3) {
            int midIdx = str.length() / 2;

            result = str.substring(midIdx - 1, midIdx + 2);
        }
        return result;
    }
}

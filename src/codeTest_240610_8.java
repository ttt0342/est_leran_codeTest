public class codeTest_240610_8 {
    public static void main(String[] args) {
// 주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

        System.out.println(repeatChar("The")); // "TThhee"
//        System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
//        System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
    }

    //    static String repeatChar(String str) {
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char theChar = str.charAt(i);
//            result += String.valueOf(theChar) + theChar;
//            //혹은 result += "" + theChar + theChar; //빈 문자열 더해주어 자동으로 형변환
//
//            //스트링 밸류 오브를 한번 사용하는 이유 문자열 데이터 + char데이터의 +연산자는 문자열로 형변환
//            //처리가 되기 때문에 한번만 사용한다.
//
//            //유니코드의 연산으로 나옴, 문자열 + 캐릭터 자료형은 결과값이 유니코드
//            //System.out.println("Hello" + 'G');  //결과: HelloG
//            // -> 문자열의 리터럴 표현식("") + 문자의 리터럴 표현식
//            //리터럴 표현식의 경우 +연산자로 문자열이 합쳐지는 것이 가능하다.
//            //리터럴: 문자 자체가 값이 되는 표현식
//            //result 변수 안에 들어있는 것은 문자열의 주소값 - 참조타입이므로
//            //char는 원시타입이므로 주소값과 원시자료형의 결합이므로
//            //("Hello" + 'G')와 다른 경우이다.
//            //그래서 형변환이 필요함
//
//
//        }
//        return result;
//     }
    static String repeatChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char theChar = str.charAt(i);
            result += "" + theChar + theChar;
        }

        return result;

    }
}


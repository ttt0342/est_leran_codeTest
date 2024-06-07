public class codeTest_240606_5 {
    public static void main(String[] args) {
        String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
        printCategory(str);

// * 주어진 문장에서 "category 에 해당하는" 모든 단어를 출력하세요.
// *
// "When organizing items, always label each group with the appropriate
// category. category: books", category: electronics, category: clothing, category: kitchenware, and so on. "

//while문 활용해서 만들기
    }

    static void printCategory(String str) {
        int i = 0;
        while (true) {
            // i의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색한다.
            int idx = str.indexOf("category:", i);
            //카테고리의 시작 인덱스 알고 있음
            if (idx == -1) {
                break;
                // 모든 카테고리를 찾았을 때 반복문 종료 int idx가 -1이 되는 순간 종료 break
            }

            int startIdx = idx + 9;
            int endIdx = str.indexOf(",", startIdx);
            //쉼표, 스타트 인덱스 다음에 나오는 쉽표찾기

            System.out.println(str.substring(startIdx, endIdx));


            i = endIdx + 1; // i 값 업데이트, 다시 카테고리 찾기
        }
    }

    //문제 풀이
//    static void printCategory(String str){
//        int i =0;
//        while(true){
//            // i 의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색합니다.
//            int idx = str.indexOf("category:", i);
//            if(idx == -1){
//                break;
//            }
//
//            int startIdx = idx + 9;
//            int endIdx = str.indexOf(',', startIdx);
//
//            System.out.println(str.substring(startIdx, endIdx));
//
//            i = endIdx+1;
//        }
//    }
}

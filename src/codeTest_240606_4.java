public class codeTest_240606_4 {
    public static void main(String[] args) {
        String a = "Hello world";
        System.out.println(a.indexOf("h"));
        // -1 반환, 값이 없으므로

        int index = a.indexOf('o', 6);
        System.out.println(index);
        // 7이 나옴, 두번째 인덱스로 값을 추가하면 6인덱스 다음부터 찾는다는 의미
    }
}

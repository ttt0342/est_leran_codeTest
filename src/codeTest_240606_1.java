public class codeTest_240606_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(Myclass.staticNum); //변수 사용하는 방법
        //원래 클래스를 사용하면 new 이용해야 하나 static은 그럴 필요 없음

        Myclass.staticmethod();

        //인스턴스를 생성하지 않고도 접근이 가능하다.
        //객체 없이 호출이 가능하며, 정적인 메소드와 필드는 클래스 로딩이 한번만 실행된다.
        //공통적인 기능을 구현할 때 이를 많이 사용한다.
        //단점
        //인스턴스를 만드는 이유: 객체를 만들기 위해서
        //클래스를 통해서 여러 객체를 쉽게 만들 수 있음
        //객체에 다양한 인자로 표현할 수 있으나
        //스태틱은 고정되어 있어 변화가 없음
        //메모리 해제되는 시점이 인스턴스와는 다름
        //스태틱은 프로그램이 종료되어야 해제되어 가비지 컬렉터 작동X
        //->메모리 누수 발생, 효율성 떨얼짐
        //유틸리티 함수처럼 프로그램에서 공통적으로 사용되는 함수를 표현할 때만
        //사용해야 한다.

        //문제를 냈을 때 스태틱 활용해보기
    }

    public class Myclass {
        public static int staticNum = 0; //클래스 레벨의 필드

        public static void staticmethod() {
            System.out.println("this is static method");
        }
    }
    //static = 클래스 레벨의 필드와 메서드를 정의할때 사용하는 키워드
    //클래스 레벨 - 인스턴스에 속하는 게 X(클래스에 속함) *인스턴스: new라는 키워드로 만들어진 객체
    //인스턴스를 만들지 않고도 사용할 수 있다.
}

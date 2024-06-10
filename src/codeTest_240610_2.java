public class codeTest_240610_2 {
    public static void main(String[] args) {
        /*  경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
    만약 당신의 속도가 60 이하라면 벌금은 없습니다.
    속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
    속도가 81 이상이라면 벌금은 200원입니다.
    단, 휴일인 경우 속도 한도가 5 더 높아집니다.

    속도가 60 이하라면 벌금은 0원입니다.
    속도가 61 이상이라면 벌금은 100원입니다.
    만약 휴일이라면 속도가 65라도 벌금은 0원입니다.*/
//        System.out.println(speedRacer(65, true));
//    }

//    static String speedRacer(int speed, boolean isHoliday) {
//        if (isHoliday) {
//            if (speed <= 65) {
//                return "벌금이 없습니다.";
//            } else if (speed > 65 || speed <= 85) {
//                return "벌금은 100원입니다.";
//            } else if (speed > 85) {
//                return "벌금은 200원 입니다.";
//            }
//        } else {
//            if (speed <= 60) {
//                return "벌금이 없습니다.";
//            } else if (speed > 60 && speed <= 80) {
//                return "벌금은 100원입니다.";
//            } else if (speed > 80) {
//                return "벌금은 200원 입니다.";
//            }
//        }
//        return;
//    }


//    static int speedRacer(int speed, boolean isHoliday){
//        //휴일인 경우
//        if(isHoliday == true && speed > 65 && speed <= 85){
//            return 100;
//        }
//
//        if(isHoliday == true && speed >= 86){
//            return 200;
//        }
//
//        if(isHoliday == true && speed <= 65){
//            return 0;
//        }
//
//        //휴일이 아닌 경우
//        if(speed > 60 && speed <= 80){
//            return 100;
//        }
//
//        if(speed >= 80){
//            return 200;
//        } else {
//            return 0;
//        }
//
//    }


        //풀이 과정 - if문 사용시 유지보수 성이 떨어짐
//    static int speedRacer(int speed, boolean isHoliday){
//        //휴일인 경우
//        if(isHoliday == true && speed > 65 && speed <= 85   ){
//            return 100;
//        }
//        if(isHoliday == true && speed >= 86 ){
//            return 200;
//        }
//        if(isHoliday == true && speed <= 65){
//            return 0;
//        }
//
//        // 휴일이 아닌 경우
//        if(speed > 60 && speed <= 80   ){
//            return 100;
//        }
//        if(speed >= 81 ) {
//            return 200;
//        }else{
//            return 0;
//        }
//    }

//    static int speedRacer(int speed, boolean isHoliday){
//        int safeSpeed = 60;
//        int dangerSpeed = 80;
//        int tax = 0;
//
//        if(isHoliday){
//            safeSpeed += 5;
//            dangerSpeed += 5;
//        }
//
//        if(speed > dangerSpeed){
//            tax = 200;
//        }
//
//        if(speed <= safeSpeed){
//            tax = 0;
//        }
//
//        if(speed > safeSpeed && speed <= dangerSpeed){
//            tax = 100;
//        }
//
//        return tax;
//    }


        //풀이 - 수정 및 유지보수에 용이하다.
//    static int speedRacer(int speed, boolean isHoliday){
//        int safeSpeed = 60;
//        int dangerSpeed = 80;
//        int tax = 0;
//
//        if(isHoliday){
//            safeSpeed += 5;
//            dangerSpeed += 5;
//        }
//        if(speed > dangerSpeed){
//            tax = 200;
//        }
//        if(speed <= safeSpeed){
//            tax = 0;
//        }
//        if(speed > safeSpeed && speed <= dangerSpeed){
//            tax = 100;
//        }
//        return tax;
//    }
    }
}

package day5_6.section1;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random()*4) + 8;

        switch (time){
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의를 합니다.");
                break;
            case 10:
                System.out.println("업무를 합니다.");
                break;
            case 11:
                System.out.println("출장을 나갑니다.");
                break;
        }
    }
}

package basic.constate;

public class SwitchExample {

    public static void main(String[] args) {
        String gender = "M";

        switch (gender) {
            case "M": case "m": case "남": case "ㅡ":
                System.out.println("남성입니다.");
                break;

            // java 14버전 이후 개선된 case문
            case "F", "f", "여", "ㄹ":
                System.out.println("여성입니다.");
                break;

            default:
                System.out.println("잘못된 성별입니다.");
        }
    }
}

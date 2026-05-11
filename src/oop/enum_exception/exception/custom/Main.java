package oop.enum_exception.exception.custom;

public class Main {

    public static void main(String[] args) throws Exception {

        LoginUser user = new LoginUser("abc1234", "aaa1111!");

        String result = null;
        try {
            result = user.authenticate("abc1234", "aaa11112!");
        } catch (LoginInvalidException e) {
            System.out.println(e.getMessage());
            System.out.println("입력한 값: " + e.getInputAccount());
        }

        System.out.println("result = " + result);
    }
}

public class JavaStarter {

    public static void main(String[] args) {
        System.out.println("Hello Java");


        String title = "Java 변수와 자료형";
        int studyMinutes = 90;
        int targetMinutes = 120;
        int extraMinutes = 60;

        studyMinutes = 80;

        boolean isPublic = true;
        char level = 'A';
        double progressRate = (double) targetMinutes / studyMinutes;
        boolean isEnoughStudy = studyMinutes >= 60;

        System.out.println("title = " + title);
        System.out.println("studyMinutes = " + studyMinutes + "m");
        System.out.println("targetMinutes = " + targetMinutes + "m");
        System.out.println("extraMinutes = " + extraMinutes + "m");
        System.out.println("중요도: " + level);
        System.out.println("progressRate = " + progressRate + "%");
        System.out.println("충분히 학습했나요? " + (isEnoughStudy ? "네" : "아니요"));
    }
}
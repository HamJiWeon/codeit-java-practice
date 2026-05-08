package oop.accessmodifier;

public class SprintLogApp {

    public static void main(String[] args) {
        LearningLog javaLog = new LearningLog("Java 시작", 40);
        LearningLog gitLog = new LearningLog("Git 복습", 50, false);

        javaLog.extendsStudy(200);
        javaLog.changeTitle("Java 객체지향과 캡슐화");
        javaLog.closePublic();
        javaLog.printSummary();

        gitLog.extendsStudy(45);
        gitLog.openPublic();
        gitLog.printSummary();
    }
}

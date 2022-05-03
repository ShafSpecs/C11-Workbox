package poll;

public class Main {
    public static void main(String[] args) {
        Poll test1 = new Poll("Katie");
        Poll test2 = new Poll("Greg");
        Poll test3 = new Poll("Anderson");
        Poll test4 = new Poll("Sumayyah");
        Poll test5 = new Poll("QDevs");

        Poll.init();

        test1.triggerQuestionnaire();
        test2.triggerQuestionnaire();
        test3.triggerQuestionnaire();
        test4.triggerQuestionnaire();
        test5.triggerQuestionnaire();

        test1.tabulateData();
        test2.tabulateData();
        test3.tabulateData();
        test4.tabulateData();
        test5.tabulateData();
    }
}
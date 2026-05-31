package Gamemodes.Load;

public class questions {
    private String id;
    private String quest;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private int correct;

    public questions(String id, String quest, String ans1, String ans2, String ans3, String ans4, int correct) {
        this.id = id;
        this.quest = quest;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correct = correct;
    }

    /*
    quest": "what number comes between 2 and 4 Beetlejuice?",
      "ans1": "0",
      "ans2": "1",
      "ans3": "2",
      "ans4": "25",
      "correct": 4
     */

    public String getId() {
        return id;
    }

    public String getQuest() {
        return quest;
    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public int getCorrect() {
        return correct;
    }

    @Override
    public String toString() {
        return "questions{" +
                "id='" + id + '\'' +
                ", quest='" + quest + '\'' +
                ", ans1='" + ans1 + '\'' +
                ", ans2='" + ans2 + '\'' +
                ", ans3='" + ans3 + '\'' +
                ", ans4='" + ans4 + '\'' +
                ", correct=" + correct +
                '}';
    }
}

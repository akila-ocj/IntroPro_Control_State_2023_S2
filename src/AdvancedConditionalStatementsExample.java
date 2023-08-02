public class AdvancedConditionalStatementsExample {
    public static void main(String[] args) {
        // TODO: Set score to 95 and then to 75. How do the output messages change?
        int score = 85;

        if (score > 90) {
            System.out.println("You did great!");
        } else if (score > 80) {
            System.out.println("You did good!");
        } else {
            System.out.println("You need to study more.");
        }

        if (score > 60) {
            if (score > 70) {
                System.out.println("You passed the exam.");
            } else {
                System.out.println("You barely passed the exam.");
            }
        } else {
            System.out.println("You failed the exam.");
        }
    }
}

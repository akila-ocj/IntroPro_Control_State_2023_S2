public class ConditionalStatementsExample {
    public static void main(String[] args) {
        // TODO: Set temperature to 31. What does the program print now?
        int temperature = 20;

        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else {
            System.out.println("It's not hot outside.");
        }

        // TODO: Set grade to 'C'. What is the output?
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            default:
                System.out.println("Keep trying!");
        }
    }
}

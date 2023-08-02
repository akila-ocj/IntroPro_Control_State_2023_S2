public class LogicalOperatorsExample {
    public static void main(String[] args) {
        // TODO: Change the boolean values of isEarlyMorning to false and isCoffeeAvailable to true. What's the output?
        boolean isEarlyMorning = true;
        boolean isCoffeeAvailable = false;

        if (isEarlyMorning && !isCoffeeAvailable) {
            System.out.println("Need to buy coffee!");
        }
    }
}

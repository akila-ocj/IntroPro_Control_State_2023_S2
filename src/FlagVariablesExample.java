public class FlagVariablesExample {
    public static void main(String[] args) {
        // TODO: Change the password variable to "pass456". Does the program still grant access?
        boolean isPasswordCorrect = false;

        String password = "pass123";
        if (password.equals("pass123")) {
            isPasswordCorrect = true;
        }

        if (isPasswordCorrect) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
    }
}

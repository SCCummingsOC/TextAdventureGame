import java.util.Scanner;

public class ReadIn {

    public boolean validateUserInput(String input) {
            int number = Integer.parseInt(input);
            if (number > 0 && number <= 2)
                return true;
            return false;
    }

    public String readUserInput() {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext())
                return scanner.nextLine();
            scanner.close();

            return "";

    }

    public int returnUserOptionSelection() {
        String userInput = readUserInput();
        if (validateUserInput(userInput)) {
            return Integer.parseInt(userInput);
        }
        return 0;
    }

}

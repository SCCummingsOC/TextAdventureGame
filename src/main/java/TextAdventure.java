import java.util.ArrayList;

public class TextAdventure {

    private static GameData data;
    private static ArrayList<Node> nodes;
    private static Node currentNode;
    private static PrintOut printOut;
    private static ReadIn readIn;
    private static boolean gameOver;

    public static void setUp(Node startingNode) {
        printOut = new PrintOut();
        readIn = new ReadIn();

        currentNode = startingNode;
    }

    public static void main(String[] args) {
        data = new GameData();

        setUp(data.getStartingLocation());
        printStartOfGame();
        while (!gameOver) {
            playTurn();
        }
        printOut.typeText("The game continues to unfold as you venture through the Stormy Summit, facing trials and unlocking the Crystal's true potential." +
                "\nAlong the way, you gather support, form alliances, and uncover the robot overlord's vulnerabilities." +
                "\nThe ultimate confrontation awaits, where the fate of the kingdom will be decided by your bravery and strategic prowess." +
                "\nWill you succeed in overthrowing the rival robot overlord and liberating your people? The outcome is in your hands.");
    }

    private static void printStartOfGame() {
        printOut.typeText("Welcome Princess Silas to the Rebellions Quest\n");
    }

    private static void requestInput() {
        System.out.println("What would you like to do?");
    }

    private static void arriveAtLocation() {
        System.out.println(currentNode.getDescription());
        printOut.printOptions(currentNode);
    }

    public static void moveDownChosenPath(int chosenPath) {
        Node nextNode = currentNode.getPaths().get(chosenPath);
        if (nextNode == null)
            throw new NullPointerException("I have nowhere to go!");
        currentNode = nextNode;
    }

    public Node getCurrentLocation() { return currentNode;}

    private static void playTurn() {
        printOut.typeText(currentNode.getDescription());
        System.out.println("\n\nWhat would you like to do?\n\n");
        printOut.typeText(printOut.printOptions(currentNode));
        int chosenPath = readIn.returnUserOptionSelection();
        moveDownChosenPath(chosenPath);
        gameOver = currentNode.isFinalNode();
    }
}

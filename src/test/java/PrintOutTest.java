import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOutTest {

    private PrintOut printOut;

    @BeforeEach
    void setup(){
        printOut = new PrintOut();
    }

    @Test
    public void printsMovementOptionsForArrivingAtTheWoods() {
        Node theForest = new Node("The forest", "You have arrived at fangorn forest", new String[]{"Enter the forest","Walk around the forest"});
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        assertEquals("Do you wish to:\n" +
                "1 - Enter the forest\n" +
                "2 - Walk around the forest\n", printOut.printOptions(theForest));
    }

}

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.*;

public class ReadInTest {

    private ReadIn readIn = new ReadIn();

    @Test
    public void numericValue1IsValid() {
        String input = "1";
        assertTrue(readIn.validateUserInput(input));
    }

    @Test
    public void numericValue2IsValid() {
        String input = "2";
        assertTrue(readIn.validateUserInput(input));
    }

    @Test
    public void numericValue3IsVInvalid() {
        String input = "3";
        assertFalse(readIn.validateUserInput(input));
    }

    @Test
    public void nonNumberThrowsException() {
        String input = "hiya";
        assertThrows(NumberFormatException.class, () -> {
            readIn.validateUserInput(input);
        });
    }

    @Test
    public void getsValidInputFromUser() {
        String expectedOutput = "1";

            // Mock user input to simulate no input within the timeout
            String input = "1";
            ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
            System.setIn(inputStream);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            assertEquals(expectedOutput, readIn.readUserInput());
    }

    @Test
    public void returnsZeroWhenInvalidInput() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("3".getBytes());
        System.setIn(inputStream);
        assertEquals(readIn.returnUserOptionSelection(),0);
    }

    @Test
    public void returnsOneWhenValidInput() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());
        System.setIn(inputStream);
        assertEquals(readIn.returnUserOptionSelection(),1);
    }

}

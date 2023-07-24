import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class TextAdventureTest {

    private TextAdventure textAdventure;
    private Node theCastle;
    private Node homestead;

    @BeforeEach
    void setup() {
        ArrayList<String> homesteadOptions = new ArrayList<>();
        homesteadOptions.add("Return home");

        ArrayList<String> castleOptions = new ArrayList<>();
        castleOptions.add("Try and enter the castle");
        castleOptions.add("Camp outside the castle walls");

        homestead = new Node("Your home", "You are at your home", new String[]{"Return home"});
        theCastle = new Node("The castle", "You have reached a castle", new String[]{"Try and enter the castle","Try and enter the castle"});
        homestead.setPaths(null, theCastle);
        theCastle.setPaths(homestead, null);
        textAdventure = new TextAdventure();
        textAdventure.setUp(homestead);
    }

    @Test
    void movesToNewLocation() {
        textAdventure.moveDownChosenPath(2);
        assertEquals(theCastle, textAdventure.getCurrentLocation());
    }

    @Test
    void throwsExceptionWhenNoPath() {
        assertThrows(NullPointerException.class, () -> {textAdventure.moveDownChosenPath(0);});
    }

}

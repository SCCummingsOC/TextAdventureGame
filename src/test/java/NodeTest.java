import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class NodeTest {

    private Node homestead;
    private Node theCastle;


    @BeforeEach
    void setup() {
        homestead = new Node("Your home", "You have reached your home", new String[]{"Return home"});
        theCastle = new Node("The castle", "You approach the castle", new String[]{"Try and enter the castle","Camp outside the castle walls"});

        homestead.setPaths(null, theCastle);
        theCastle.setPaths(homestead, null);

    }

    @Test
    void hasPathForOptionOne() {
        assertEquals(theCastle.getPath(1), homestead);
    }

    @Test
    void hasPathForOptionTwo() {
        assertEquals(homestead.getPath(2), theCastle);
    }

    @Test
    void doesNotHavePathForOptionOne() {
        assertNull(theCastle.getPath(2));
    }

    @Test
    void doesNotHavePathForOptionTwo() {
        assertNull(homestead.getPath(1));
    }





}

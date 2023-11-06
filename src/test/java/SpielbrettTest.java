import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpielbrettTest {


    @Test
    void getXTest_shouldReturn0() {
        // GIVEN


        // WHEN

        int actual = Spielbrett.getX();

        // THEN

        assertEquals(0, actual);
    }
    // @Test
    //  void getYTest_shouldReturn0() {
    // GIVEN


    // WHEN

    // int actual = Spielbrett.getY();

    // THEN

    // assertEquals(0, actual);
    // }

    @Test
    void SpielbrettTest_whenWpressed_moveUp() {
        // GIVEN
        Spielbrett.x = 0;
        Spielbrett.y = 0;
        String up = "w";

        // WHEN

        Spielbrett.move(up);
        int actual = Spielbrett.getY();

        // THEN
        assertEquals(1, actual);
    }

    @Test
    void SpielbrettTest_whenApressed_moveLeft() {
        // GIVEN
        Spielbrett.x = 0;
        Spielbrett.y = 0;
        String left = "a";

        // WHEN

        Spielbrett.move(left);
        int actual = Spielbrett.getX();

        // THEN
        assertEquals(-1, actual);
    }

    @Test
    void SpielbrettTest_whenSpressed_moveDown() {
        // GIVEN
        Spielbrett.x = 0;
        Spielbrett.y = 0;
        String down = "s";

        // WHEN

        Spielbrett.move(down);
        int actual = Spielbrett.getY();

        // THEN
        assertEquals(-1, actual);
    }

    @Test
    void SpielbrettTest_whenDpressed_moveRight() {
        // GIVEN
        Spielbrett.x = 0;
        Spielbrett.y = 0;
        String right = "d";

        // WHEN

        Spielbrett.move(right);
        int actual = Spielbrett.getX();

        // THEN
        assertEquals(1, actual);

    }
}
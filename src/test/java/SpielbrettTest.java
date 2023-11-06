import org.example.FizzBuzz;

import org.example.Spielbrett;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpielbrettTest {

    @Test
    void SpielbrettTest_whenWpressed_moveUp() {
        // GIVEN

        int[][] board = new int[5][5];


        // WHEN

        //   int[] [] actual = Spielbrett.moveUp;

        // THEN

        //   assertArrayEquals(board[1][2], actual);
    }

    @Test
    void getXTest_shouldReturn0() {
        // GIVEN


        // WHEN

        int actual = Spielbrett.getX();

        // THEN

        assertEquals(0, actual);
    }
    @Test
    void getYTest_shouldReturn0() {
        // GIVEN


        // WHEN

        int actual = Spielbrett.getY();

        // THEN

        assertEquals(0, actual);
    }

}

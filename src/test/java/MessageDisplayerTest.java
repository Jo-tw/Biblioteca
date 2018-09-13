
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class MessageDisplayerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void welcomeMessageTest() {
        MessageDisplayer msgManager = new MessageDisplayer();
        msgManager.welcomeMessage();
        assertEquals("Welcome to Bangalore Public Library\n", outContent.toString());

    }

}


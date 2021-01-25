import main.java.duke.command.AddCommand;
import main.java.duke.command.DeleteCommand;
import main.java.duke.command.DoneCommand;
import main.java.duke.command.ExitCommand;
import main.java.duke.command.PrintCommand;
import main.java.duke.subfiles.Parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParseTest {
    @Test
    public void parseAsExitCommand() {
        assertTrue(Parser.parse("bye") instanceof ExitCommand);
        assertTrue(Parser.parse("bye Duke") instanceof ExitCommand);
    }

    @Test
    public void parseAsPrintCommand() {
        assertTrue(Parser.parse("list") instanceof PrintCommand);
        assertTrue(Parser.parse("list abcde") instanceof PrintCommand);
        assertTrue(Parser.parse("list 1111-11-11") instanceof PrintCommand);
    }

    @Test
    public void parseAsDoneCommand() {
        assertTrue(Parser.parse("done") instanceof DoneCommand);
        assertTrue(Parser.parse("done abcde") instanceof DoneCommand);
        assertTrue(Parser.parse("done 1") instanceof DoneCommand);
    }

    @Test
    public void parseAsDeleteCommand() {
        assertTrue(Parser.parse("delete") instanceof DeleteCommand);
        assertTrue(Parser.parse("delete abcde") instanceof DeleteCommand);
        assertTrue(Parser.parse("delete 1") instanceof DeleteCommand);
    }

    @Test
    public void parseAsAddCommand() {
        assertTrue(Parser.parse("") instanceof AddCommand);
        assertTrue(Parser.parse("todo abcde") instanceof AddCommand);
        assertTrue(Parser.parse("deadline abcde") instanceof AddCommand);
        assertTrue(Parser.parse("deadline abcde /by 1111-11-11") instanceof AddCommand);
        assertTrue(Parser.parse("event abcde") instanceof AddCommand);
        assertTrue(Parser.parse("event abcde /at 1111-11-11") instanceof AddCommand);
    }
}

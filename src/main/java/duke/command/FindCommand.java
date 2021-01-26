package main.java.duke.command;

import main.java.duke.subfiles.TaskList;
import main.java.duke.subfiles.Ui;

/**
 * The FindCommand class is a command whose execution triggers the
 * printing of tasks in the TaskList containing a keyword specified
 * by user input.
 *
 * @author  arsatis
 * @version 1.1
 * @since   2021-01-26
 */
public class FindCommand extends Command {

    /**
     * Default constructor for the FindCommand class.
     *
     * @param command The user input formatted as a String object.
     */
    public FindCommand(String command) {
        super(command);
    }

    /**
     * Calls the task manager to print a list of tasks in the TaskList
     * containing the specified keyword.
     *
     * @param taskList A TaskList object containing the list of tasks
     *                 which the program currently has.
     * @param ui A Ui object which the current program is using to manage
     *           interactions with the user.
     */
    @Override
    public void execute(TaskList taskList, Ui ui) {
        taskList.findTasksWithKeyword(command);
    }

    /**
     * Returns true if the command is an ExitCommand, and false otherwise.
     *
     * @return False, since this is not an ExitCommand.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}

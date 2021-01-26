package main.java.duke.command;

import main.java.duke.exceptions.InvalidInputException;
import main.java.duke.exceptions.ListOutOfBoundsException;
import main.java.duke.subfiles.TaskList;
import main.java.duke.subfiles.Ui;

/**
 * The DeleteCommand class is a command whose execution triggers the
 * deletion of a task from the TaskList, based on the user input.
 *
 * @author  arsatis
 * @version 1.1
 * @since   2021-01-26
 */
public class DeleteCommand extends Command {

    /**
     * Default constructor for the DeleteCommand class.
     *
     * @param command The user input formatted as a String object.
     */
    public DeleteCommand(String command) {
        super(command);
    }

    /**
     * Calls the task manager to delete a specified task from
     * the list upon receiving a user input that attempts to
     * delete a task from the list.
     *
     * @param taskList A TaskList object containing the list of tasks
     *                 which the program currently has.
     * @param ui A Ui object which the current program is using to manage
     *           interactions with the user.
     */
    @Override
    public void execute(TaskList taskList, Ui ui) {
        try {
            taskList.deleteTask(command);
        } catch (InvalidInputException | ListOutOfBoundsException e) {
            ui.showError(e.getMessage());
        }
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

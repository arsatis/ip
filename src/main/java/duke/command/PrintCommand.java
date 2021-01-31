package duke.command;

import duke.exceptions.DateFormatException;
import duke.subfiles.TaskList;
import duke.subfiles.Ui;

/**
 * The PrintCommand class is a command whose execution triggers the
 * printing of tasks in the TaskList, based on the user input.
 *
 * @author  arsatis
 * @version 1.1
 * @since   2021-01-26
 */
public class PrintCommand extends Command {

    /**
     * Default constructor for the PrintCommand class.
     *
     * @param command The user input formatted as a String object.
     */
    public PrintCommand(String command) {
        super(command);
    }

    /**
     * Calls the task manager to either print the entire list of tasks
     * in the TaskList, or the deadlines and events that are due or happening
     * on the specified date.
     *
     * @param taskList A TaskList object containing the list of tasks
     *                 which the program currently has.
     * @param ui A Ui object which the current program is using to manage
     *           interactions with the user.
     */
    @Override
    public void execute(TaskList taskList, Ui ui) {
        String[] sArray = command.split(" ");

        if (sArray.length == 1) {
            taskList.printTasks();
        } else {
            try {
                taskList.printTasksOnDate(sArray[1]);
            } catch (DateFormatException e) {
                ui.showError(e.getMessage());
            }
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

package duke.exceptions;

/**
 * The EmptyDateException class is an exception thrown
 * by the TaskList when a date is not supplied for a
 * deadline or event by the user input.
 *
 * @author  arsatis
 * @version 1.0
 * @since   2021-01-19
 */
public class EmptyDateException extends Exception {

    /**
     * Default constructor for the EmptyTimeException class.
     *
     * @param s The type of task which triggered this exception.
     */
    public EmptyDateException(String s) {
        super("OOPS!!! The date of a " + s + " cannot be empty.");
    }

}

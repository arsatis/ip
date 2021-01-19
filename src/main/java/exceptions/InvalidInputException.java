package main.java.exceptions;

/**
 * The InvalidInputException class is an exception thrown
 * by the Task Manager when an invalid input or command is
 * supplied by the user.
 *
 * @author  arsatis
 * @version 1.0
 * @since   2021-01-19
 */
public class InvalidInputException extends Exception {

    /**
     * Default constructor for the InvalidInputException class.
     */
    public InvalidInputException() {
        super("OOPS!!! I'm sorry, but I don't know what that means :-(");
    }

}

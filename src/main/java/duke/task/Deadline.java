package main.java.duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The Deadline class represents a single deadline created by
 * the user via user input to the Duke program. It contains
 * functions which enable the user to mark the task as done,
 * and a date which the deadline is due.
 *
 * @author  arsatis
 * @version 1.0
 * @since   2021-01-19
 */
public class Deadline extends Task {
    /** Date which the deadline is due */
    private LocalDate date;

    /**
     * Default constructor for the Deadline class.
     *
     * @param name Description of the deadline.
     * @param date Date which the deadline is due.
     */
    public Deadline(String name, LocalDate date) {
        super(name);
        this.date = date;
    }


    public String getDate() {
        return date.toString();
    }

    public LocalDate getDateAsLocalDate() {
        return date;
    }

    /**
     * Returns a description of the deadline, formatted with its
     * type, followed by an "X" if it has been marked as done.
     *
     * @return Formatted description of the deadline.
     */
    @Override
    public String toString() {
        return "[D][" + (isDone ? "X" : " ") + "] " + name +
                " (by: " + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

}
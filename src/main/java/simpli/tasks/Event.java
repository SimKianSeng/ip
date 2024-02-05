package simpli.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("d/M/yyyy HHmm");
    protected LocalDateTime from;
    protected LocalDateTime to;

    /**
     * Initializes an event task with the specified attributes.
     *
     * @param isDone boolean representing if a task is completed or not.
     * @param name String.
     * @param from Starting date and time of an event.
     * @param to Ending date and time of an event.
     */
    public Event(boolean isDone, String name, LocalDateTime from, LocalDateTime to) {
        super(isDone, name);
        this.from = from;
        this.to = to;
    }

    public String toCsv() {
        return String.format("Event,%s,%s,%s", super.toCsv(),
                this.from.format(FORMATTER), this.to.format(FORMATTER));
    }

    /**
     * Returns the event task String representation.
     * @return String representation of the event task.
     */
    @Override
    public String toString() {
        return String.format("[E]%s (from: %s to: %s)", super.toString(),
                this.from.format(FORMATTER), this.to.format(FORMATTER));
    }
}

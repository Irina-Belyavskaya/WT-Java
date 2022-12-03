package by.Irina.lab4.command;

@FunctionalInterface
public interface Command {
    CommandResult execute(RequestContent requestContent);
}

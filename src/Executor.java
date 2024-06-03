/**
 * Executor class is responsible for executing commands.
 */
public class Executor {
    /**
     * Executes the specified command.
     *
     * @param command the command to be executed
     */
    public void executeOperation(Command command) {
        command.execute();
    }
}

package SmartOffice.command;

// Invoker
public class CommandInvoker {
    public void submit(Command command) {
        command.execute();
    }
}

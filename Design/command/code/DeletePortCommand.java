public class DeletePortCommand implements Command {
    private Port port;

    public DeletePortCommand(Port port) {
        this.port = port;
    }

    public void execute() {
        port.delete();
    }
}
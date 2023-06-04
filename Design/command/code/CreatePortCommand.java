public class CreatePortCommand implements Command {
    private Port port;

    public CreatePortCommand(Port port) {
        this.port = port;
    }

    public void execute() {
        port.create();
    }
}
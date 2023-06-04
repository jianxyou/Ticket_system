public class UpdatePortCommand implements Command {
    private Port port;

    public UpdatePortCommand(Port port) {
        this.port = port;
    }

    public void execute() {
        port.update();
    }
}
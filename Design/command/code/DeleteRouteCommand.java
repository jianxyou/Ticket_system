public class DeleteRouteCommand implements Command {
    private Route route;

    public DeleteRouteCommand(Route route) {
        this.route = route;
    }

    public void execute() {
        route.delete();
    }
}
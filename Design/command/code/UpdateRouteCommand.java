public class UpdateRouteCommand implements Command {
    private Route route;

    public UpdateRouteCommand(Route route) {
        this.route = route;
    }

    public void execute() {
        route.update();
    }
}
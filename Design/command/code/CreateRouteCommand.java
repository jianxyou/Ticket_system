public class CreateRouteCommand implements Command {
    private Route route;

    public CreateRouteCommand(Route route) {
        this.route = route;
    }

    public void execute() {
        route.create();
    }
}
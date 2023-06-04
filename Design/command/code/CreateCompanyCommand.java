public class CreateCompanyCommand implements Command {
    private Company company;

    public CreateCompanyCommand(Company company) {
        this.company = company;
    }

    public void execute() {
        company.create();
    }
}

public class UpdateCompanyCommand implements Command {
    private Company company;

    public UpdateCompanyCommand(Company company) {
        this.company = company;
    }

    public void execute() {
        company.update();
    }
}
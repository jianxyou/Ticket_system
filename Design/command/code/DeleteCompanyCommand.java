public class DeleteCompanyCommand implements Command {
    private Company company;

    public DeleteCompanyCommand(Company company) {
        this.company = company;
    }

    public void execute() {
        company.delete();
    }
}
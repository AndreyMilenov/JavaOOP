package barracksWars.core.commands;

import barracksWars.Annotations.Inject;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

public class ReportCommand extends Command {
    @Inject
    private Repository repository;

    public Repository getRepository() {
        return repository;
    }

    public ReportCommand(String[] data ) {
        super(data);
    }

    @Override
    public String execute() {
        return repository.getStatistics();
    }
}

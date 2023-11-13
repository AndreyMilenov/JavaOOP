package barracksWars.core.commands;

import barracksWars.Annotations.Inject;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;


public class RetireCommand extends Command {
    @Inject
    private Repository repository;


    public Repository getRepository() {
        return repository;
    }


    public RetireCommand(String[] data ) {
        super(data);

    }

    @Override
    public String execute() {
        try {
            String unitType = getData()[1];
            getRepository().removeUnit(unitType);
            return String.format("%s retired!", unitType);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}

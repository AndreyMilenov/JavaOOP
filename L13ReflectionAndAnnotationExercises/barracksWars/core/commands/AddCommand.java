package barracksWars.core.commands;

import barracksWars.Annotations.Inject;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;

public class AddCommand extends Command {
     @Inject
    private Repository repository;
     @Inject
    private UnitFactory factory;

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getFactory() {
        return factory;
    }

    public AddCommand(String[] data  ) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = factory.createUnit(unitType);
        repository.addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}

package barracksWars;

import barracksWars.core.Engine;
import barracksWars.core.commands.CommandInterpreterImpl;
import barracksWars.core.factories.UnitFactoryImpl;
import barracksWars.data.UnitRepository;
import barracksWars.interfaces.CommandInterpreter;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.UnitFactory;


public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository,unitFactory);

        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}

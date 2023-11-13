package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import barracksWars.models.units.*;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static java.lang.Class.forName;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME = "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType)  {
        try {
            Class unitClass = forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {

        }

        return null;
    }

}

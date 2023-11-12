package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Class<RichSoilLand> clazz = RichSoilLand.class;

		Field[] fields = clazz.getDeclaredFields();

		Scanner scanner = new Scanner(System.in);
		String command  = scanner.nextLine();
		Consumer<Field> consumer = field -> System.out.println(String.format("%s %s %s",Modifier.toString(field.getModifiers()),
				field.getType().getSimpleName(),field.getName()));

		while(!command.equals("HARVEST")) {
			switch (command) {
				case "private":
					Arrays.stream(fields)
							.filter(field -> Modifier.isPrivate(field.getModifiers()))
							.forEach(consumer);
					break;
				case "public":

					Arrays.stream(fields)
							.filter(field -> Modifier.isPublic(field.getModifiers()))
							.forEach(consumer);
					break;
				case "protected":
					Arrays.stream(fields)
							.filter(field -> Modifier.isProtected(field.getModifiers()))
							.forEach(consumer);
					break;
				case "all":
					Arrays.stream(fields)
							.forEach(consumer);
					break;
			}


			command = scanner.nextLine();
		}


	}
}

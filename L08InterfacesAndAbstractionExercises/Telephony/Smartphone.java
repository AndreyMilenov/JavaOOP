package L08InterfacesAndAbstractionExercises.Telephony;

import java.util.List;

public class Smartphone implements Browsable,Callable{

    private List<String> numbers;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    private List<String> urls;

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (hasDigits(url)) {
                sb.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sb.append(String.format("Browsing: %s!%n",url));
            }
        }
        return sb.toString();
    }
    private boolean hasDigits(String url) {
        for (char c : url.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (hasOnlyDigits(number)) {
                sb.append(String.format("Calling... %s%n",number));
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return sb.toString();

    }
    private boolean hasOnlyDigits(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}

import java.util.ArrayList;
import java.util.List;

public class Greetings {
    private final StringBuilder greet;

    public Greetings() {
        greet = new StringBuilder();
    }

    public String greet(String... names) {
        names = splitNamesWithCommas(names);

        if (isEmpty(names)) {
            names = new String[]{"my friend"};
        }

        if (hasOneName(names) && hasShout(names)) {
            greet.append(createShout(names[0]));
        } else {
            appendHello(names);
            StringBuilder shoutGreet = new StringBuilder();

            for (int i = 1; i < names.length; i++) {
                if (hasShout(names[i])) {
                    createShout(shoutGreet, names, i);
                } else if (hasMultipleNames(names) && !isLastElement(i, names)) {
                    greet.append(",");
                    greet.append(createName(names[i]));
                    greet.append(",");
                }
            }

            appendLast(names);
            greet.append(shoutGreet);
        }

        return greet.toString();
    }

    private void createShout(StringBuilder shoutGreet, String[] names, int index) {
        if(hasMultipleNames(names)) {
            shoutGreet.append(" AND ");
        }

        shoutGreet.append(createShout(names[index]));
    }

    private void appendHello(String[] names) {
        appendHello();

        if(hasMultipleNames(names)) {
            greet.append(createName(names[0]));
        }
    }

    private StringBuilder createShout(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append("HELLO");
        builder.append(createName(name));
        builder.append("!");

        return builder;
    }

    private void appendLast(String... names) {
        if (hasMultipleNames(names)) {
            appendAnd();
        }

        greet.append(createName(names[names.length - 1]));
        greet.append(".");
    }

    private void appendAnd() {
        greet.append(" ");
        greet.append("and");
    }

    private String createName(String name) {
        return " "+name;
    }

    private void appendHello() {
        greet.append("Hello,");
    }

    private String[] splitNamesWithCommas(String[] names) {
        if (isEmpty(names)) {
            return null;
        }

        List<String> listNames = new ArrayList<>();

        for (String name : names) {
            if (name.contains(",") && !isEscaped(name)) {
                String[] splits = name.split(",");
                for (String split : splits) {
                    listNames.add(split.trim());
                }
            } else {
                if (isEscaped(name)) {
                    name = name.replace("\"", "");
                }

                listNames.add(name);
            }
        }

        return listNames.toArray(new String[0]);
    }

    private boolean isEscaped(String name) {
        return name.contains("\"");
    }

    private boolean isLastElement(int i, String[] names) {
        return names.length - 1 == i;
    }

    private boolean hasOneName(String[] names) {
        return names.length == 1;
    }

    private boolean hasMultipleNames(String[] names) {
        return names.length > 1;
    }

    private boolean hasShout(String... names) {
        for (String name : names) {
            if (hasShout(name)) {
                return true;
            }
        }

        return false;
    }

    private boolean hasShout(String name) {
        return !isEmpty(name) && name.toUpperCase().equals(name);
    }

    private boolean isEmpty(String... names) {
        return names == null || names.length == 0;
    }
}

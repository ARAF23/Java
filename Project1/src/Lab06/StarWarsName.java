package Lab06;

/*
 * @author Wasi Omar Bin Bayzed
 * 
 */
public class StarWarsName {

    private static final int FIRST_NAME_LENGTH = 3;
    private static final int LAST_NAME_LENGTH = 2;
    private static final int MOTHERS_MAIDEN_NAME_LENGTH = 2;
    private static final int BIRTH_CITY_LENGTH = 3;

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("missing data input");
        }
        String names[] = args[0].split("\\|");
        if (names.length != 4) {
            System.out.println("ERROR: incorrect number of words provided.");
        } else {
            String firstName = names[0].substring(0, 1).toUpperCase()
                    + names[0].substring(1, FIRST_NAME_LENGTH).toLowerCase()
                    + names[1].substring(0, LAST_NAME_LENGTH).toLowerCase();
            String lastName = names[2].substring(0, 1).toUpperCase()
                    + names[2].substring(1, MOTHERS_MAIDEN_NAME_LENGTH).toLowerCase()
                    + names[3].substring(0, BIRTH_CITY_LENGTH).toLowerCase();
            System.out.format("Your Star Wars name is: %s %s%n", firstName, lastName);
        }
    }
}

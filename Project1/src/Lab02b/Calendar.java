package Lab02b;

//importing necessery classes
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*@author Wasi */

//calendar class starts from here
public class Calendar {
    private ArrayList<Integer> years;
    private String[] months = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };
    private ArrayList<Integer> days;
    private HashMap<Integer, Date> dates;

    public Calendar() {

        years = new ArrayList<>();
        int i;
        for (i = 1910; i <= 2025; i++) {
            years.add(i);
        }

        days = new ArrayList<>();
        int j;
        for (j = 1; j <= 30; j++) {
            days.add(j);
        }

        dates = new HashMap<>();
        int key = 1;
        for (int year : years) {
            if (months != null) {
                for (int month = 0; month < months.length; month++) {
                    Iterator<Integer> it = days.iterator();
                    while (it.hasNext()) {
                        int day = it.next();
                        Date date = new Date(year, months[month], day);
                        dates.put(key, date);
                        key += 1;
                    }
                }
            }
        }
    }

    public void printCalendar() {
        Set<Integer> allOfTheKeys = dates.keySet();
        for (int key : allOfTheKeys) {
            System.out.println(key + ": " + dates.get(key).getDate());
        }
    }
}

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String[] p1Surname = p1.getSurname().split(" ");
        String[] p2Surname = p2.getSurname().split(" ");
        int compareLength = Integer.compare(p1Surname.length, p2Surname.length);
        return compareLength == 0 ? Integer.compare(p1.getAge(), p2.getAge()) : compareLength;
    }
}
import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxLengthSurname;

    public PersonComparator(int maxLengthSurname){
        this.maxLengthSurname = maxLengthSurname;
    }


    @Override
    public int compare(Person p1, Person p2) {
        String[] p1Surname = p1.getSurname().split(" ");
        String[] p2Surname = p2.getSurname().split(" ");
        int p1LengthSurname = Math.min(p1Surname.length, maxLengthSurname);
        int p2LengthSurname = Math.min(p2Surname.length, maxLengthSurname);
        int compareLength = Integer.compare(p1LengthSurname, p2LengthSurname);
        return compareLength == 0 ? Integer.compare(p1.getAge(), p2.getAge()) : compareLength;
    }
}
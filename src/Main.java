import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        int maxLengthSurname = 3;
        personList.add(new Person("Иван", "Иванов Петров", 29));
        personList.add(new Person("Любовь", "Щелканова Воронина при", 12));
        personList.add(new Person("Мария", "Трифонова", 15));
        personList.add(new Person("Марат", "Марков Мерков", 25));
        personList.add(new Person("Юлия", "Сидорова Карпунина", 42));
        personList.add(new Person("Сергей", "Муркин Туркин Делов Меркин", 13));
        System.out.println("Список до сортировки:");
        System.out.println(personList);

        Comparator<Person> comparator = (p1, p2) -> {
            String[] p1Surname = p1.getSurname().split(" ");
            String[] p2Surname = p2.getSurname().split(" ");
            int p1LengthSurname = Math.min(p1Surname.length, maxLengthSurname);
            int p2LengthSurname = Math.min(p2Surname.length, maxLengthSurname);
            int compareLength = Integer.compare(p1LengthSurname, p2LengthSurname);
            return compareLength == 0 ? Integer.compare(p1.getAge(), p2.getAge()) : compareLength;
        };


        Collections.sort(personList, comparator);
        System.out.println("Список после сортировки:");
        System.out.println(personList);

        Predicate<Person> personPredicate = person -> person.getAge() < 18;
        personList.removeIf(personPredicate);
        System.out.println("Список после удаления:");
        System.out.println(personList);

    }


}

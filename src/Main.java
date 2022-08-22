import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Иван", "Иванов Петров", 29));
        personList.add(new Person("Любовь", "Щелканова Воронина при", 12));
        personList.add(new Person("Мария", "Трифонова", 36));
        personList.add(new Person("Марат", "Марков Мерков", 25));
        personList.add(new Person("Юлия", "Сидорова Карпунина", 42));
        personList.add(new Person("Сергей", "Муркин Туркин Делов Меркин", 29));
        System.out.println("Список до сортировки:");
        System.out.println(personList);

        Collections.sort(personList, new PersonComparator(2));
        System.out.println("Список после сортировки:");
        System.out.println(personList);
    }


}

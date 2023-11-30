import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws EmptyListException, AggregationException {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Name", 19));
        people.add(new Person("Name1", 21));
        people.add(new Person("Name2", 48));
        people.add(new Person("Name3", 6));
        people.add(new Person("Name4", 33));
        try {
            if (people.isEmpty()) {
                throw new EmptyListException("Список пуст");
            } else {
                System.out.println(people);
            }
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 10).collect(Collectors.toList());
        try {
            if (filteredPeople.isEmpty()) {
                throw new NoMatchingDataException("Людей старше 10 нет в списке");
            } else {
                System.out.println(filteredPeople);
            }
        } catch (NoMatchingDataException e) {
            System.out.println(e.getMessage());
        }

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName)
                        .reversed())
                .toList();
        try {
            if (sortedPeople.contains(null)) {
                throw new SortingException("Есть пустые строки в списке");
            } else {
                System.out.println(sortedPeople);
            }
        } catch (SortingException e) {
            System.out.println(e.getMessage());
        }

        try {
            String aggregation = people.stream()
                    .map(Person::getName)
                    .collect(Collectors.joining(", "));
            System.out.println(aggregation);
        } catch (NullPointerException e) {
            throw new AggregationException(e.getMessage());
        }
    }
}

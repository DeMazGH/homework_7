import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        homework7();
    }

    public static void homework7() {
        //task1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s\n", fullName);

        //task2

        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

        //task3

        fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е").replace("Ё", "Е");
        System.out.println(fixedFullName);

//task 4-7: https://skypro.slack.com/archives/C02R4PPHQGM/p1658926227724979

        //task4

        fullName = "Petrov Petr Petrovich";
        firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        middleName = fullName.substring(fullName.lastIndexOf(' ') + 1);
        lastName = fullName.substring(0, fullName.indexOf(' '));

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        //task5

        fullName = "ivanov ivan ivanovich";
        char[] name = fullName.toCharArray();
        name[0] = Character.toUpperCase(name[0]);
        name[fullName.indexOf(' ') + 1] = Character.toUpperCase(name[fullName.indexOf(' ') + 1]);
        name[fullName.lastIndexOf(' ') + 1] = Character.toUpperCase(name[fullName.lastIndexOf(' ') + 1]);

        StringBuilder fullNameBuilder = new StringBuilder();
        for (char c : name) {
            fullNameBuilder.append(c);
        }
        fullName = fullNameBuilder.toString();

        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);

        //task 6

        String firstSetOfNumbers = "135";
        String secondSetOfNumbers = "246";
        String fullSetOfNumbers;

        char[] firstSet = firstSetOfNumbers.toCharArray();
        char[] secondSet = secondSetOfNumbers.toCharArray();

        StringBuilder fullSet = new StringBuilder();
        for (int i = 0; i < firstSet.length; i++) {
            fullSet.append(firstSet[i]);
            fullSet.append(secondSet[i]);
        }
        fullSetOfNumbers = fullSet.toString();
        System.out.println(fullSetOfNumbers);

        //task7

        String setOfLetters = "gkaabcccpfrtprcddefgghiijjkk";

        String[] setSplitted = setOfLetters.split("");
        Arrays.sort(setSplitted);

        for (int i = 0; i < setSplitted.length - 1; i++) {
            if (setSplitted[i].equals(setSplitted[i + 1])) {
                setSplitted[i] = "";
            }
        }
        setOfLetters = String.join("", setSplitted);

        System.out.println(setOfLetters);

    }
}
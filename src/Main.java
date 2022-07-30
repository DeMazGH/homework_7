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

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //task3

        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е").replace("Ё", "Е"));

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

    }
}
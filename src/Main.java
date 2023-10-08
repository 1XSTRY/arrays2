public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        StringBuilder fullName = new StringBuilder();
        StringBuilder firstName = new StringBuilder();
        StringBuilder lastName = new StringBuilder();

        boolean spaceFound = false;

        for (char c : reverseFullName) {
            if (c == ' ') {
                spaceFound = true;
                continue;
            }

            if (!spaceFound) {
                lastName.insert(0, c);
            } else {
                firstName.insert(0, c);
            }
        }

        fullName.append(firstName).append(" ").append(lastName);

        System.out.println("Имя: " + fullName);
    }




}
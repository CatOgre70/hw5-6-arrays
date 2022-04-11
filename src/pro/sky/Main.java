package pro.sky;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nArrays. Part 1");

        // Task 1. Arrays declarations
        int[] iThree = new int[] {1, 2, 3};
        float[] fThree = {1.57f, 7.654f, 9.986f};
        char[] cString = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if(cString.length != 26)
            System.out.println("Well, you missed some letter(s) in the alphabet!");

        // Task 2. Arrays console output. I don't like to output all arrays on one line :)
        for(int i = 0; i < iThree.length-1; i++){
            System.out.print(iThree[i] + ", ");
        }
        System.out.println(iThree[iThree.length-1]);
        for(int i = 0; i < fThree.length-1; i++){
            System.out.print(fThree[i] + ", ");
        }
        System.out.println(fThree[fThree.length-1]);
        for(int i = 0; i < cString.length-1; i++){
            System.out.print(cString[i] + ", ");
        }
        System.out.println(cString[cString.length-1] + "\n");

        // Task 3. Console output in reverse order
        for(int i = iThree.length-1; i > 0 ; i--){
            System.out.print(iThree[i] + ", ");
        }
        System.out.println(iThree[0]);
        for(int i = fThree.length-1; i > 0 ; i--){
            System.out.print(fThree[i] + ", ");
        }
        System.out.println(fThree[0]);
        for(int i = cString.length-1; i > 0 ; i--){
            System.out.print(cString[i] + ", ");
        }
        System.out.println(cString[0] + "\n");

        // Task 4. All odd to even numbers
        System.out.print("Было: ");
        for(int i = 0; i < iThree.length-1; i++){
            System.out.print(iThree[i] + ", ");
            if(iThree[i] % 2 != 0)
                iThree[i]++;

        }
        System.out.println(iThree[iThree.length-1]);
        if(iThree[iThree.length-1] % 2 != 0)
            iThree[iThree.length-1]++;
        System.out.print("Стало: ");
        for(int i = 0; i < iThree.length-1; i++)
            System.out.print(iThree[i] + ", ");
        System.out.println(iThree[iThree.length-1]);

        // Arrays. Part 2
        // Task 1. All payments per month for accounting department

        System.out.println("\nArrays. Part 2");

        int allPayments = 0;
        final int ARRAY_LENGTH = 30, MIN_VALUE = 100_000, MAX_VALUE = 200_000;
        int[] paymentsDB = generateRandomArray(ARRAY_LENGTH, MIN_VALUE, MAX_VALUE);

        for(int monthPayments: paymentsDB){
            allPayments += monthPayments;
        }
        System.out.println("\nСумма трат за месяц составила " + allPayments + " рублей");

        // Task 2. Minimum and maximum payments per day
        int minPayment = paymentsDB[0], maxPayment = paymentsDB[0];

        for(int current: paymentsDB){
            if (current > maxPayment)
                maxPayment = current;
            if(current < minPayment)
                minPayment = current;
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. "
                + "Максимальная сумма трат за день составила " + maxPayment + " рублей");

        // Well, there is one unnecessary iteration in the previous code for_all cycle,
        // so the optimal version with classic for cycle

        minPayment = paymentsDB[0];
        maxPayment = paymentsDB[0];
        for(int i = 1; i < paymentsDB.length; i++){
            if (paymentsDB[i] > maxPayment)
                maxPayment = paymentsDB[i];
            if(paymentsDB[i] < minPayment)
                minPayment = paymentsDB[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. "
                + "Максимальная сумма трат за день составила " + maxPayment + " рублей");

        // Task 3. Average payment per month

        double averageMonthlyPayment = ((double) allPayments) / ARRAY_LENGTH;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyPayment
                + " рублей");

        // Task 4. Reverse name bug

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.print("Было: " );
        for (char current: reverseFullName) {
            System.out.print(current);
        }
        System.out.println();

        System.out.print("Стало: " );
        for(int i  = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }

    public static int[] generateRandomArray(int arrayLength, int minValue, int maxValue) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue - minValue) + minValue;
        }
        return arr;
    }

}

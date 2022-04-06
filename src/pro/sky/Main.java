package pro.sky;

public class Main {

    public static void main(String[] args) {

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

    }
}

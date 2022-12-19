package Models;

public class Arrays {
    public int[] numbers;
    public int count = 0;
    public int n;

    public void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != n) {
                count++;
            } else {
                System.out.println("The index of " + n + " is:" + i);
            }
        }
    }

    public int[] firstArray;
    public int[] secondArray;

    public void printArray1() {
        System.out.print("Common numbers are: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                }
            }

        }
    }

    public int[] arr;//global

    public void printArray2() {
        int k = arr.length + 1;//local
        int MissingNum;
        int sumtotal = ((k) * (1 + k)) / 2;
        int sum = 0;
        System.out.println(k);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        MissingNum = sumtotal - sum;
        System.out.println("Missing number is " + MissingNum);


    }
    public void printArrayOddEvenNumbers() {
        int[] OddNumbers = new int[numbers.length];
        int[] EvenNumbers = new int[numbers.length];
        int evenNumsIndex = 0;
        int oddNumsIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                OddNumbers[oddNumsIndex] = numbers[i];
                oddNumsIndex++;
            } else {
                EvenNumbers[evenNumsIndex] = numbers[i];
                evenNumsIndex++;
            }
        }
        System.out.print("The Array of even numbers are :");
        for (int i = 0; i < EvenNumbers.length; i++) {
            if (EvenNumbers[i] != 0) {
                System.out.print(EvenNumbers[i] + " ");
            }
        }
        System.out.println();

        System.out.print("The Array of odd numbers are :");
        for (int i = 0; i < OddNumbers.length; i++) {
            if (OddNumbers[i] != 0) {

                System.out.print(OddNumbers[i] + " ");
            }
        }
    }

    public void printminnumber(){
        int [] num =new int[] {1, 4, 7, -5, 3, 7, -32, 4, -7, 123};
        int min=num[0];
        for (int i = 0; i< num.length; i++)
            if (num[i]<min) {
                min=num[i];
            }
        System.out.println("The minimum element is " + min);
    }

}
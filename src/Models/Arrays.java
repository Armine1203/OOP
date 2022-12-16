package Models;

public class Arrays {
   public int [] numbers;
    public int count=0;
    public int n;
      public void printArray(){
        for (int i=0;i< numbers.length;i++) {
            if (numbers[i] != n) {
                count++;
            } else {
                System.out.println("The index of "+n+" is:" + i);
            }
        }
    }
    public int [] firstArray;
      public int [] secondArray;
      public void printArray1(){
          System.out.print("Common numbers are: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                }
            }

        }
    }

    public int [] arr;
  //  public int k= arr.length+1;
    //     System.out.println(n);
    public int MissingNum;
  // public int sumtotal=((k)*(1+n))/2;
    public int sum = 0;
    public void printArray2(){
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
     //   MissingNum=sumtotal-sum;
        System.out.println("Missing number is "+ MissingNum);

    }

}

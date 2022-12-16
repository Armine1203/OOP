package Objects;
import Models.Human;
import Models.Numbers;
import Models.Arrays;
public class objects {
    public static void main(String[] args) {
    // Homework1
        Human human =new Human();
        human.firstName="Armine";
        human.lastName="Lalayan";
        human.printFullName();
        human.age=19;
        human.height= (float) 1.70;
        human.weight=(float) 56.6;
        human.answer=false;
        human.Question();
//homework2
        Numbers number= new Numbers();
        number.printNumber(10,23);

        //
        Arrays array=new Arrays();
        array.numbers=new int[]{1,3,6,5,7,9,5};
        array.n=5;
        array.printArray();
        Arrays array1=new Arrays();
        array1.firstArray=new int[]{3, 6, 0, -3, 10, 8, 13};
        array1.secondArray=new int[]{2, 56, -5, 9, 45, 10, 12, 6, 13, 56};
        array1.printArray1();

        //
        Arrays array2 = new Arrays();
        array2.arr=new int[] {1,3,2,5,4,7,9,8};
   //     array2.printArray2();
    }
}

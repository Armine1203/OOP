public class Main {
    public static void main(String[] args) {
        byte x=4;
        int a=200;
        x= (byte) a;
        System.out.println(x);
        x= (byte) (x+1);//cast->(byte)
        System.out.println(x);
        x++;
        System.out.println(x);
        x+=5;
        System.out.println(x);
        x=1;
        System.out.println(x+5+" java");
        System.out.println("barev "+x+5+" java");
        System.out.println("barev "+(x+5)+" java");

        String s="7";
        //System.out.println(s+1);
        int z=Integer.parseInt(s);//wrapper Integer
        System.out.println(z+1);

        String k="5.8";
        float l= Float.parseFloat(k);
        System.out.println(l+1);

        String ss=a+" ";
/*
        *
        *
        *
        *
*/

      Student student1 = new Student();
      student1.setAge(19);
      student1.setName("Ani");
        System.out.println(student1.getName()+student1.getAge());

      Student student2 = new Student();
        System.out.println(student2.getName());

      Student student3 = new Student();
        System.out.println(student3.getName());

      Student student4= new Student("Ani");
        System.out.println(student4.getName());

      Student student5= new Student("Ani",19);
        System.out.println(student5.getName()+" "+student5.getAge());
/*
*    Student student1 = new Student();
1    student1.setAge(19);
    student1.setName("Ani");
*
*   Student student5= new Student("Ani",19);
2  System.out.println(student5.getName()+" "+student5.getAge());
*
* 1 ev 2 hamarjeq en
*
*/
        Car car1=new Car("25AA525");
        Car car2= new Car("72BB702");

//method overloading
    student1.sum(4,5);
    student1.sum(1,2,3);
    //
    student1.f();
    student1.f(1);
    student1.f(1L);
    student1.f(1,"adfdf");












    }
}
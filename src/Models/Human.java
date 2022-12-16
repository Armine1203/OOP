package Models;
public class Human {
    public String firstName;
    public String   lastName;
    public short age;
    public String pasNum;
    public float height;
    public float weight;
    public String question="Did you get vaccinated for COVID-19?";
     public boolean  answer=true;
      //  System.out.println("Your age:"+age);
    //   System.out.println("Passport number:"+Pas_Num);
    //System.out.println("Your height:"+height);

      //  System.out.println("Your weight:"+weight);
    //
   // String
  //  String  answer="No,I didn't";
//        System.out.println(question+":"+answer+" ("+n+")");
    public void printFullName(){
        System.out.println("Full name is "+ firstName+" "+lastName);
    }
    public String Question(){
        System.out.println(question);
        if (answer) {
            return "Yes,I did"  ;
        }
        else return "No, I didn't";
    }
}


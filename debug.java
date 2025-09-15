public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else{
            System.out.println("Var1 is less than or equal to 4"); //changed the statement
        }

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else (var2 < 5){
            System.out.println("Var2 is less than 5");
        } // removed the last else

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else {
            System.out.println("Var3 is less than or equal to 10"); //changed the statement
        }




        //for this section: why are we not entering the if statement?
        if ("Marist" == "marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }
      // Java is case sensitive so they are considered different even though they are the same. The two strings will never be the same since we are't asking for input so an if/else here does not make sense. Also the == could be an issue with strings.


    }
}

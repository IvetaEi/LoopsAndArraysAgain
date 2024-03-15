public class Main {
    public static void main(String[] args) {


//        //ciklai:
//        for
//        foreach
//        while
//        do while
//        (js kalboje)
//        forin
//        forout


        //for (booleanas, tai true alba false){for kunas}
        for (int i = 0; i < 5; i++) {
            System.out.println("labukas");
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {
            if (i == 2){
                continue;//praleisti skaiciu 0 1 3 4 5
            }
            System.out.println(i);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {
            if (i == 3){
                break;//nulauzti cikla 0 1 2
            }
            System.out.println(i);
        }

        System.out.println("------ extra stuff------");

        for (int i = 2; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("---------reverse---------------");

        for (int i = 5 - 1; i >= 0; i--) {//apsukame
            System.out.println(i);
        }

        System.out.println("------every second number--------");

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        System.out.println("------------division with percent symbol----------------");

        System.out.println(7 / 4);//be liekanos grazina 1
        System.out.println(7 % 4);//su liekana grazina 3, 7 - 4 = 3
        System.out.println(13 % 2);//13 - 2 = 11;9;7;5;3;1, grazins 1

        System.out.println("----------------------------");

        int i = 0;
        for ( ; i < 5; ) {
            System.out.println(i);
            i++;

        }

        System.out.println("----------------------------");

        int a = 0;
        for ( ; true ; ) {
            System.out.println(a);
            a++;
            if (a > 5){
                break;
            }

        }

        System.out.println("----------------------------");

         int counter = 0;
         while (true){
            counter++;
            System.out.println(counter);
            if (counter >= 5){
                break;
            }
        }
        System.out.println("----------------------------");

         int count = 0;

         while (true){
             int dice = 1 + (int) Math.round(Math.random()* 5);
             int dice2 = 1 + (int) Math.round(Math.random()* 5);
             count++;
             if(dice == 1 && dice2 == 1){
                 System.out.println("snake eyes :o");
                 break;
             }
         }
        System.out.println(count);

        System.out.println("---------do while----------");

         do{
             System.out.println("Hiiii");
         }while(false);//do while pirma padaro ir tik po to tikrina
        



    }
}
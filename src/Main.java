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
//        for (int i = 0; i < 5; i++) {
//            System.out.println("labukas");
//        }
//
//        System.out.println("----------------------------");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("----------------------------");
//
//        for (int i = 0; i < 5; i++) {
//            if (i == 2){
//                continue;//praleisti skaiciu 0 1 3 4 5
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("----------------------------");
//
//        for (int i = 0; i < 5; i++) {
//            if (i == 3){
//                break;//nulauzti cikla 0 1 2
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("------ extra stuff------");
//
//        for (int i = 2; i < 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("---------reverse---------------");
//
//        for (int i = 5 - 1; i >= 0; i--) {//apsukame
//            System.out.println(i);
//        }
//
//        System.out.println("------every second number--------");
//
//        for (int i = 0; i < 10; i+=2) {
//            System.out.println(i);
//        }
//
//        System.out.println("------------division with percent symbol----------------");
//
//        System.out.println(7 / 4);//be liekanos grazina 1
//        System.out.println(7 % 4);//su liekana grazina 3, 7 - 4 = 3
//        System.out.println(13 % 2);//13 - 2 = 11;9;7;5;3;1, grazins 1
//
//        System.out.println("----------------------------");
//
//        int i = 0;
//        for ( ; i < 5; ) {
//            System.out.println(i);
//            i++;
//
//        }
//
//        System.out.println("----------------------------");
//
//        int a = 0;
//        for ( ; true ; ) {
//            System.out.println(a);
//            a++;
//            if (a > 5){
//                break;
//            }
//
//        }
//
//        System.out.println("----------------------------");
//
//         int counter = 0;
//         while (true){
//            counter++;
//            System.out.println(counter);
//            if (counter >= 5){
//                break;
//            }
//        }
//        System.out.println("----------------------------");
//
//         int count = 0;
//
//         while (true){
//             int dice = 1 + (int) Math.round(Math.random()* 5);
//             int dice2 = 1 + (int) Math.round(Math.random()* 5);
//             count++;
//             if(dice == 1 && dice2 == 1){
//                 System.out.println("snake eyes :o");
//                 break;
//             }
//         }
//        System.out.println(count);
//
//        System.out.println("---------do while----------");
//
//         do{
//             System.out.println("Hiiii");
//         }while(false);//do while pirma padaro ir tik po to tikrina

        System.out.println("------------ Lengvesni --------------");
        System.out.println("------------1 uzduotis--------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");}

        System.out.println("------------2 uzduotis--------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);}

        System.out.println("------------3/4 uzduotis--------------");

        String[] plants = new String[10];
        plants[0] = "Klevas";
        plants[1] = "Tulpe";
        plants[2] = "Orchideja";
        plants[3] = "Obelis";
        plants[4] = "Azuolas";
        plants[5] = "Liepa";
        plants[6] = "Gluosnis";
        plants[7] = "Tuja";
        plants[8] = "Roze";
        plants[9] = "Rododendras";

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);}

        System.out.println("------------5 uzduotis--------------");

        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);}

        System.out.println("------------6 uzduotis--------------");

        for (int i = 10; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------------7 uzduotis--------------");

        for (int i = 10; i < 51; i++) {
            //jei dalinasi is 10 continue?
            if (i % 10 == 0){
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------------8 uzduotis--------------");

        int count = 0;
        for (int i = 0; i < 21; i++) {
            if (i == 0){
                continue;
            }
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("------------9 uzduotis--------------");

        int count1 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() < 5){
                System.out.println("+ " + plants[i] + " " + plants[i].length());

                count1++;
            }else{
                System.out.println("- " + plants[i] + " " + plants[i].length());
            }
        }
        System.out.println("Yra " + count1 + " zodziai(iu), kurie turi maziau nei 5 raides");

        System.out.println("-------------------------------------");


        int count2 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() > 7){
                System.out.println("+ " + plants[i] + " " + plants[i].length());
                count2++;
            }else{
                System.out.println("- " + plants[i] + " " + plants[i].length());
            }
        }
        System.out.println("Yra " + count2 + " zodziai(iu), kurie turi daugiau nei 7 raides");

        System.out.println("------------10 uzduotis--------------");

        int count3 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() < 10 && plants[i].length() > 5){
                System.out.println("+ " + plants[i] + " " + plants[i].length());
                count3++;
            }else{
                System.out.println("- " + plants[i] + " " + plants[i].length());
            }
        }
        System.out.println("Yra " + count3 + " zodziai(iu), kurie turi daugiau nei 5 raides, bet maziau nei 10 raidziu");

        System.out.println("------------------------------------");
        System.out.println("------------ Sunkesni --------------");
        System.out.println("----------- 1 uzduotis -------------");

        int count4 = 0;
        for (int i = 0; i < 299; i++) {
            int randomNum = (int) Math.round(Math.random() * 300);
            if (randomNum > 150){
                count4++;
            }

            if (randomNum > 275) {
                System.out.print("[" + randomNum + "]" + " ");

            }else{
                System.out.print(randomNum + " ");
            }
        }
        System.out.println("\n" + "Tarp atsitiktiniu skaiciu yra " + count4 + " skaiciu, kurie didesni uz 150");

        System.out.println("----------- 2 uzduotis -------------");

        for (int i = 1; i <= 3000 ; i++) {
           if ((i % 77) == 0){

            }
            System.out.print(i + ", ");
        }












    }
}
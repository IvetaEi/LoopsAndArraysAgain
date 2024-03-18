import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static <T> void main(String[] args) {


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
            if (i % 10 == 0){//liekana lygi 0
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

        String result = "";
        for (int i = 1; i <= 3000 ; i++) {
            if ((i % 77) == 0) {
                result+= i + ",";
            }

        }
        System.out.print(result.substring(0, result.length() -1));




//        for (int i = 1; i <= 3000 ; i++) {
//            if (i == 3000 / 77 * 77) {
//                System.out.print(i + ", ");
//                continue;
//            }
//            if (i % 77 == 0){
//                System.out.println(i + ", ");
//            }
//
//        }

//        result = "";
//        for (int i = 77; i <= 3000 ; i+= 77) {
//            result += i + ", ";
//        }

//        int amountToPrint = 0;
//        int amountPrinted = 0;
//        for (int i = 1; i <= 3000 ; i++) {
//           if ((i % 77) == 0){
//               amountToPrint++;
//            }
//            for (int i = 1; i <= 3000 ; i++) {
//                if ((i % 77) == 0){
//                    if (amountPrinted < amountToPrint--){
//                        System.out.println(i + ", ");
//                        amountPrinted++;
//                    }else{
//                        System.out.println(i);
//                    }
//                }
//
//        }


        System.out.println("\n" + "----------- 3 uzduotis -------------");

        for (int x = 0; x < 26; x++) {
            for (int y = 0; y < 26; y++) {
                if (y == y*25){
                    System.out.print(System.lineSeparator());

                }else{
                    System.out.print("* ");

                }
            }

        }

        System.out.println("\n" + "----------- 4 uzduotis -------------");
//        for (int x = 0; x < 25; x++) {
//            for (int y = 0; y < 25; y++) {
//                if (y == y * 25) {
//                    System.out.print(System.lineSeparator());
//                } else if (y == x) {
//                    System.out.print("V ");
//                } else {
//                    System.out.print("* ");
//                }
//
//            }
//        }
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                if ( i == j || i + j == (25 - 1)) {
                    System.out.print("V ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("\n" + "----------- 5 uzduotis -------------");
        System.out.println(">>> a)");

        while (true) {
            int SorH = (int) Math.round(Math.random() * 1);
            if (SorH == 0){
                System.out.println("H");
            }else{
                System.out.println("S");}

            if (SorH == 0) {
                System.out.println("iskrito herbas, metima stabdome");
                break;
            } else {
                continue;
            }
        }
        System.out.println(">>> b)");

        int count5 = 0;
        while(true) {
            int SorH = (int) Math.round(Math.random() * 1);
            if (SorH == 0) {
                System.out.println("H");
                count5++;
            } else {
                System.out.println("S");
            }

                if (count5 == 3) {
                    System.out.println("3 kartus iskrito herbas, metima stabdome");
                    break;
                } else {
                    continue;
                }
            }
        System.out.println(">>> c)");

        int count6 = 0;
        while(true) {
            int SorH = (int) Math.round(Math.random() * 1);
            if (SorH == 0) {
                System.out.println("H");
                count6++;
            } else {
                System.out.println("S");
                count6++;
                count6 = 0;
            }

                if (count6 == 3) {
                    System.out.println("3 kartus is eiles iskrito herbas, metima stabdome");
                    break;
                } else {
                    continue;
                }
        }

        System.out.println("\n" + "----------- 6 uzduotis -------------");
        while (true){
            for (int P = 10; P <= 25; P++) {

            }
        }




        int min1 = 10;
        int max1 = 20;
        int player1 = (int) (min1 + Math.round(Math.random() * (max1 - min1) ));

        int min2 = 5;
        int max2 = 25;
        int player2 = (int) (min2 + Math.round(Math.random() * (max2 - min2) ));

        System.out.print("Petras surinko " + player1 + " tasku(us), o Kazys surinko " + player2 + " tasku(us). ");

        if (player1 > player2){
            System.out.println("Partiją laimėjo: Petras");
        }else{
            System.out.println("Partiją laimėjo: Kazys");
        }

        System.out.println("\n" + "----------- 7 uzduotis -------------");










    }
}
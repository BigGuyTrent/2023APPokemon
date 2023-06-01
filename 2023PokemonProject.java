import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        int p1AHP;
        int p2AHP;

        Pokemon p1t = null;
        Pokemon p2t = null;

        // p1
        System.out.println("Player 1, Which Pokemon Do you wish to use? Your options are: ");
        System.out.println("Aerodactyl, Arcanine, Blissey, Flygon, Gardevoir, Gengar, Heracross, Jolteon, Metagross, Milotic, Sceptile, and Sneasel");
        Scanner s = new Scanner(System.in);
        while (true) {
            String strP1 = s.nextLine();
            if (strP1.equals("Aerodactyl")) {
                p1t = new Aerodactyl();
                break;
            } else if (strP1.equals("Sneasel")) {
                p1t = new Sneasel();
                break;
            } else if (strP1.equals("Sceptile")) {
                p1t = new Sceptile();
                break;
            } else if (strP1.equals("Milotic")) {
                p1t = new Milotic();
                break;
            } else if (strP1.equals("Metagross")) {
                p1t = new Metagross();
                break;
            } else if (strP1.equals("Jolteon")) {
                p1t = new Jolteon();
                break;
            } else if (strP1.equals("Heracross")) {
                p1t = new Heracross();
                break;
            } else if (strP1.equals("Gengar")) {
                p1t = new Gengar();
                break;
            } else if (strP1.equals("Gardevoir")) {
                p1t = new Gardevoir();
                break;
            } else if (strP1.equals("Flygon")) {
                p1t = new Flygon();
                break;
            } else if (strP1.equals("Blissey")) {
                p1t = new Blissey();
                break;
            } else if (strP1.equals("Arcanine")) {
                p1t = new Arcanine();
                break;
            } else {
                System.out.println("That's not one of the options silly");
            }
        }

        p1AHP = p1t.getHp();

        // p2
        System.out.println("Player 2, Which Pokemon Do you wish to use? Your options are: ");
        System.out.println("Aerodactyl, Arcanine, Blissey, Flygon, Gardevoir, Gengar, Heracross, Jolteon, Metagross, Milotic, Sceptile, and Sneasel");
        while (true) {
            String strP2 = s.nextLine();
            if (strP2.equals("Aerodactyl")) {
                p2t = new Aerodactyl();
                break;
            } else if (strP2.equals("Sneasel")) {
                p2t = new Sneasel();
                break;
            } else if (strP2.equals("Sceptile")) {
                p2t = new Sceptile();
                break;
            } else if (strP2.equals("Milotic")) {
                p2t = new Milotic();
                break;
            } else if (strP2.equals("Metagross")) {
                p2t = new Metagross();
                break;
            } else if (strP2.equals("Jolteon")) {
                p2t = new Jolteon();
                break;
            } else if (strP2.equals("Heracross")) {
                p2t = new Heracross();
                break;
            } else if (strP2.equals("Gengar")) {
                p2t = new Gengar();
                break;
            } else if (strP2.equals("Gardevoir")) {
                p2t = new Gardevoir();
                break;
            } else if (strP2.equals("Flygon")) {
                p2t = new Flygon();
                break;
            } else if (strP2.equals("Blissey")) {
                p2t = new Blissey();
                break;
            } else if (strP2.equals("Arcanine")) {
                p2t = new Arcanine();
                break;
            } else {
                System.out.println("That's not one of the options silly");
            }
        }

        Pokemon p1 = p1t;
        Pokemon p2 = p2t;
        int p1d = 0;
        int p2d = 0;
        boolean p1win;

        p2AHP = p2t.getHp();
        System.out.println(p1.getName() + " has " + p1.getHp() + " HP and " + p2.getName() + " has " + p2.getHp() + " HP");
        if (p1.getSpd() >= p2.getSpd()) {
            String p1move;
        String p2move;
            while (true) {
                System.out.println("Player 1, what move do you want to use?");
                System.out.println("Your options are: " + p1.getMoveName1() + ", " + p1.getMoveName2() + ", " + p1.getMoveName3() + ", " + p1.getMoveName4());
               while(true){
                p1move = s.nextLine();
                if (p1move.equals(p1.getMoveName1())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP1(), p1.getMoveName1(), p1.getMoveType1(), p1.getMoveAccuracy1());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;
                    break;
                }
                if (p1move.equals(p1.getMoveName2())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP2(), p1.getMoveName2(), p1.getMoveType2(), p1.getMoveAccuracy2());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;
                    break;
                }
                if (p1move.equals(p1.getMoveName3())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP3(), p1.getMoveName3(), p1.getMoveType3(), p1.getMoveAccuracy3());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;
                    break;
                }
                if (p1move.equals(p1.getMoveName4())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP4(), p1.getMoveName4(), p1.getMoveType4(), p1.getMoveAccuracy4());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;
                    break;
                }
                else{
                    System.out.println("Thats not an option silly");
                }
               }
                if (p2AHP <= 0) {
                    System.out.println(p2.getName() + " has fainted");
                    break;
                }
                System.out.println(p2.getName() + " has " + p2AHP + " HP left!");
                
                System.out.println("Player 2, what move do you want to use?");
                System.out.println("Your options are: " + p2.getMoveName1() + ", " + p2.getMoveName2() + ", " + p2.getMoveName3() + ", " + p2.getMoveName4());
                while(true){
                p2move = s.nextLine();
                if (p2move.equals(p2.getMoveName1())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP1(), p2.getMoveName1(), p2.getMoveType1(), p2.getMoveAccuracy1());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;

                    break;
                }
                if (p2move.equals(p2.getMoveName2())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP2(), p2.getMoveName2(), p2.getMoveType2(), p2.getMoveAccuracy2());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;

                    break;
                }
                if (p2move.equals(p2.getMoveName3())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP3(), p2.getMoveName3(), p2.getMoveType3(), p2.getMoveAccuracy3());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;

                    break;
                }
                if (p2move.equals(p2.getMoveName4())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP4(), p2.getMoveName4(), p2.getMoveType4(), p2.getMoveAccuracy4());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;

                    break;
                }
                else{
                    System.out.println("thats not an option silly");
                }
                }

                if (p1AHP <= 0) {
                    System.out.println(p1.getName() + " has fainted");
                    break;
                }
                System.out.println(p1.getName() + " has " + p1AHP + " HP left!");
            }
        }
        else{
        String p1move;
        String p2move;
            while(true){
              System.out.println("Player 2, what move do you want to use?");
                System.out.println("Your options are: " + p2.getMoveName1() + ", " + p2.getMoveName2() + ", " + p2.getMoveName3() + ", " + p2.getMoveName4());
                while(true){
                p2move = s.nextLine();
                if (p2move.equals(p2.getMoveName1())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP1(), p2.getMoveName1(), p2.getMoveType1(), p2.getMoveAccuracy1());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;
                    break;
                }
                if (p2move.equals(p2.getMoveName2())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP2(), p2.getMoveName2(), p2.getMoveType2(), p2.getMoveAccuracy2());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;
                    break;
                }
                if (p2move.equals(p2.getMoveName3())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP3(), p2.getMoveName3(), p2.getMoveType3(), p2.getMoveAccuracy3());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;
                    break;
                }
                if (p2move.equals(p2.getMoveName4())) {
                    p2d = p2.calculateDamage(p2, p1, p1.getType1(), p1.getType2(), p1.getDef(), p1.getSpdef(), p2.getBP4(), p2.getMoveName4(), p2.getMoveType4(), p2.getMoveAccuracy4());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p1AHP = p1AHP - p2d;
                    break;
                
                }
                else{
                    System.out.println("Thats not an option silly");
                }
                }

                if (p1AHP <= 0) {
                    System.out.println(p1.getName() + " has fainted");
                    break;
                }
                System.out.println(p1.getName() + " has " + p1AHP + " HP left!");

                System.out.println("Player 1, what move do you want to use?");
                System.out.println("Your options are: " + p1.getMoveName1() + ", " + p1.getMoveName2() + ", " + p1.getMoveName3() + ", " + p1.getMoveName4());
                while(true){
                p1move = s.nextLine();
                if (p1move.equals(p1.getMoveName1())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP1(), p1.getMoveName1(), p1.getMoveType1(), p1.getMoveAccuracy1());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;

                    break;
                }
                if (p1move.equals(p1.getMoveName2())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP2(), p1.getMoveName2(), p1.getMoveType2(), p1.getMoveAccuracy2());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;

                    break;
                }
                if (p1move.equals(p1.getMoveName3())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP3(), p1.getMoveName3(), p1.getMoveType3(), p1.getMoveAccuracy3());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;

                    break;
                }
                if (p1move.equals(p1.getMoveName4())) {
                    p1d = p1.calculateDamage(p1, p2, p2.getType1(), p2.getType2(), p2.getDef(), p2.getSpdef(), p1.getBP4(), p1.getMoveName4(), p1.getMoveType4(), p1.getMoveAccuracy4());
                    //calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc)
                    p2AHP = p2AHP - p1d;
                    if(p2AHP <= 0){

                    }

                    break;
                }
                else{
                    System.out.println("Thats not an option silly");
                }
                }
                if (p2AHP <= 0) {
                    System.out.println(p2.getName() + " has fainted");
                    break;
                }
                System.out.println(p2.getName() + " has " + p2AHP + " HP left!");
            }
        }
        if(p1AHP <= 0){
            System.out.println(p2.getName() + " has won!");
        }
        if(p2AHP <= 0){
            System.out.println(p1.getName() + " has won!");
        }

    }
}
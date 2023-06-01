package pkg;
// Test
public class Pokemon{
public String name;
public static int ISE;
public static int damage;
public static int crit;
public int level;
public String Type1;
public String Type2;
public int movenum1;
public String m1;
public String m1t;
public int m1p;
public int m1a;
public int movenum2;
public String m2;
public String m2t;
public int m2p;
public int m2a;
public int movenum3;
public String m3;
public String m3t;
public int m3p;
public int m3a;
public int movenum4;
public String m4;
public String m4t;
public int m4p;
public int m4a;
public int HP;
public int atk;
public int spatk;
public int def;
public int spdef;
public int spd;

public Pokemon() {
name = "none";
level = 100;
Type1 = "Fire";
Type2 = "Water";
movenum1 = 1;
m1t = "Fire";
m1 = "Ember";
m1p = 50;
m1a = 0;
movenum2 = 2;
m2t = "Water";
m2 = "Surf";
m2p = 70;
m2a = 0;
movenum3 = 3;
m3t = "Grass";
m3 = "Leaf blade";
m3p = 80;
m3a = 0;
movenum4 = 4;
m4t = "Fighting";
m4 = "Close combat";
m4p = 120;
m4a = 0;
HP = 50;
atk = 50;
spatk = 50;
def = 50;
spdef = 50;
spd = 50;
}



public String getName(){
    return name;
}

public int getHp(){
    return HP;
}

public int getAtk(){
    return atk;
}

public int getSpatk(){
    return spatk;
}

public int getDef(){
    return def;
}

public int getSpdef(){
    return spdef;
}

public int getSpd(){
    return spd;
}

public String getType1(){
    return Type1;
}

public String getType2(){
    return Type2;
}

public int getMoveAccuracy1(){
    return m1a;
}

public int getMoveAccuracy2(){
    return m2a;
}

public int getMoveAccuracy3(){
    return m3a;
}

public int getMoveAccuracy4(){
    return m4a;
}

public int getBP1(){
    return m1p;
}

public int getBP2(){
    return m2p;
}

public int getBP3(){
    return m3p;
}

public int getBP4(){
    return m4p;
}

public String getMoveType1(){
    return m1t;
}

public String getMoveType2(){
    return m2t;
}

public String getMoveType3(){
    return m3t;
}

public String getMoveType4(){
    return m4t;
}

public String getMoveName1(){
    return m1;
}

public String getMoveName2(){
    return m2;
}

public String getMoveName3(){
    return m3;
}

public String getMoveName4(){
    return m4;
}


public static int isSuperEffective(String movetype, String Type1, String Type2){
int SupEff = 3; 
if(movetype.equals("Normal")){

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff -= 1;
}

if(Type1.equals("Ghost") || Type2.equals("Ghost")){
    SupEff = -100;
   
    return SupEff;
}

}
else if(movetype.equals("Fire")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff -= 1;
}

if(Type1.equals("Water") || Type2.equals("Water")){
    SupEff -= 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff += 1;
}

if(Type1.equals("Ice") || Type2.equals("Ice")){
    SupEff += 1;
}

if(Type1.equals("Bug") || Type2.equals("Bug")){
    SupEff += 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff -= 1;
}

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff -= 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff += 1;
}

}
else if(movetype.equals("Water")){
    
if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff += 1;
}

if(Type1.equals("Water") || Type2.equals("Water")){
    SupEff -= 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff -= 1;
}

if(Type1.equals("Ground") || Type2.equals("Ground")){
    SupEff += 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff += 1;
}

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff -= 1;
}

}
else if(movetype.equals("Electric")){

if(Type1.equals("Water") || Type2.equals("Water")){
    SupEff += 1;
}

if(Type1.equals("Electric") || Type2.equals("Electric")){
    SupEff -= 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff -= 1;
}

if(Type1.equals("Ground") || Type2.equals("Ground")){
    SupEff = -100;
     
    return SupEff;
}

if(Type1.equals("Flying") || Type2.equals("Flying")){
    SupEff += 1;
}

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff -= 1;
}

}
else if(movetype.equals("Grass")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff -= 1;
}

if(Type1.equals("Water") || Type2.equals("Water")){
    SupEff += 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff -= 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff -= 1;
}

if(Type1.equals("Ground") || Type2.equals("Ground")){
    SupEff += 1;
}

if(Type1.equals("Fly") || Type2.equals("Fly")){
    SupEff -= 1;
}

if(Type1.equals("Bug") || Type2.equals("Bug")){
    SupEff -= 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff += 1;
}

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff -= 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

}
else if(movetype.equals("Ice")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff -= 1;
}

if(Type1.equals("Water") || Type2.equals("Water")){
    SupEff -= 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff += 1;
}

if(Type1.equals("Ice") || Type2.equals("Ice")){
    SupEff -= 1;
}

if(Type1.equals("Ground") || Type2.equals("Ground")){
    SupEff += 1;
}

if(Type1.equals("Flying") || Type2.equals("Flying")){
    SupEff += 1;
}

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

}
else if(movetype.equals("Fighting")){

if(Type1.equals("Normal") || Type2.equals("Normal")){
    SupEff += 1;
}

if(Type1.equals("Ice") || Type2.equals("Ice")){
    SupEff += 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff -= 1;
}

if(Type1.equals("Flying") || Type2.equals("Flying")){
    SupEff -= 1;
}

if(Type1.equals("Psychic") || Type2.equals("Psychic")){
    SupEff += 1;
}

if(Type1.equals("Bug") || Type2.equals("Bug")){
    SupEff -= 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff += 1;
}

if(Type1.equals("Ghost") || Type2.equals("Ghost")){
    SupEff = -100;
    
    return SupEff;
}

if(Type1.equals("Dark") || Type2.equals("Dark")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff += 1;
}

if(Type1.equals("Fairy") || Type2.equals("Fairy")){
    SupEff += 1;
}

}
else if(movetype.equals("Poison")){

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff += 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff -= 1;
}

if(Type1.equals("Ground") || Type2.equals("Ground")){
    SupEff -= 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff -= 1;
}

if(Type1.equals("Ghost") || Type2.equals("Ghost")){
    SupEff -= 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff = -100;
  
    return SupEff;
}

if(Type1.equals("Fairy") || Type2.equals("Fairy")){
    SupEff += 1;
}

}
else if(movetype.equals("Ground")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff += 1;
}

if(Type1.equals("Electric") || Type2.equals("Electric")){
    SupEff += 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff -= 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff += 1;
}

if(Type1.equals("Flying") || Type2.equals("Flying")){
    SupEff = -100;
    
    return SupEff;
}

if(Type1.equals("Bug") || Type2.equals("Bug")){
    SupEff -= 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff += 1;
}

}
else if(movetype.equals("Flying")){

if(Type1.equals("Electric") || Type2.equals("Electric")){
    SupEff -= 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff += 1;
}

if(Type1.equals("Fighting") || Type2.equals("Fighting")){
    SupEff += 1;
}

if(Type1.equals("Bug") || Type2.equals("Bug")){
    SupEff += 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff -= 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

}
else if(movetype.equals("Psychic")){

if(Type1.equals("Fighting") || Type2.equals("Flying")){
    SupEff += 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff += 1;
}

if(Type1.equals("Psychic") || Type2.equals("Psychic")){
    SupEff -= 1;
}

if(Type1.equals("Dark") || Type2.equals("Dark")){
    SupEff = -100;
    
    return SupEff;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

}
else if(movetype.equals("Bug")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff -= 1;
}

if(Type1.equals("Grass") || Type2.equals("Grass")){
    SupEff += 1;
}

if(Type1.equals("Fighting") || Type2.equals("Fighting")){
    SupEff -= 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff -= 1;
}

if(Type1.equals("Flying") || Type2.equals("Flying")){
    SupEff -= 1;
}

if(Type1.equals("Psychic") || Type2.equals("Psychic")){
    SupEff += 1;
}

if(Type1.equals("Ghost") || Type2.equals("Ghost")){
    SupEff -= 1;
}

if(Type1.equals("Dark") || Type2.equals("Dark")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

if(Type1.equals("Fairy") || Type2.equals("Fairy")){
    SupEff -= 1;
}

}
else if(movetype.equals("Rock")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff += 1;
}

if(Type1.equals("Ice") || Type2.equals("Ice")){
    SupEff += 1;
}

if(Type1.equals("Fighting") || Type2.equals("Fighting")){
    SupEff -= 1;
}

if(Type1.equals("Ground") || Type2.equals("Ground")){
    SupEff -= 1;
}

if(Type1.equals("Flying") || Type2.equals("Flying")){
    SupEff += 1;
}

if(Type1.equals("Bug") || Type2.equals("Bug")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

}
else if(movetype.equals("Ghost")){

if(Type1.equals("Normal") || Type2.equals("Normal")){
    SupEff = -100;
    
    return SupEff;
}

if(Type1.equals("Psychic") || Type2.equals("Psychic")){
    SupEff += 1;
}

if(Type1.equals("Ghost") || Type2.equals("Ghost")){
    SupEff += 1;
}

if(Type1.equals("Dark") || Type2.equals("Dark")){
    SupEff -= 1;
}

}
else if(movetype.equals("Dragon")){

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

if(Type1.equals("Fairy") || Type2.equals("Fairy")){
    SupEff = -100;
    return SupEff;
}

}
else if(movetype.equals("Dark")){
    
if(Type1.equals("Fighting") || Type2.equals("Fighting")){
    SupEff -= 1;
}

if(Type1.equals("Psychic") || Type2.equals("Psychic")){
    SupEff += 1;
}

if(Type1.equals("Ghost") || Type2.equals("Ghost")){
    SupEff += 1;
}

if(Type1.equals("Dark") || Type2.equals("Dark")){
    SupEff -= 1;
}

if(Type1.equals("Fairy") || Type2.equals("Fairy")){
    SupEff -= 1;
}

}
else if(movetype.equals("Steel")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff -= 1;
}

if(Type1.equals("Water") || Type2.equals("Water")){
    SupEff -= 1;
}

if(Type1.equals("Electric") || Type2.equals("Electric")){
    SupEff -= 1;
}

if(Type1.equals("Ice") || Type2.equals("Ice")){
    SupEff += 1;
}

if(Type1.equals("Rock") || Type2.equals("Rock")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff -= 1;
}

if(Type1.equals("Fairy") || Type2.equals("Fairy")){
    SupEff += 1;
}

}
else if(movetype.equals("Fairy")){

if(Type1.equals("Fire") || Type2.equals("Fire")){
    SupEff -= 1;
}

if(Type1.equals("Fighting") || Type2.equals("Fighting")){
    SupEff += 1;
}

if(Type1.equals("Poison") || Type2.equals("Poison")){
    SupEff -= 1;
}

if(Type1.equals("Dragon") || Type2.equals("Dragon")){
    SupEff += 1;
}

if(Type1.equals("Dark") || Type2.equals("Dark")){
    SupEff += 1;
}

if(Type1.equals("Steel") || Type2.equals("Steel")){
    SupEff = 1;
}

}
return SupEff;
}

 public static boolean DidItLand(int MoveAccuracy) {
 int hit = (int) (Math.random() * (100 - 0 + 1)) + 0;
 if (hit > MoveAccuracy){
    return false;
 }
 else{
    return true;
 }

}



 public static int calculateDamage(Pokemon opping, Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower,String movename, String movetype, int MoveAcc) {
        // Damage calculation formula in Generation 1
        boolean Cheese = opping.DidItLand(MoveAcc);
        if(Cheese == true)
        {
        if(movetype.equals("Normal") || movetype.equals("Fighting") || movetype.equals("Poison") || movetype.equals("Ground") || movetype.equals("Flying") || movetype.equals("Bug") || movetype.equals("Rock") || movetype.equals("Ghost") || movetype.equals("Steel"))
        {
        damage = (((((2 * 100) / 5) + 2) * basePower * opping.getAtk()) / OpDef) / 50 + 2;
        crit = (int) (Math.random() * (400 - 0 + 1)) + 0;
        ISE = isSuperEffective(movetype, defing.getType1(), defing.getType2());
        if (crit <= 25)
        {
            System.out.println("Its a critical hit!");
            damage = damage * 2;
        }
        if(movetype == opping.getType1() || movetype == opping.getType2())
        {
            damage = damage * 3/2;
        }
        if(ISE <= -100)
        {
            damage = 0;
            System.out.println("It has no effect");
            return damage;
        }
        if(ISE <= 1)
        {
            System.out.println("It was not very effective");
        damage = damage/4;
        }
        if(ISE == 2)
        {
            System.out.println("It was not very effective");
        damage = damage/2;
        }
        if(ISE == 3)
        {
        damage = damage * 1;
        }
        if(ISE == 4)
        {
        System.out.println("It was super effective!");
        damage = damage * 2;
        }
        if(ISE >= 5)
        {
        System.out.println("It was super effective!");
        damage = damage * 5;
        }
        int rdmgp = (int) (Math.random() * (255 - 217 + 1)) + 217;
        damage = damage * rdmgp;
        damage = damage/255;
        }

        if (movetype.equals("Fire") || movetype.equals("Water") || movetype.equals("Electric") || movetype.equals("Grass") || movetype.equals("Ice") || movetype.equals("Psychic") || movetype.equals("Dragon") || movetype.equals("Dark") || movetype.equals("Fairy"))
        {
            damage = (((((2 * 100) / 5) + 2) * basePower * opping.getSpatk()) / OpSpDef) / 50 + 2;

            crit = (int) (Math.random() * (400 - 0 + 1)) + 0;
            ISE = isSuperEffective(movetype, defing.getType1(), defing.getType2());

            if (crit <= 25)
        {
            System.out.println("Its a critical hit!");
            damage = damage * 2;

        }
        if(movetype == opping.getType1() || movetype == opping.getType2())
        {
            damage = damage * 3/2;

        }
        if(ISE <= -100)
        {
            damage = 0;
            System.out.println("It has no effect");

            return damage;
        }
        if(ISE <= 1)
        {
            System.out.println("It was not very effective");
        damage = damage/4;
        }
        if(ISE == 2)
        {
            System.out.println("It was not very effective");
        damage = damage/2;
        }
        if(ISE == 3)
        {
        damage = damage * 1;
        }
        if(ISE == 4)
        {
        System.out.println("It was super effective!");
        damage = damage * 2;
        }
        if(ISE == 5)
        {
        System.out.println("It was super effective!");
        damage = damage * 5;
        }
        int rdmg = (int) (Math.random() * (255 - 217 + 1)) + 217;
        damage = damage * rdmg;
        damage = damage/255;
        }
        return damage;    
        }
        if(Cheese == false)
        {
            System.out.println("Your move, " + movename + " missed!");
            damage = 0;
            return damage;
        }
        return damage;
}



//{

}
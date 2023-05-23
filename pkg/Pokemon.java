package pkg;
// Test
public class Pokemon{
public String name;
public int level;
public String Type1;
public String Type2;
public int movenum1 = 1;
public String m1;
public String m1t;
public int m1p;
public int movenum2 = 2;
public String m2;
public String m2t;
public int m2p;
public int movenum3 = 3;
public String m3;
public String m3t;
public int m3p;
public int movenum3 = 1;
public String m4;
public String m4t;
public int m4p;
public int HP;
public int atk;
public int spatk;
public int def;
public int spdef;
public int spd;

public Pokemon () {
public String name = "none";
public int level = 100;
public String Type1 = null;
public String Type2 = null;
public int movenum1 = 1;
public String m1t = "Fire";
public String m1 = "Ember";
public int m1p = 50;
public int movenum2 = 2;
public String m2t = "Water";
public String m2 = "Surf";
public int m2p = 70;
public int movenum3 = 3;
public String m3t = "Grass";
public String m3 = "Leaf blade";
public int m3p = 80;
public int movenum4 = 4;
public String m4t = "Fighting";
public String m4 = "Close combat";
public int m4p = 120;
public int HP = 50;
public int atk = 50;
public int spatk = 50;
public int def = 50;
public int spdef = 50;
public int spd = 50;
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

public int isSuperEffective(movetype, Type1, Type2){
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
if(movetype.equals("Fire")){

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
if(movetype.equals("Water")){
    
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
if(movetype.equals("Electric")){

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
if(movetype.equals("Grass")){

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
if(movetype.equals("Ice")){

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
if(movetype.equals("Fighting")){

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
    -SupEff += 1;
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
if(movetype.equals("Poison")){

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
if(movetype.equals("Ground")){

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
if(movetype.equals("Flying")){

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
if(movetype.equals("Psychic")){

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
if(movetype.equals("Bug")){

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
    SupEff - 1;
}

}
if(movetype.equals("Rock")){

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
if(movetype.equals("Ghost")){

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
if(movetype.equals("Dragon")){

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
if(movetype.equals("Dark")){
    
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
if(movetype.equals("Steel")){

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
if(movetype.equals("Fairy")){

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


}

 public static int calculateDamage(Pokemon defing, String Optype1, String Optype2, int OpDef, int OpSpDef, int basePower, String movetype) {
        // Damage calculation formula in Generation 1
        if(movetype.equals("Normal") || movetype.equals("Fighting") || movetype.equals("Poison") || movetype.equals("Ground") || movetype.equals("Flying") || movetype.equals("Bug") || movetype.equals("Rock") || movetype.equals("Ghost") || movetype.equals("Steel"))
        {
        int damage = (((((2 * level) / 5) + 2) * basePower * atk) / OpDef) / 50 + 2;
        int crit = (int) (Math.random() * (400 - 0 + 1)) + 0;
        int ISE == isSuperEffective(movetype, defing.getType1, defing.getType2)
        if (crit <= 25)
        {
            System.out.println("Its a critical hit!");
            damage = damage * 2;
        }
        if(movetype == Type1 || movetype == Type2)
        {
            damage = damage * 1.5;
        }
        if(ISE == -100)
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
        if(ISE) >= 5)
        {
        System.out.println("It was super effective!");
        damage = damage * 5;
        }
        damage = damage * (int) (Math.random() * (255 - 217 + 1)) + 217;
        damage = damage/255;
        }

        if (movetype.equals("Fire") || movetype.equals("Water") || movetype.equals("Electric") || movetype.equals("Grass") || movetype.equals("Ice") || movetype.equals("Psychic") || movetype.equals("Dragon") || movetype.equals("Dark") || movetype.equals("Fairy"))
        {
            int damage = (((((2 * level) / 5) + 2) * basePower * spatk) / OpSpDef) / 50 + 2;
        int crit = (int) (Math.random() * (400 - 0 + 1)) + 0;
        if (crit <= 25)
        {
            System.out.println("Its a critical hit!");
            damage = damage * 2;
        }
        if(movetype == Type1 || movetype == Type2)
        {
            damage = damage * 1.5;
        }
        if(ISE == 0)
        {
            damage = 0;
            System.out.println("It has no effect");
            return damage;
        }
        if(isSuperEffective == 1)
        {
            System.out.println("It was not very effective");
        damage = damage/4;
        }
        if(isSuperEffective == 2)
        {
            System.out.println("It was not very effective");
        damage = damage/2;
        }
        if(isSuperEffective == 3)
        {
        damage = damage * 1;
        }
        if(isSuperEffective == 4)
        {
        System.out.println("It was super effective!");
        damage = damage * 2;
        }
        if(isSuperEffective == 5)
        {
        System.out.println("It was super effective!");
        damage = damage * 5;
        }
        damage = damage * (int) (Math.random() * (255 - 217 + 1)) + 217;
        damage = damage/255;
        }
        return damage;    
    
}





}
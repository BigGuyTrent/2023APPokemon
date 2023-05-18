package pkg;

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
public String m1t = "fire";
public String m1 = "ember";
public int m1p = 50;
public int movenum2 = 2;
public String m2t = "water";
public String m2 = "surf";
public int m2p = 70;
public int movenum3 = 3;
public String m3t = "grass";
public String m3 = "leaf blade";
public int m3p = 80;
public int movenum4 = 4;
public String m4t = "fighting";
public String m4 = "close combat";
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

public int isSuperEffective(movetype){

}

 public static int calculateDamage(String Optype1, String Optype2, int OpDef, int basePower, String movetype) {
        // Damage calculation formula in Generation 1
        int damage = (((((2 * level) / 5) + 2) * basePower * atk) / OpDef) / 50 + 2;
        if(movetype == Type1 || movetype == Type2)
        {
            damage = damage * 1.5;
        }
        if(isSuperEffective == 1)
        {
        damage = damage/4;
        }
        if(isSuperEffective == 2)
        {
        damage = damage/2;
        }
        if(isSuperEffective == 3)
        {
        damage = damage * 1;
        }
        if(isSuperEffective == 4)
        {
        damage = damage * 2;
        }
        if(isSuperEffective == 5)
        {
        damage = damage * 5;
        }
        Math.random()



        return damage;    
    
}





}
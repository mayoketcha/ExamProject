import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("勇者", "剣", 100);
        Wizard w = new Wizard("魔法使い",60,20);
        Thief t = new Thief("盗賊",70);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(h);
        characters.add(w);
        characters.add(t);
        for  (Character c : characters) {}

        Matango m = new Matango(45,'A');
        Goblin g = new Goblin(50,'A');
        Slime s = new Slime(40,'A');
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);
        for  (Monster r : monsters) {}

        System.out.print("---味方パーティ---\n");
        h.showStatus();
        w.showStatus();
        t.showStatus();

        System.out.print("---敵グループ---\n");
        m.showStatus();
        g.showStatus();
        s.showStatus();

        System.out.print("\n味方の総攻撃！\n");
        for(Character c : characters) {
            c.attack(m);
            c.attack(g);
            c.attack(s);
        }

        System.out.print("\n敵の総攻撃！\n");
        for(Monster r : monsters) {
            r.attack(h);
            r.attack(w);
            r.attack(t);
        }

        SuperHero sh = new SuperHero("勇者", "剣", h.hp);
        System.out.println("\nダメージを受けた勇者が突然光りだした！");
        System.out.println(sh.getName() + "はスーパーヒーローに進化した！");
        sh.attack(m);
        sh.attack(g);
        sh.attack(s);

        System.out.println("\n---味方パーティ最終ステータス---");
        h.showStatus();
        if (h.isAlive()) {
            System.out.println("生存状況: 生存");
        }  else {
            System.out.println("生存状況: 戦闘不能");
        }
        w.showStatus();
        if (w.isAlive()) {
            System.out.println("生存状況: 生存");
        }  else {
            System.out.println("生存状況: 戦闘不能");
        }
        t.showStatus();
        if (t.isAlive()) {
            System.out.println("生存状況: 生存");
        }  else {
            System.out.println("生存状況: 戦闘不能");
        }

        System.out.println("\n---敵グループ最終ステータス---");
        m.showStatus();
        if (m.isAlive()) {
            System.out.println("生存状況: 生存");
        }  else {
            System.out.println("生存状況: 討伐済み");
        }
        g.showStatus();
        if (g.isAlive()) {
            System.out.println("生存状況: 生存");
        }  else {
            System.out.println("生存状況: 討伐済み");
        }
        s.showStatus();
        if (s.isAlive()) {
            System.out.println("生存状況: 生存");
        }  else {
            System.out.println("生存状況: 討伐済み");
        }
    }
}
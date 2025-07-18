public class Hero extends Character{

    String weapon;

    public Hero(String name,String weapon, int hp) {
        super(name,hp);
        this.weapon = weapon;
    }

    public void attack (Creature target) {
        System.out.print(name + "は" + weapon + "で攻撃！");
        System.out.println(target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp()-10);
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

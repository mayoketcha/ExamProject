public class Hero extends Character{

    String weapon;

    public Hero(String name,String weapon, int hp) {
        super(name,hp);
        this.weapon = weapon;
    }

    public void attack (Creature target) {
        System.out.print(this.getName() + "は" + weapon + "で攻撃！");
        System.out.println(target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - 10);
    }
}

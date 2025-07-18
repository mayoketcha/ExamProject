public class Goblin extends Monster {

    public Goblin(int hp, char suffix) {
        super(hp, suffix);
        this.name = "ゴブリン";
    }

    public void attack (Creature target) {
        System.out.print("ゴブリン" + suffix + "はナイフで切りつけた！");
        System.out.println(target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }
}

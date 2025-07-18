public class Matango extends Monster {

    public Matango(int hp, char suffix) {
        super(hp, suffix);
        this.name = "お化けキノコ";
    }

    public void attack (Creature target) {
        System.out.print("お化けキノコ" + suffix + "は体当たり攻撃！");
        System.out.println(target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 6);
    }
}

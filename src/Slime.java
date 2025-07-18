public final class Slime extends Monster {

    public Slime(int hp, char suffix) {
        super(hp, suffix);
        this.name = "スライム";
    }

    public void attack (Creature target) {
        System.out.print("スライム" + suffix + "は体当たり攻撃！");
        System.out.println(target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}

public class Thief extends Character{

    public Thief(String name, int hp) {
        super(name, hp);
    }

    public void attack (Creature target) {
        System.out.print(name + "は素早く攻撃した！");
        System.out.println(target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}

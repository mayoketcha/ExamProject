public class SuperHero extends Hero{
    public SuperHero(String name,String weapon, int hp) {
        super(name,weapon,hp);
    }
    public void attack (Creature target) {
        System.out.print(name + "は" + weapon + "で攻撃！");
        System.out.println(target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp()-25);
    }
}
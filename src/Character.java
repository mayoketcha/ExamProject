public abstract class Character implements Creature {

    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.hp  = hp;
        this.name = name;
    }

    public Character(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるためキャラクターを作成できませんでした");
        }
    }

    public final boolean isAlive(){
        if (hp > 0){
            return true;
        } else  {
            return false;
        }
    }

    public void showStatus(){
        System.out.println(this.name + ": HP" + this.hp);
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
        if (hp > 0) {
            this.hp = hp;
        }  else {
            throw new IllegalArgumentException("初期設定に誤りがあるためキャラクターを作成できませんでした");
        }
    }
}

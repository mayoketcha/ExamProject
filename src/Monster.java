public abstract class Monster implements Creature {
    String name;
    int hp;
    char suffix;

    public Monster(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
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
        System.out.println(this.name + this.suffix + ": HP" + this.hp);
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
            this.hp = 0;
        }
    }

    public char getSuffix() {
        return this.suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}
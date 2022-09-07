//継承関係
//        元となるクラス：スーパークラス
//        新たに定義されるクラス：サブクラス

public class SuperHero extends Hero {
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }

    //親のクラスメンバを小クラス側で上書きすることをオーバーライドという
    public void run() {
        System.out.println(this.name + "は撤退した。");
    }

//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        m.hp -= 5;
//        System.out.println("5ポイントのダメージを与えた。");
//        if (this.flying) {
//            m.hp -= 5;
//            System.out.println("5ポイントのダメージを与えた。");
//        }
//    }

    public void attack(Matango m) {
        //super（予約語）を付けると「今より１つ内側のインスタンス部分」を表す
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }

    public SuperHero(){
        System.out.println("SuperHeroのコンストラクタが動作");
//        super();
    }
}

package thread.attack;
public class Player {
    private int hp;
    private String name;
    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public synchronized void attacked(String attacker, int damage) {
        if (hp <= 0) {
            System.out.println(attacker + ": player is dead.");
            return;
        }
        hp -= damage;
        if (hp <= 0) {
            System.out.println(attacker + " attack...");
            System.out.println(attacker + ": 当前player的hp值= 0");
            System.out.println(attacker + ": player is dead.");
        } else {
            System.out.println(attacker + " attack...");
            System.out.println(attacker + ": 当前player的hp值= " + hp);
        }
    }
    public int getHp() {
        return hp;
    }
}
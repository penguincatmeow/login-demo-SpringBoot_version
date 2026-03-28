// src/thread/attack/PlayerSyncBlock.java
package thread.attack;

public class PlayerSyncBlock {
    private int hp;
    private String name;
    private final Object lock = new Object(); // 锁对象

    public PlayerSyncBlock(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void attacked(String attacker, int damage) {
        synchronized (lock) {  // 同步块
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
    }

    public int getHp() {
        synchronized (lock) {
            return hp;
        }
    }
}
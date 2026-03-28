// src/thread/attack/Creep.java
package thread.attack;

public class Creep implements Runnable {
    private String name;
    private Player player;
    private int attackCount = 3;
    private int damage = 20;

    public Creep(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    @Override
    public void run() {
        for (int i = 0; i < attackCount; i++) {
            player.attacked(name, damage);
            try {
                Thread.sleep(500); // 模拟攻击间隔
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " end.");
    }
}
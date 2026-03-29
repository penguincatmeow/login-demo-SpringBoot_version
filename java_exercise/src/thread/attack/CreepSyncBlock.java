// src/thread/attack/CreepSyncBlock.java
package thread.attack;

public class CreepSyncBlock implements Runnable {
    private String name;
    private PlayerSyncBlock player;
    private int attackCount = 3;
    private int damage = 20;

    public CreepSyncBlock(String name, PlayerSyncBlock player) {
        this.name = name;
        this.player = player;
    }

    @Override
    public void run() {
        for (int i = 0; i < attackCount; i++) {
            player.attacked(name, damage);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " end.");
    }
}
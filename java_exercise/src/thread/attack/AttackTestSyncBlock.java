// src/thread/attack/AttackTestSyncBlock.java
package thread.attack;

public class AttackTestSyncBlock {
    public static void main(String[] args) {
        System.out.println("=== 同步块方式 ===");
        PlayerSyncBlock player = new PlayerSyncBlock("Player", 100);

        CreepSyncBlock creepA = new CreepSyncBlock("Creep-A", player);
        CreepSyncBlock creepB = new CreepSyncBlock("Creep-B", player);

        Thread threadA = new Thread(creepA);
        Thread threadB = new Thread(creepB);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
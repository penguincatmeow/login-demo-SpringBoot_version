// src/thread/attack/AttackTestSyncMethod.java
package thread.attack;

public class AttackTestSyncMethod {
    public static void main(String[] args) {
        System.out.println("=== 同步方法方式 ===");
        Player player = new Player("Player", 100);

        Creep creepA = new Creep("Creep-A", player);
        Creep creepB = new Creep("Creep-B", player);

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
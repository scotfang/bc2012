/*
 * Base Player Class that other Robot Player types
 * will inherit from.  This class provides core
 * funcationality, such as pathfinding.
 */

package BasePlayer;
import battlecode.common.*;


/**
 *
 * @author scotfang
 */
public class Player {
 
    ControlBlock cb;
    
    public static void run(RobotController rc) {
        while (true) {
            //make decisions and stop rounds with yield()
            try {
                while (rc.isMovementActive()) {
                    rc.yield();
                }

                if (rc.canMove(rc.getDirection())) {
                    rc.moveForward();
                } else {
                    rc.setDirection(rc.getDirection().rotateRight());
                }
                rc.yield();
            } catch (Exception e) {
                System.out.println("caught exception:");
                e.printStackTrace();
            }
        }
    }
    
    /**
     * @return integer that specifies post move state (TBD)
     * */
    private int move(RobotController rc){
        return 1;
    }
    
    private int sense(RobotController rc){
        return 1;
    }
    private int attack(RobotController rc){
        return 1;
    }
    private int transferFlux(RobotController rc){
        return 1;
    }
    private int communicate(RobotController rc){
        return 1;
    }
    private int spawn(RobotController rc){
        return 1;
    }
    /**
     * bc engine implementation automatically bypasses
     * all functions prefixed with debug_* with
     * return type void during a real match.
     */
    private void debug_actions(RobotController rc){
        //do debug stuff
    }
    

    
    
    
    
}




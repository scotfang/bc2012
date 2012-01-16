/*
 * 
 */
package BasePlayer;
import battlecode.common.*;


/**
 * This class stores the current state of the Robot, and is updated with 
 * the completion of each action.
 * @author scotfang
 */
public class ControlBlock {
    //store state variables
    int bytecodes_used;
    int movement_cd;    //cd stands for cooldown
    int attack_cd; 
    MapLocation cur_loc;
}

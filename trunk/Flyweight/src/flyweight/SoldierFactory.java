/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Small
 */
/**
 * Flyweight Factory
 */
public class SoldierFactory {

    /**
     * Pool for one soldier only if there are more soldier types this can be an
     * array or list or better a HashMap
     *
     */
    private static Soldier SOLDIER;

    /**
     * getFlyweight
     *
     * @return
     */
    public static Soldier getSoldier() {

        // this is a singleton 
        // if there is no soldier 
        if (SOLDIER == null) {

            // create the soldier 
            SOLDIER = new SoldierImp();
        }

        // return the only soldier reference
        return SOLDIER;
    }
}

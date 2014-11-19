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
 * Flyweight Interface
 *
 */
public interface Soldier {

    /**
     * Move Soldier From Old Location to New Location Note that soldier location
     * is extrinsic to the SoldierFlyweight Implementation
     *
     * @param previousLocationX
     * @param previousLocationY
     * @param newLocationX
     * @param newLocationY
     */
    public void moveSoldier(int previousLocationX,
            int previousLocationY, int newLocationX, int newLocationY);
}

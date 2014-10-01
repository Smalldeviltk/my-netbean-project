/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Small
 */
public class BakeryFactory {

    public ICake MakeCake(int month) {
        ICake cakeResult = null;

        switch (month) {
            case 0:
            case 11:
                cakeResult = new SteamedCake();
                break;
            case 7:
            case 8:
                cakeResult = new MoonCake();
                break;
            default:
                cakeResult = new Cake();
                break;
        }

        return cakeResult;
    }

}

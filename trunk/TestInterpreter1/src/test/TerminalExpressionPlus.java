/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Small
 */
public class TerminalExpressionPlus implements Expression {

    public void interpret(Context context) {
        //Cong 2 phan tu phia tren dinh Stack
        context.push(context.pop() + context.pop());
    }
}

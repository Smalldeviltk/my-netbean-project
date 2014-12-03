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
public class TerminalExpressionNumber implements Expression {

    private int number;

    public TerminalExpressionNumber(int number) {
        this.number = number;
    }

    public void interpret(Context context) {
        context.push(this.number);
    }
}

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
import java.util.ArrayList;

public class NonterminalExpression implements Expression {

    private ArrayList<Expression> expressions;//tham chieu den mang Exoression con

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public void interpret(Context context) {
        if (expressions != null) {
            int size = expressions.size();
            for (Expression e : expressions) {
                e.interpret(context);
            }
        }
    }
}

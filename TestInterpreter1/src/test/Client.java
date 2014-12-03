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
import java.util.*;

public class Client {

    public static void main(String[] agrs) {
        Context context = new Context();

        // 3 3 *
        ArrayList<Expression> treeLevel1 = new ArrayList<Expression>();
        treeLevel1.add(new TerminalExpressionNumber(3));
        treeLevel1.add(new TerminalExpressionNumber(3));
        treeLevel1.add(new TerminalExpressionMutil());

        // 5 (3 3 *) +
        ArrayList<Expression> treeLevel2 = new ArrayList<Expression>();
        treeLevel2.add(new TerminalExpressionNumber(5));
        Expression nonexpLevel1 = new NonterminalExpression();
        ((NonterminalExpression) nonexpLevel1).setExpressions(treeLevel1);
        treeLevel2.add(nonexpLevel1);
        treeLevel2.add(new TerminalExpressionPlus());

        // (5 (3 3 *) +) 6 +
        ArrayList<Expression> treeLevel3 = new ArrayList<Expression>();
        Expression nonexpLevel2 = new NonterminalExpression();
        ((NonterminalExpression) nonexpLevel2).setExpressions(treeLevel2);
        treeLevel3.add(nonexpLevel2);
        treeLevel3.add(new TerminalExpressionNumber(6));
        treeLevel3.add(new TerminalExpressionPlus());

        for (Expression e : treeLevel3) {
            e.interpret(context);
        }

        if (context != null) {
            System.out.println("Ket qua: " + context.pop());
        }
    }
}

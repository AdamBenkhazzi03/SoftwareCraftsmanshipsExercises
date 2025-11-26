package be.ucll.craftsmanship.datastructures.parentheses;


public class checkParenthesisDemo {
    public static void main(String[] args) {
        System.out.println("Check Parentheses Problem");
        String expression = "((a + b) * (c - d))";

        printResult("()");              //balanced
        printResult("[()]");            //balanced
        printResult("{[()]}");          //balanced
        printResult("([{{[(())]}}])");  //balanced
        printResult("(()");             //not balanced
        printResult("aa()");            //not balanced
        printResult("{{[]()}}}}");      //not balanced


    }
    private static void printResult(String expression){
        boolean result = ParenthesesChecker.isBalanced(expression);
        System.out.println("The expression "
                    + expression + (result ? " is balanced." : " is not balanced."));
    }
}

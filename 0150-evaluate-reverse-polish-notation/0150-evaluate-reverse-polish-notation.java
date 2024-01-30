class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            if (str.length() == 1 && "+-*/".indexOf(str) != -1) {
                // It's an operator
                if (stack.size() >= 2) {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    int result = performOperation(operand1, operand2, str.charAt(0));
                    stack.push(result);
                }
            } else {
                // It's a number
                stack.push(Integer.parseInt(str));
            }
        }

        return stack.pop();
    }

    private int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stacky = new LinkedList<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stacky.pop();
                int a = stacky.pop();
                stacky.push(a + b);
            } else if (token.equals("-")) {
                int b = stacky.pop();
                int a = stacky.pop();
                stacky.push(a - b);
            } else if (token.equals("*")) {
                int b = stacky.pop();
                int a = stacky.pop();
                stacky.push(a * b);
            } else if (token.equals("/")) {
                int b = stacky.pop();
                int a = stacky.pop();
                stacky.push(a / b);
            } else {
                stacky.push(Integer.parseInt(token));
            }
        }

        return stacky.pop();
    }
}

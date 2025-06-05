import java.util.Stack;
// checks whether the brackets are balanced or not
public class ParanthesisChecker {
    public static void main(String[] args) {
        String exp = "(){}[]({[]";
        System.out.println(Check(exp));
    }

    public static boolean Check(String exp) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char current = exp.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }

            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (current == '}' && top != '{') {
                    return false;
                } else if (current == ')' && top != '(') {
                    return false;
                } else if (current == ']' && top != '[') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}

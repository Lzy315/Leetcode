package Stack;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class P20_ValidParentheses {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P20_ValidParentheses().new Solution();
        boolean res = solution.isValid("()");
        System.out.println(res);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if(s.isEmpty()){
                return true ;
            }
            Stack<Character> stack=new Stack<Character>();
            for(char c : s.toCharArray()){
                if(c=='('){
                    stack.push(')');
                }
                else if(c=='{'){
                    stack.push('}');
                }
                else if(c=='[') {
                    stack.push(']');
                }
// ||在运算时，只要左侧表达式的值为真，就不再判断右侧表达式的值了
                else if(stack.isEmpty()||c!=stack.pop()){
                    return false;
                }
/*                else if(c!=stack.pop()||stack.isEmpty()){
                    return false;
                }*/
            }
            if(stack.empty()){
                return true;
            }
            return false;
        }
    }
}

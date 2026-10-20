class Solution {
    public boolean isValid(String s) {

/*
When  encounter an opening bracket in the string,  predict its pair by pushing the corresponding closing bracket onto the stack. When you eventually reach a closing bracket in the text, you pop the top element off the stack and compare them. If the popped expected bracket perfectly matches the actual character in the string, the sequence is valid.
*/

        Deque<Character>stack =new ArrayDeque<>();

        for(char c : s.toCharArray()){

          if(c == '('){
            stack.push(')');
          }else if (c=='{'){
            stack.push('}');
          }else if(c == '['){
            stack.push(']');
          }

          else if(stack.isEmpty() || stack.pop()!=c){
            return false;
          }
        }

return stack.isEmpty();

        
    }
}


/*
for(int i=0;i<s.length();i++){
          char c=s.charAt(i);


          if(c=='(' || c=='{'||c=='['){
            stack.push(c);
          }

          else{
            if(stack.isEmpty()){
              return false;
            }

            char top=stack.peek();

            if(
              (c==')'&& top == '(')||
              (c=='}' && top=='{') ||
              (c==']' && top == '[')){
                stack.pop();
              }else{
                return false;
              }
          }
        }
        return stack.isEmpty();

*/
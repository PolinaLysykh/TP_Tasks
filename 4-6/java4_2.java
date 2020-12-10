public class java4_2 {
    public static String split(String str) {
        //число (
        int open = 0;
        //число )
        int close = 0;
        String newstr = "['";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                newstr += "(";
                open++;
            }
            if (str.charAt(i) == ')') {
                newstr += ")";
                close++;
            }
            if (open == close) {
                //ещё не конец строки
                if (i != str.length() - 1)
                    newstr += "','";
                else
                    newstr += "']";
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(split("((()))(())()()(()())"));
    }
}
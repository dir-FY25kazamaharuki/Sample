package sample;

public class Variable {

    public static void main(String[] args) {
        //numberで整数を宣言
        var number1 = 2;
        number1 = number1 * 2;
        //out.printlnでコンソールに表示
        System.out.println(number1);
        //stringで文字列を宣言
        String str1;str1 = "abc";
        //printでも表示可能だが、次に表示するアウトラインが改行されない
        System.out.print(str1);
        System.out.println(str1);
        /*var secondsPerDay = 86400; */
        var secondsPerday =24*60*60;//1日何秒
        System.out.println(secondsPerday);
        
            }
    }
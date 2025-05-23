package sample;

public class Cast {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        System.out.println( a / b );
        //doubleにしたので少数込みの計算結果が表示
        System.out.println( (double)a / b );
        //doubleにしてはいるが、同時にa/bの計算を行っているのでa/bの結果が表示される
        System.out.println( (double)(a / b) );

    }

}

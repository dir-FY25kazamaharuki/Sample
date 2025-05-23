package sample;

public class ForSample {

    public static void main(String[] args) {
        
        //１からiが10になるまで1足し続ける
        for (var i = 1; i <= 10; i++) {
            System.out.println(i);
            } 
        //20になるまで1足し続ける、2で割って余りが0なら出力（ifで決めている）
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
            // 現在の処理をスキップし、次の繰り返しに進む
            continue;
            }
            System.out.println(i);
            }
        //2スタートで2足しながら100まで行くけれど、ifとbreakで２０になれば抜け出し
        for (int i = 2; i <= 100; i+=2) {
            if (i > 20) {
            // 繰り返しから抜け出す
            break;
            }
            System.out.println(i);
        }
        //：を使うことで順番に取り出す
        var numbers = new int[] {1, 2, 3, 4, 5};
        for (var number : numbers) {
        System.out.println(number);
        //ナンバーはナンバーズから1つずつ取り出す
        }


    }

}

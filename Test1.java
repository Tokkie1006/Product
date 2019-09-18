public class Test1{
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";
        int i1 = 10;
        int i2 = 20;

        AAA aaa1 = new AAA(str1, i1);
        AAA aaa2 = new AAA(str2, i2);

        System.out.println(aaa1.x);
        System.out.println(aaa2.x);
    }
}
class AAA{
    String x;
    int y;
    public AAA(String x, int y){
        this.x = x;
        this.y = y;
    }
}
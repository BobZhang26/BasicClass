public class Class0 {
    public static int add(int one, int two) {
        return one + two;
    }
    public static void main(String[] args) {
        int result = Class0.add(3 , 5);
        System.out.println(result);
    }
}
/*
java允许一个文件里面出现多个class，但是只有一个class可以public，并且这个public class的名字必须和文件名相同。
如果一个class没有public修饰符，那么这个class的名字就不需要和文件名相同了。

main函数：主函数，java程序的入口。java会自动识别main函数。找到之后会逐行执行
main函数必须是 public static void main(String[] args) {...}
打印：System.out.println(...) shortcut: sout
 */
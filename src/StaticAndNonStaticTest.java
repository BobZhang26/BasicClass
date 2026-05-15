public class StaticAndNonStaticTest {
    int age;

    static boolean flag;

    public static void main(String[] args) {
        //知识点1: 想要调用一个non_static的filed/method：objectname。filedname/methodname（）
        StaticAndNonStaticTest test = new StaticAndNonStaticTest();
        System.out.println(test.age);

        //知识点2: 想要调用一个static field
        System.out.println(StaticAndNonStaticTest.flag);
    }

}

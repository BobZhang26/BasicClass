class Simple{
    int value;

    public Simple(int value){
        this.value=value;
    }
}

public class HarryDemo {

    

    public static void changeIntValue(int y){
        y = 10;
    }

    public static void main(String[] args){
        //question 1
        int x = 5;
        HarryDemo.changeIntValue(x);
        System.out.println(x);

    }
}

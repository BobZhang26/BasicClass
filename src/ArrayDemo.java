public class ArrayDemo {
    public static void main(String[] args) {
        // to create an array
        // ElementType[] arrayName = new ElementType[arraySize];
        // default value: zero, false, null
        //int [] bobarray = new int[10];

        // direct way to create array (not often seen)
        int [] array = new int []{3,1,2,5,4,6,7};
        // print the sum of all even number in array

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

        int [][] arrayOfArray = new int [][]{{3,4,5},{2,3},{1,5,7}};
        // find the odd sum of all odd number in the matrix arrayOfArray
        int odd_sum = 0;
        for (int i = 0; i < arrayOfArray.length; i ++){
            for (int j = 0; j < arrayOfArray[i].length; j ++){
                if (arrayOfArray[i][j]%2 != 0){
                    odd_sum += arrayOfArray[i][j];
                }
            }
        }
        System.out.println(odd_sum);


        // find the natural order of the matrix


        }
    }


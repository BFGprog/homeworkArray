public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        public class Main {
            public static void main(String[] args) {
                // Task 1
                System.out.println("Task 1");
                int[] arr1 = new int [3];
                arr1[0] = 1;
                arr1[1] = 2;
                arr1[2] = 3;

                double[] arr2 = {1.57, 7.654, 9.986};

                int[] arr3 = {6, 0, 555, 3, 65, 0, 0, 99};



                // Task 2
                System.out.println("\n" + "Task 2");
                for (int i = 0; i < arr1.length -1; i++) {
                    System.out.print(arr1[i] + ", ");
                }
                System.out.print(arr1[arr1.length-1]);

                System.out.println();
                for (int i = 0; i < arr2.length - 1; i++) {
                    System.out.print(arr2[i] + ", ");
                }
                System.out.println(arr2[arr2.length - 1]);

                for (int i = 0; i < arr3.length - 1; i++) {
                    System.out.print(arr3[i] + ", ");
                }
                System.out.println(arr3[arr3.length - 1]);



                // Task 3
                System.out.println("\n" + "Task 3");

                for (int i = arr1.length - 1; i > 0; i--) {

                    System.out.print(arr1[i] + ", ");
                }
                System.out.print(arr1[0]);

                System.out.println();
                for (int i = arr2.length - 1; i > 0; i--) {
                    System.out.print(arr2[i] + ", ");
                }
                System.out.println(arr2[0]);

                for (int i = arr3.length - 1; i > 0; i--) {
                    System.out.print(arr3[i] + ", ");
                }
                System.out.println(arr3[0]);

                // Task 4
                System.out.println("\n" + "Task 4");
                for (int i = 0; i < arr1.length - 1 ; i++) {
                    if (arr1[i] % 2 != 0) {

                        System.out.print(arr1[i] + 1 + ", ");
                    } else {
                        System.out.print(arr1[i] + ", ");
                    }
                }
                if (arr1[arr1.length - 1] % 2 != 0){
                    System.out.println(arr1[arr1.length - 1] + 1);
                }



            }
}
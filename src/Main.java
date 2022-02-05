//Przemysław Kowalski 9680




public class Main {


    private static int[][] tmp = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {

        wyswietlanie();
        System.out.println("Efekt działania funkcji shiftRows: ");
        Main.shiftRows(tmp);
        wyswietlanie2();
        System.out.println("Efekt działania funkcji invShiftRows: ");
        Main.invShiftRows(tmp);
        wyswietlanie();

    }

    public static void wyswietlanie()
    {
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[i][j] > 9) {
                    if (tmp[i][j] % 4 == 1) {
                        System.out.println();
                    }
                    System.out.print("| " + tmp[i][j] + "   ");
                } else {
                    if (tmp[i][j] % 4 == 1) {
                        System.out.println();
                    }
                    System.out.print("| " + tmp[i][j] + "    ");
                }
            }
        }
        System.out.println("\n");
    }

    public static void wyswietlanie2(){

        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp.length; j++) {

                System.out.print("| " + tmp[i][j] + "    ");
            }
        }
        System.out.println("\n");
    }

    public static void shiftRows(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = leftrotate(arr[i], i);
        }
    }


    private static int[] leftrotate(int[] arr, int times){
        assert (arr.length == 4);
        if (times % 4 == 0) {
            return arr;
        }
        while (times > 0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            --times;
        }
        return arr;
    }

    public static void invShiftRows(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = rightrotate(arr[i], i);
        }
    }

    private static int[] rightrotate(int[] arr, int times){
        if (arr.length == 0 || arr.length == 1 || times % 4 == 0) {
            return arr;
        }
        while (times > 0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            --times;
        }
        return arr;
    }
}

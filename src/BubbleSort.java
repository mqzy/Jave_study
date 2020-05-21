public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {34,13,54,23,14,3,64,38,9};
        BubbleSort sort = new BubbleSort();
        sort.Sort(array);
    }
    public void Sort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        ShowArray(array);
    }

    private void ShowArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}

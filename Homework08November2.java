public class Homework08November2 {
    // Write a program to find the greatest number from an array
    //Example
    //Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
    //Output : Maximum - 75
    public static void main(String[] args) {
    int data[] = {23, 44, 21,100,1, 35, 75, 34, 25};
    int max = 0;
    for (int i = 0; i < data.length; i++){
        if (data[i] > max) {
            max = data[i];
        }

    } System.out.println(max);

    }
}

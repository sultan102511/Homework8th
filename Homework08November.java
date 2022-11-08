public class Homework08November {
    // Find the sum of the even and odd numbers
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i] % 2 == 0){
                even = even + data[i];
            } else {
                odd = odd + data[i];
            }
        }
        System.out.println("The sum of even numbers is: " + even);
        System.out.println("The sum of odd numbers is: " + odd);
    }
}

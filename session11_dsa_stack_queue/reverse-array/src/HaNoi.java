public class HaNoi {
    public static void hanoi(int n, char source, char target, char auxiliary) {
        // Trường hợp cơ sở: nếu chỉ có 1 đĩa, di chuyển nó từ cọc nguồn đến cọc đích
        if (n == 1) {
            System.out.println("Di chuyển đĩa 1 từ " + source + " sang " + target);
            return;
        }
        // Di chuyển n-1 đĩa từ cọc nguồn sang cọc trung gian
        hanoi(n - 1, source, auxiliary, target);
        // Di chuyển đĩa còn lại từ cọc nguồn sang cọc đích
        System.out.println("Di chuyển đĩa " + n + " từ " + source + " sang " + target);
        // Di chuyển n-1 đĩa từ cọc trung gian sang cọc đích
        hanoi(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int soDia = 4; // Số lượng đĩa
        // Gọi phương thức hanoi để bắt đầu quá trình giải
        hanoi(soDia, 'A', 'C', 'B'); // A là cọc nguồn, C là cọc đích, B là cọc trung gian
    }
}

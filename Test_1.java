package DSAtest;

// Bài toán số hóa chuỗi ký tự sang chuỗi nhị phân

// Câu 1 Số hóa từ algorithm sang chuỗi nhị phân
public class Test_1 {
    // phương thức stringToBinary
    // lấy tham số String input
    // khởi tạo StringBuilder có tên binary String để lưu trữ biểu diễn nhị phân của
    // các ký tự
    public static String stringToBinary(String input) {
        StringBuilder binaryString = new StringBuilder();
        // biểu diễn nhị phân của các ký tự được lặp qua từng ký tự trong chuỗi đầu vào
        // bằng vòng lặp for-ech
        for (char character : input.toCharArray()) {
            // đối với mỗi kí tự, chuyển đổi ký tự dó thành biểu diễn nhị phân
            // bằng cách dùng Integer.toBinaryString(character)
            // Biểu diễn nhị phân này được lưu trữ trong biến binaryChar
            String binaryChar = Integer.toBinaryString(character);
            // bảo đảm biểu diễn nhị phân dài 8 bit sử dụng
            // String.format("%8s",binaryChar).replace(' ', '0')
            // Chuỗi nhị phân kết quả được thêm vào StringBuilder `binaryString
            binaryString.append(String.format("%8s", binaryChar).replace(' ', '0'));
        }
        return binaryString.toString();
    }

    // Phương thức main
    public static void main(String[] arg) {
        String inputText = "algorithm";
        String binaryResult = stringToBinary(inputText);
        System.out.println("Original Text: " + inputText);
        System.out.println("Binary String: " + binaryResult);
    }
}
// câu 1 B
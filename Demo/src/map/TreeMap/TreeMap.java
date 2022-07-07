package map.TreeMap;

//Sơ đồ cây trong Java được sử dụng để triển khai giao diện Bản đồ và Bản đồ điều hướng cùng với Lớp trừu tượng.
// Bản đồ được sắp xếp theo thứ tự tự nhiên của các khóa của nó hoặc bởi một Bộ so sánh được cung cấp tại thời điểm tạo bản đồ,
// tùy thuộc vào phương thức khởi tạo nào được sử dụng.
// Điều này chứng tỏ đây là một cách hiệu quả để sắp xếp và lưu trữ các cặp khóa-giá trị.
// Thứ tự lưu trữ được duy trì bởi sơ đồ dạng cây phải nhất quán với bằng giống như bất kỳ bản đồ được sắp xếp nào khác,
// bất kể các trình so sánh rõ ràng.
// Hãy xem cách tạo một đối tượng bản đồ bằng cách sử dụng lớp này.

import java.util.*;

// Main class
class GFG {

    // Phương pháp trình điều khiển chính
    public static void main(String[] args) {

        // Tạo một Sơ đồ cây trống
        Map<String, Integer> map = new TreeMap<>();

        // Chèn các phần tử tùy chỉnh vào Bản đồ
        // sử dụng phương thức put ()
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Lặp lại trên Bản đồ bằng cách sử dụng cho mỗi vòng lặp
        for (Map.Entry<String, Integer> e : map.entrySet())

            // In các cặp khóa-giá trị
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}


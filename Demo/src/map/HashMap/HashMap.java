package map.HashMap;

//HashMap là một phần trong bộ sưu tập của Java kể từ Java 1.2.
// Nó cung cấp triển khai cơ bản của giao diện Bản đồ của Java.
// Nó lưu trữ dữ liệu trong các cặp (Khóa, Giá trị).
// Để truy cập một giá trị, người ta phải biết khóa của nó.
// Lớp này sử dụng một kỹ thuật gọi là Hashing .
// Hashing là một kỹ thuật chuyển đổi một Chuỗi lớn thành một Chuỗi nhỏ đại diện cho cùng một Chuỗi.
// Giá trị ngắn hơn giúp lập chỉ mục và tìm kiếm nhanh hơn.
// Hãy xem cách tạo một đối tượng bản đồ bằng cách sử dụng lớp này.
import java.util.*;

    // Main class
    class GFG {

        //Phương pháp trình điều khiển chính
        public static void main(String[] args)
        {

            // Tạo HashMap trống
            Map<String, Integer> map = new HashMap<>();

            // Chèn các cặp vào trên Bản đồ
            // sử dụng phương thức put ()
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);

            // Lặp lại bản đồ
            for (Map.Entry<String, Integer> e : map.entrySet())

                // In các cặp khóa-giá trị
                System.out.println(e.getKey() + " "
                        + e.getValue());
        }
    }


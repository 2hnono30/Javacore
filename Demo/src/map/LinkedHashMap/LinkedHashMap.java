package map.LinkedHashMap;


//LinkedHashMap cũng giống như HashMap với một tính năng bổ sung là duy trì thứ tự các phần tử được chèn vào nó.
// HashMap cung cấp lợi thế là chèn,
// tìm kiếm và xóa nhanh chóng nhưng nó không bao giờ duy trì theo dõi và thứ tự chèn mà LinkedHashMap cung cấp nơi các phần tử có thể được truy cập theo thứ tự chèn của chúng.
// Hãy xem cách tạo một đối tượng bản đồ bằng cách sử dụng lớp này.
import java.util.*;

    // Main class
    class GFG {

        // Main driver method
        public static void main(String[] args)
        {

            // Tạo một LinkedHashMap trống
            Map<String, Integer> map = new LinkedHashMap<>();

            // Chèn các mục nhập cặp vào Bản đồ trên
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



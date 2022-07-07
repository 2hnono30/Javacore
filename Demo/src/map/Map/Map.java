package map.Map;

//Giao diện bản đồ có trong gói java.util đại diện cho một ánh xạ giữa một khóa và một giá trị.
// Giao diện Bản đồ không phải là một kiểu con của giao diện Bộ sưu tập .
// Do đó, nó hoạt động hơi khác so với các loại bộ sưu tập còn lại.
// Một bản đồ chứa các khóa duy nhất.
//                      Geeks, người động não lẽ ra nên sử dụng Maps tại sao và khi nào?
//Bản đồ hoàn hảo để sử dụng cho việc lập bản đồ liên kết khóa-giá trị chẳng hạn như từ điển.
// Bản đồ được sử dụng để thực hiện tra cứu theo khóa hoặc khi ai đó muốn truy xuất và cập nhật các yếu tố bằng khóa.
//                      Đặc điểm của giao diện bản đồ
        //Bản đồ không được chứa các khóa trùng lặp và mỗi khóa có thể ánh xạ tới nhiều nhất một giá trị.
// Một số triển khai cho phép khóa null và giá trị null như HashMap và LinkedHashMap , nhưng một số không thích TreeMap .
        //Thứ tự của một bản đồ phụ thuộc vào các triển khai cụ thể.
// Ví dụ: TreeMap và LinkedHashMap có các đơn đặt hàng có thể đoán trước được, trong khi HashMap thì không.
        //Có hai giao diện để triển khai Bản đồ trong java.
// Chúng là Bản đồ và Bản đồ sắp xếp , và ba lớp: HashMap, TreeMap và LinkedHashMap.
import java.util.*;

// Main class
class GFG {

    // Phương pháp trình điều khiển chính
    public static void main(String args[]) {
        // Tạo HashMap trống
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

        // Chèn các cặp vào trên Bản đồ
        // sử dụng phương thức put ()
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        // Duyệt qua Bản đồ bằng cách sử dụng cho từng vòng lặp
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Phím in
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}

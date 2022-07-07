public class Enum {

    /* enumlà một "lớp" đặc biệt đại diện cho một nhóm các hằng số (các biến không thể thay đổi, như finalcác biến).

    Để tạo một enum, hãy sử dụng enumtừ khóa (thay vì lớp hoặc giao diện) và phân tách các hằng số bằng dấu phẩy. Lưu ý rằng chúng phải được viết hoa:*/
    enum Level {
        LOW,
        MEDIUM,
        HIGH;
    }
    enum Color {
        RED,
        GREEN,
        BLUE;
    }
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
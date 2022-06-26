package phonebook1;


import java.io.Serializable;

@SuppressWarnings("serial")
public class SLList
        implements Serializable {

    private SLNode head;
    private int length;

    // initialize the list
    public SLList() {
        head = null;
        length = 0;
    }

    // create method to add name, email, and phone number in String form

    public void add(String name, String email, double phoneNumber) {

        SLNode current = head;
        SLNode previous = null;
        SLNode newNode = new SLNode();
        // Set the data

        newNode.setName(name);
        newNode.setEmail(email);
        newNode.setPhoneNumber(phoneNumber);

        // nếu phần đầu trống, mục nhập mới sẽ tự động trở thành phần đầu
        // và độ dài được tăng lên một

        if (isEmpty()) {
            head = newNode;
            length++;
        } else {

            // so sánh họ của các mục nhập được ưu tiên theo thứ tự
            // chữ cái trong họ

            for (int i = 0; i < length; i++) {
                String[] ourNames1 = current.getName().split(" ");
                String[] ourNames2 = newNode.getName().split(" ");

                int result = ourNames1[ourNames1.length-1].compareToIgnoreCase(ourNames2[ourNames2.length-1]);

                // nếu họ đã nhập đi trước những gì được lưu trữ trong
                // phần đầu, mục nhập mới trở thành phần đầu
                if (result > 0) {
                    if (previous == null) {
                        newNode.setNext(current);
                        head = newNode;
                        length++;
                        break;
                    }
                    // phần này xoay vòng qua "phần thân" của các nút nếu
                    // nó không phải là cái đuôi
                    previous.setNext(newNode);
                    newNode.setNext(current);
                    length++;
                    break;
                }

                else
                    // nếu mục nhập thay thế nút ở đuôi, điều này
                // mục nhập trở thành đuôi mới
                {
                    if (current.getNext() == null) {
                        current.setNext(newNode);
                        newNode.setNext(null);
                        length++;
                        break;
                    }
                    // System.out.println("Add after");
                    previous = current;
                    current = current.getNext();

                }
            }
        }

    }




    public void printList () {

        // bắt đầu từ đầu và kiểm tra xem có gì ở đó không
        SLNode tempNode = head;
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            // xem qua danh sách và in theo thứ tự
            for (int i = 0; i < length; i++) {
                System.out.print("Index = " + (i+1) + " ");
                System.out.println(tempNode);
                tempNode = tempNode.getNext();
            }

        }
        System.out.println();
    }

    // phương thức để sử dụng nếu danh sách liên kết trống
    public boolean isEmpty() {
        return (length == 0);
    }


    // phương thức được sử dụng để tìm kiếm thông qua các tên trong chuỗi
    public void nameSearch(String name) {
        SLNode current = head;
        boolean empty = true;

        // kiểm tra xem danh sách có trống không
        if (isEmpty()) {
            System.out.println("The list is empty!");
        }else {
            // kiểm tra xem đầu vào có khớp với bất kỳ thứ gì trong chuỗi không
            for (int i = 0; i < length; i++) {
                if (current.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.print("Index = " + (i+1) + " ");
                    System.out.println(current);
                    empty = false;

                }
                // nếu chuỗi đầu tiên không có giá trị tìm kiếm mong muốn
                // chuyển đến nút tiếp theo
                current = current.getNext();
            }
            // câu lệnh if để hiển thị nếu không tìm thấy kết quả phù hợp nào
            if (empty){
                System.out.println("No matches to that name!");
            }
        }

    }


    // tạo phương thức để tìm kiếm trong danh sách các địa chỉ email
    public void emailSearch(String email) {
        SLNode current = head;
        boolean empty = true;

// kiểm tra xem danh sách có trống không
        if (isEmpty()) {
            System.out.println("The list is empty!");
        }else {
            // kiểm tra thông qua đầu tiên trong danh sách để xem nếu bạn muốn tìm kiếm
            // khớp với mục nhập đầu tiên trong danh sách
            for (int i = 0; i < length; i++) {
                if (current.getEmail().toLowerCase().contains(email.toLowerCase())) {
                    System.out.print("Index = " + (i+1) + " ");
                    System.out.println(current);
                    empty = false;
                }
                // nếu không có gì trong nút hiện tại, hãy đặt thành tiếp theo và tìm kiếm
                // lại
                current = current.getNext();
            }
            // câu lệnh if nếu không có email nào phù hợp với tìm kiếm mong muốn
            if (empty){
                System.out.println("No matches to that email address!");
            }
        }

    }


    // tạo phương thức xóa các mục theo chỉ mục
    public void delete (int index) {
        SLNode current = head;
        SLNode previous = null;
        boolean empty = true;
        // kiểm tra xem danh sách có trống không
        if (isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            // lặp lại và tìm chỉ mục và xóa nó
            for (int i = 0; i < length; i++) {
                if ((index-1) == i) {
                    if (previous == null) {
                        head = head.getNext();
                        length--;
                        empty = false;
                        break;
                    } else if (current.getNext() == null){
                        previous.setNext(null);
                        length--;
                        empty = false;
                        break;
                    } else {
                        previous.setNext(current.getNext());
                        length--;
                        empty = false;
                        break;
                    }
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
            if (empty){
                System.out.println("Index Does Not Exist!");
            } else {
                // thông báo xóa chỉ mục thành công
                System.out.println("Successfully deleted index " + index);
            }
        }

    }




}
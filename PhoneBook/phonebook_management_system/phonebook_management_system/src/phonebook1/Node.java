package phonebook1;


import java.io.Serializable;

@SuppressWarnings("serial")
public class Node implements Serializable {

    private String name;
    private String email;
    private double phoneNumber;
    private Node next;


    // tạo phiên bản SLNode và đặt bên cạnh 'null'
    public Node() {
        //data = -1;
        next = null;
    }

    /**
     * tạo setters và getters cho tên, email, số điện thoại và Node
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " || Name = " + name + " || Email = " + email + " || Phone Number = " + phoneNumber + " || ";
    }
}
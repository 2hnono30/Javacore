package phonebook1;


import java.io.Serializable;

@SuppressWarnings("serial")
public class SLNode implements Serializable {

    private String name;
    private String email;
    private double phoneNumber;
    private SLNode next;


    // tạo phiên bản SLNode và đặt bên cạnh 'null'
    public SLNode() {
        //data = -1;
        next = null;
    }

    /**
     * tạo setters và getters cho tên, email, số điện thoại và SLNode
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

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Email = " + email + ", Phone Number = "
                + phoneNumber;
    }
}
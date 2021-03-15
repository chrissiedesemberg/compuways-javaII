package chapter29_stream_api;

public class NamePhoneEmail {

    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String n, String p, String e) {
        this.name = n;
        this.phonenum = p;
        this.email = e;
    }
}

class NamePhone {

    String name;
    String phone;

    public NamePhone(String n, String p) {
        this.name = n;
        this.phone = p;
    }
}

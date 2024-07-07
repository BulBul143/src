package july5;

public class document implements printable {
    String txt;
    public document(String txt) {
        this.txt = txt;
    }
    public void print() {
        System.out.println("text field is: "+txt);
    }
}



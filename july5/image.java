package july5;

public class image implements printable {
    int w, h;
    public image(int h, int w) {
        this.w = w;
        this.h = h;
    }
    public void print() {
        System.out.println("height is: "+h+", width is: "+w);
    }
}
 



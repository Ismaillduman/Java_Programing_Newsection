package reviews.week_10.book;

public class Ebook extends Book {
    /*- size (double) (mb)
			- on kindle (boolean)

		create a open method*/
    private double size;
    private boolean onKindle;

    public void setInfo(double size, boolean onKindle) {
        setSize(size);
        setOnKindle(onKindle);

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isOnKindle() {
        return onKindle;
    }

    public void setOnKindle(boolean onKindle) {
        this.onKindle = onKindle;
    }

    public void open(){
        System.out.println("check your kindel is open");
    }
    public String toString() {
        return getClass().getSimpleName() +
                " size=" + size +
                ", onKindle=" + onKindle +
                '}';
    }
}

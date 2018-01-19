package module3.Seri;

import java.io.Serializable;

public class Transport implements Serializable {
    protected  int col;

    public Transport(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

}

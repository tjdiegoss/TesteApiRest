package Model;

public class TelefoneModel {

    private int ddd;
    private int num;

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TelefoneModel() {
    }

    public TelefoneModel(int ddd, int num) {
        this.ddd = ddd;
        this.num = num;
    }

    @Override
    public String toString() {
        return "TelefoneModel{" +
                "ddd=" + ddd +
                ", num=" + num +
                '}';
    }
}

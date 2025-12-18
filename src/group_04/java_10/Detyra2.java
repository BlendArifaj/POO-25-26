package group_04.java_10;

public class Detyra2 {
    public static void main(String[] args) {
        E obj = new F().modify("Programimi i Orientuar").modify(" ne  Objekte").update("FIEK");
                System.out.println(obj.getY() + " | " + obj.getProcessed());
    }
}
abstract class E {
    protected StringBuilder y = new StringBuilder();
    public E modify(String q) {
        y.append(q).append(" ");
        return this;
    }
    public String getY() {
        return y.toString().trim();
    }
    public abstract String getProcessed();
}
class F extends E {
    private String lastModified = "None";
    @Override
    public F modify(String q) {
        super.modify(q);
        lastModified = q;
        return this;
    }
    public F update(String newValue) {
        this.y = new StringBuilder(newValue);
        return this;
    }
    @Override
    public String getProcessed() {
        return y.toString().replaceAll("Fi", " - ");
    }
}
class Data {
    int value;
    Data(int value) {
        this.value = value;
    }
}
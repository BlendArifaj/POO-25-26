package group_02.java_12;

public class Detyra02 {
}

class Student{
    private int id;
    private String emri;
    private double notaMesatare;

    public Student(int id, String emri, double notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public String toFileRow(){

        return this.id + ";" + this.emri + ";" + this.notaMesatare +"\n";
    }
    public static Student fromFileRow(String fileRow){
//        2025;Filan Fiskute;8.8
        try{
            String[] rowItems = fileRow.split(";");
            int id = Integer.parseInt(rowItems[0]);
            String emri = rowItems[1];
            double notaMesatare = Double.parseDouble(rowItems[2]);

            return new Student(id, emri, notaMesatare);
        }catch (Exception e){
            return null;
        }
    }
}

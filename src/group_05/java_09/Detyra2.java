package group_05.java_09;

public class Detyra2 {
    public static void main(String[] args) {
        AsistentProfesor prof = new AsistentProfesor(1, "Professor 1");
        System.out.println("User with id: " + prof.id + " has position: " + prof.position);

        prof = new AssocProfesor(2, "Professor 2");
        System.out.println("User with id: " + prof.id + " has position: " + prof.position);

//        prof = new Profesor(3, "Professor 3");
        System.out.println("User with id: " + prof.id + " has position: " + prof.position);
    }
}

class Profesor {
    int id;
    String emri;
    String position = "Prof.";

    Profesor(int id, String emri) {
        this.id = id;
        this.emri = emri;
    }

    public String getPosition() {
        return this.position;
    }
}

class AssocProfesor extends AsistentProfesor {
    String position = "Assoc. Prof.";

    AssocProfesor(int id, String emri) {
        super(id, emri);
    }

    @Override
    public String getPosition() {
        return this.position;
    }
}

class AsistentProfesor extends Profesor {
    String position = "Ass. Prof.";

    AsistentProfesor(int id, String emri) {
        super(id, emri);
    }

    @Override
    public String getPosition() {
        return this.position;
    }
}


package group_01.java_11;

public class Main {
    public static void main(String[] args){
        int numri1 = 10;
        int numri2 = 0;
        try{
            System.out.println("10/0 = " + (numri1 / numri2));
        }catch (ArithmeticException e){
            System.out.println("Ka ndodh nje gabim - provoni perseri." + e.getMessage());
        }catch (NullPointerException ne){
            System.out.println("Jemi duke ju qasur nje objekti te padefinuar.");
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally!");
        }


        try {
            vendosNoten(11);
        }catch (NotaException e){

        }

    }

    public static void vendosNoten(int nota) throws NotaException{
        if(nota < 5 || nota > 10){
            throw new NotaException("Nota nuk eshte valide!");
        }

    }
}




class NotaException extends Exception{
    public NotaException(String message){
        super(message);
        this.handle();
    }

    private void handle(){
        System.out.println("Ruaj ne file.");
        System.out.println(this.getMessage() + " u ruajt ne file!");
    }
}
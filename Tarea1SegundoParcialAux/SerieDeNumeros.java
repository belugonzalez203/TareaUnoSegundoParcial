
/**
 * Write a description of class Serie1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SerieDeNumeros{
    public long serie1(int parametro){ //ejercicio1
        long a = 1;
        long b;
        int ct = 1;;
        System.out.println("  ");
        System.out.print(a + "  ");
        while(ct < parametro){
            int i = 1;
            while((ct < parametro) && (i <= 3)){
                b = a + i;
                a = b;
                i = i + 1;
                ct = ct + 1;
                System.out.print(b + "  ");
            }
            if(ct < parametro){
                b = a + 2;
                a = b;
                ct = ct + 1;
                System.out.print(b + "  ");
            }
        }
        System.out.println("  ");
        System.out.println("***************************************************************************************************");
        System.out.println("  ");
        return a;
    }
    
    public long sucesionPadovan(int parametro){  //ejercicio2
        long a = 1;
        long b = 1;
        long c = 1;
        System.out.print(a + "  " + b + "  " + c + "  ");
        for(int i = 1; i <= (parametro - 3); i++){
            long aux = c;
            c = a + b;
            a = b;
            b = aux;
            System.out.print(c + "  ");
        }
        System.out.println("  ");
        System.out.println("***************************************************************************************************");
        System.out.println("  ");
        return c;
    }
}

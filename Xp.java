
public class Xp {

    public static void main(String[] args) {
        
        String nome = "Zuckenberg";
        int nivel = 0;

        while(nivel < 9000) {
            nivel += 100;
        }

        if (nivel <= 1000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Ferro");
        } else if (nivel > 1000 && nivel <= 2000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Bronze");
        } else if (nivel > 2000 && nivel <= 5000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Prata");
        } else if (nivel > 5000 && nivel <= 7000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Ouro");
        } else if (nivel > 7000 && nivel <= 8000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Platina");
        } else if (nivel > 8000 && nivel <= 9000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Ascendente");
        } else if (nivel > 9000 && nivel <= 10000) {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Imortal");
        } else {
            System.out.println("O Herói de nome " + nome +  " está no nível de " + "Radiante");
        }

    


    }
}
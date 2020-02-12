package ExercicioJogador;

import jdk.swing.interop.SwingInterOpUtils;

public class ExercicioJogador {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;


    public void fazergol(boolean golsfeitos) {
        if (golsfeitos== true){
               energia = energia - 5 ;
               alegria = alegria + 10 ;
               gols ++;
                System.out.println("gooooooooooooooooooooool");
            }
        if (golsfeitos==false){
            System.out.println("Se esforce mais");
        }


    }
    public void correr (){
         if (this.energia >= 10) {
             this.energia -= 10 ;
             System.out.println("Cansei!");
         } else {
             System.out.println("sem energia");
         }
    }
}




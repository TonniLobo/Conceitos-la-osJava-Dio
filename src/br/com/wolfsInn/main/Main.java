package br.com.wolfsInn.main;

public class Main {
    public static void main(String[] args) {
        loops();
        interruptores();
    }

    public static void interruptores(){
        for(int i=0; i<=14; i++){
            if(i%2==0) System.out.println(i);
            if(i>=12) break;
        }
        System.out.println(" ");
        int contador=0;
        while(contador<=14){
            if(contador%2==0) System.out.println(contador);
            contador++;
            if(contador>=13) break;
        }
    }

    public static void loops() {
        int n = 12;
        int contador = 0;
        boolean continua = true;
        for (int i = 3; i < 12; i += 2) {
            if (i != 7) System.out.println(i);
        }
        while (continua) {
            System.out.println("Hello, while!");
            if (contador >= 4) {
                continua = false;
            }
            contador++;
        }
    }
}

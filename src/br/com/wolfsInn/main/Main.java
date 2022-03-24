package br.com.wolfsInn.main;

public class Main {
    public static void main(String[] args) {
        int n = 12;
        int contador=0;
        boolean continua=true;
        for(int i=3; i<12; i+=2){
            if(i!=7) System.out.println(i);
        }
        while(continua){
            System.out.println("Hello, while!");
            if(contador>=4){
                continua=false;
            }
            contador++;
        }
    }
}

package br.com.wolfsInn.main;

public class Main {
    public static void main(String[] args) {
        loops();
        interruptores();
    }
    public static void array(){
        int[] idades = new int[10];
        idades[0] = 27;
        idades[1] = 31;
        System.out.println("idade 0: "+idades[0]);
        System.out.println("idade 1: "+idades[1]);
        System.out.println("idade 2: "+idades[2]);

        int[] i = {10,25};
        System.out.println("i 0: "+i[0]);
        System.out.println("i 1: "+i[1]);

        int[] k = new int[]{1,2,3};
        System.out.println("k 0: "+ k[0]);
        System.out.println("k 1: "+ k[1]);
        System.out.println("k 2: "+ k[2]);

        int[] j = new int[2];
        System.out.println("j 0: "+ j[1]);

        idades = new int[]{12,35,45,22,9,37,51,61};

        for(int idade: idades){
            System.out.println("Idade: "+idade);
        }

        for(int a=0; a< idades.length; a++){
            int idade = idades[a];
            System.out.println("Idade: "+idade);
        }
        for(int idade: idades){
            if(idade>=18) {
                System.out.println("Idade: " + idade+ " é maior de 18 anos");
            }
        }
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

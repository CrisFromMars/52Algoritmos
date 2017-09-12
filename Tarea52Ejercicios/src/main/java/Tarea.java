import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tarea {

    public static void main(String[] args) {


        ejercicio41();

    }

    public static void ejercicio7() {

        int cont;
        cont=0;

        System.out.println("Introduce tus frases. 'fuera' para salir");
        Scanner scan = new Scanner(System.in);

        do{
            scan.next();
            cont=cont+1;
        }while(!scan.next().equals("fuera"));

        System.out.println("Introduciste: "+ cont + " Palabras.");
    }

    public static void ejercicio8(){

        System.out.println("Ingresa unicamente S o N, de otra manera el proyecto se cerrara");
        Scanner scan = new Scanner(System.in);

        do{
            scan.next();
        }while(scan.next().equals("s") || scan.next().equals("n"));

    }

    public static void ejercicio9(){

        int numero;
        System.out.println("ingresa un numero:");
        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();

        if(numero<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
    }

    public static void ejercicio10(){

        int numero;
        System.out.println("Ingresa un numero:");
        Scanner pacman = new Scanner(System.in);

        numero= pacman.nextInt();

        if((numero % 2)== 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

    }

    public static void ejercicio11(){

        int numero;
        int cont = 0;

        System.out.println("Elige un numero");
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();

        for (int i = 0; i <= numero; i++) {

            if(((i % 3)== 0) && (i!=0)){
                cont=cont+1;
                System.out.println( i + " Es dividendo de 3");
            }

        }

        System.out.println("Y el numero total de divisores es: "+ cont);
    }

    public static void ejercicio12(){

        int numeroPar = 0;
        int numeroIm = 0;

        for (int i = 0; i <= 100; i++) {

            if((i % 2) == 0){
                numeroPar= numeroPar + i;
            }else{
                numeroIm=numeroIm + i;
            }

            System.out.println(i);

        }

        System.out.println("Numeros pares: " + numeroPar);
        System.out.println("Numeros impares: " + numeroIm);
    }


    public static void ejercicio13(){

        int cont = 0;
        System.out.println("Numeros multiplos de 2 y 3:");
        for (int i = 0; i <= 100; i++) {

            if((i % 2 == 0) && (i % 3 == 0) && (i!=0)){

                System.out.println(i);
            }

        }
    }

    public static void ejercicio14(){

        int menor= 0;
        int aux= 0;
        int mayor= 0;
        int numero= 0;
        System.out.println("Ingresa 5 numeros");

        for (int i = 1; i <= 5; i++) {

            Scanner prroScaner = new Scanner(System.in);
            numero= prroScaner.nextInt();

            if(mayor!=0 && menor != 0) {
                if (numero > mayor) {
                    mayor = numero;
                }


                if (numero <= menor) {
                    menor = numero;
                }
            }else{
                mayor=numero;
                menor=numero;
            }
        }

        System.out.println("Numero mayor = " + mayor);
        System.out.println("Numero menor = " + menor);
    }

    public static void ejercicio15(){

        int num1 = 0;
        int num2 = 0;
        int mayor = 0;
        int menor = 0;
        int cont = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Ingresa el primer numero: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        num2 = scan.nextInt();

        if(num1 > num2){
            mayor=num1;
            menor=num2;
        }else{
            mayor=num2;
            menor=num1;
        }

        System.out.println("Numeros entre " + menor + " y " + mayor + " son: ");
        for (int i = menor; i <= mayor ; i++) {

            cont++;
            System.out.println(i);

            if((i % 2 == 0) && (i!=0)){
                pares++;
            }else{
                impares=impares + i;
            }

        }
        System.out.println("En total son " + cont + " numeros.");
        System.out.println("Hay " + pares + " numeros pares.");
        System.out.println("Y la suma de los impares es " +impares);
    }

    public static void ejercicio16(){

        for (int i = 1; i <= 10; i++) {

            System.out.println("Serie " + i);
            for (int j = 1; j <= 10; j++) {

                System.out.println(j);

            }

        }
    }

    public static void ejercicio17(){

        int num1 = 0;
        int num2 = 0;
        int cont = 0;
        int suma = 0;
        System.out.println("Escribe el primer numero:");
        Scanner scan = new Scanner(System.in);
        num1= scan.nextInt();

        System.out.println("Escribe el segundo numero");
        num2= scan.nextInt();

        if (num2 >= num1){

            System.out.println("Los numeros pares entre " + num1 +" y " + num2 + " son:" );
            for (int i = num1; i <= num2 ; i++) {

                if((i % 2 == 0) && (i!=0)) {
                    System.out.println(i);
                    cont++;
                    suma = suma + i;
                }
            }
            System.out.println("Son un total de " + cont + " numeros");
            System.out.println("Y la suma de los numeros pares es " + suma);



        }else{
            System.out.println("El primer numero es mayor al segundo, Autodestruccion en 3..2..1....");
        }
    }

    public static void ejercicio18(){

        int cont = 0, posicion = 0;
        String cadena;
        char car;

        System.out.println("Ingresa una frase:");
        Scanner scan = new Scanner(System.in);
        cadena = scan.nextLine();

        System.out.println("Introduce el caracter a buscar:");
        car = scan.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {

            if(cadena.charAt(i) == car){
                cont++;
            }
        }

        System.out.println("El caracter "+ car + " aparere " + cont + " veces.");


    }
    
    public static void ejercicio19(){
        
        int h=0, m=0, s=0;

        for (h = 0; h <= 24; h++) {

            for (m = 0; m <= 59; m++) {

                for (s = 0; s <= 59; s++) {

                    System.out.println(h+":"+m+":"+s);
                }
            }
        }
        
    }

    public static void ejercicio20(){

        int num, factorial=1;

        System.out.println("Ingresa un numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            factorial = factorial*i;
        }
        System.out.println("El resultado es:"+factorial);
    }

    public static void ejercicio21(){

        char opcion;
        int sum = 0;
        System.out.println("elige 'a' para sumar pares, o 'b' para sumar impares");
        Scanner sc = new Scanner(System.in);

        switch (sc.next().charAt(0)){

            case 'a':

                for (int i = 1; i <= 1000; i++) {

                    if(i % 2 == 0){
                        sum = sum + i;
                    }
                }
                System.out.println("La suma de los numeros par del 1 al 1000 es:" + sum);
                break;

            case 'b':

                for (int i = 1; i <= 1000; i++) {

                    if(i % 2 != 0){
                        sum = sum + i;
                    }
                }
                System.out.println("La suma de los numeros impar del 1 al 1000 es:" + sum);
                break;

            default:
                System.out.println("Opcion erronea");
                break;
        }

    }

    public static void ejercicio22(){

        int cont = 0;
        String frase;
        System.out.println("Ingresa tu frase:");
        Scanner sc = new Scanner(System.in);

        frase = sc.nextLine();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < cont; j++) {
                System.out.print(" ");
            }

            System.out.println (frase);
            cont = cont + 4;
        }
    }

    public static void ejercicio23(){

        int cont = 1;

        for (int i = 0; i < 20; i++) {

            System.out.println((cont) + " " + (1+cont) + " " + (2+cont) + " " + (3+cont) + " " + (4+cont) + " ");
            cont= cont + 5;
        }
    }

    public static void ejercicio24(){

        int var=0, cont = 0, primo=0;

        System.out.println("Ingresa un numero:");
        Scanner sc = new Scanner(System.in);
        cont=sc.nextInt();
        primo=cont;

        for(int i=1;i<(cont+1);i++){

            if(cont % i == 0){
                var++;      // Banderica
            }
        }

        if(var!=2){

            System.out.println(cont+" No es numero primo.");
        }else{

            System.out.println(cont+ " Si es numero primo");
        }
    }

    public static void ejercicio25(){

        int num = 0;

        System.out.print("Ingrese un numero menor a 5000: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        while (num >= 1000){
            System.out.print("M");
            num = num - 1000;
        }
        while (num >= 900){
            System.out.print("CM");
            num = num - 900;
        }

        while (num >= 500){
            System.out.print("D");
            num = num - 500;
        }

        while (num >= 400){
            System.out.print("CD");
            num = num - 400;
        }

        while (num >= 100){
            System.out.print("C");
            num = num - 100;
        }

        while (num >= 90){
            System.out.print("XC");
            num = num - 90;
        }

        while (num >= 50){
            System.out.print("L");
            num = num - 50;
        }

        while (num >= 40){
            System.out.print("XL");
            num = num - 40;
        }

        while (num >= 10){
            System.out.print("X");
            num = num - 10;
        }

        while (num >= 9){
            System.out.print("IX");
            num = num - 9;
        }

        while (num >= 5){
            System.out.print("V");
            num = num - 5;
        }

        while (num >= 4){
            System.out.print("IV");
            num = num -4;
        }

        while (num >= 1){
            System.out.print("I");
            num = num -1;
        }

    }

    public static void ejercicio26(){

    }

    public static void ejercicio27(){

        int cont=1, num=0;

        System.out.println("Ingresa un numero del 0 al 10");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println("   " + num + "x" + i + " = " + (num*i));
        }
    }

    public static void ejercicio28(){

        int numero=0;
        int moneda=0;

        Random lanzamiento = new Random();

        System.out.println("Elige cara(1) o cruz (2)");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        moneda = lanzamiento.nextInt();
        if(numero == 1){
            System.out.print("Elegiste cara, y el resultado fue: ");
        }else{
            System.out.print("Elegiste cruz, y el resultado fue: ");
        }

        if(moneda < 1){
            System.out.println("Cara");
        }else{
            System.out.println("Cruz");
        }

        // System.out.println("random = " + moneda);

    }

    public static void ejercicio29(){

        int max = 6, min = 1, NR1=0, NR2=0, cont= 0;

        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            NR1 = random.nextInt(max + 1 - min) + min;
            NR2 = random.nextInt(max + 1 - min) + min;

            if(NR1 + NR2 == 10){
                cont++;
            }

        }
      //  System.out.println( NR1 + " | " + NR2);
        System.out.println("El numero de veces que la suma fue 10, fue: " + cont + " veces.");

    }

    public static void ejercicio30(){

        int resultado=0, min=1, max=3;
        char elecc;

        Random carrera = new Random();

        System.out.println("Los caballos que correran son 'Misterio'(M) y 'Sin nombre'(S), a quien le vas?");

        Scanner sc = new Scanner(System.in);
        elecc = sc.next().charAt(0);


        resultado = carrera.nextInt(max +1 - min) + min;

        if((elecc == 'M' )|| (elecc == 'm')){
            System.out.print("Apostaste por Misterio, y el ganador es..... ");
        }else{
            System.out.print("Apostaste por Sin nombre, y el ganador es..... ");
        }

        if(resultado == 3) {
            System.out.println("Sin Nombre :D");
        }else{
            System.out.println("Misterio!!! xdxdxdd");
        }
    }

    public static void ejercicio31(){

        int opc=0;
        float num1 = 0, num2 = 0;

        System.out.println("Ingresa dos numeros: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        System.out.println("Elige (con numero) que quieres hacer con ellos: ");
        System.out.print("1. Suma");
        System.out.println("              2. Resta");
        System.out.print("3. Multiplicacion");
        System.out.println("    4. Division");

        switch(sc.nextInt()){

            case 1:

                System.out.println("El resultado de sumar es: " + (num1 + num2));
                break;

            case 2:

                System.out.println("El resultado de restar es: " +(num1 - num2));
                break;

            case 3:

                System.out.println("El resultado de multiplicar es: " + (num1 * num2));
                break;

            case 4:

                System.out.println("El resultado de dividir es: " + (num1 / num2));
                break;

            default:

                System.out.println("Opcion incorrecta");
                break;
        }



    }

    public static void ejercicio32(){

        int opc=0, primo=0, var=0, factorial=1;
        int num1 = 0;

        System.out.println("Ingresa un numero: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Elige que quieres hacer con el: ");
        System.out.println("1. Comprobar si es numero primo");
        System.out.println("2. Factorial");
        System.out.println("3. Tabla de multiplicar");

        switch(sc.nextInt()){

            case 1:


                for(int i=1;i<(num1+1);i++){

                    if(num1 % i == 0){
                        var++;      // Banderica
                    }
                }

                if(var!=2){

                    System.out.println(num1+" No es numero primo.");
                }else{

                    System.out.println(num1+ " Si es numero primo");
                }
                break;

            case 2:


                for (int i = 1; i <= num1; i++) {

                    factorial = factorial*i;
                }
                System.out.println("El resultado es:"+factorial);
                break;

            case 3:


                for (int i = 0; i <= 10; i++) {

                    System.out.println("   " + num1 + "x" + i + " = " + (num1*i));
                }

                break;

            default:

                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public static void ejercicio33(){           //Arreglos o Arrays de nombres ya hechos

        String [] nombres = {"Alan", "Aaron", "Eddy", "Monica", "Lorem", "Ipsum", "Sit", "Rulo", "Ariel", "Daniel",
                "Cristian", "Ararat", "Kenia", "Eliot", "Ramiro", "Mopet", "Alicia", "Uriel", "Sam" , "Cristina"};


        for (int i = 0; i < 20; i++) {

            System.out.println(nombres[i]);

        }


    }

    public static void ejercicio34(){           //Arreglos a llenar

        Float [] califas;
        double suma=0, num;

        califas = new Float[10];

        System.out.println("Ingresa las 10 calificaciones del alumno: ");

        for (int i = 0; i < califas.length; i++) {

            System.out.print("Calificacion " + "[" + (i+1) + "]: ");
            Scanner sc = new Scanner(System.in);

            califas[i] = sc.nextFloat();;

            suma = suma + califas[i];
        }

        System.out.println("El promedio es: " + (suma/10));
    }


    public static void ejercicio35(){

        Float [] califas;
        double num, busc;
        int cont=0;

        califas = new Float[10];

        System.out.println("Ingresa las 10 calificaciones del alumno: ");

        for (int i = 0; i < califas.length; i++) {

            System.out.print("Calificacion " + "[" + (i+1) + "]: ");
            Scanner sc = new Scanner(System.in);

            califas[i] = sc.nextFloat();;

        }

        System.out.println("Ingresa la calificacion a buscar");
        Scanner sc = new Scanner(System.in);
        busc = sc.nextFloat();

        System.out.println("La calificación de " + busc + " se encontro en: ");

        for (int i = 0; i < califas.length; i++) {

            if(busc == califas[i]){
                cont++;
                System.out.println("Calificacion [" + (i+1) + "] ");
            }
        }

        System.out.println(cont + " veces.");
    }

    public static void ejercicio36(){

        //int [][] matrix = new int[4][5];          Esta es una opción

        int[][] matrix;
        int min=2, max=100;
        matrix = new int[4][5];                      //Esta es otra (Linea 764 y 765)

        Random random = new Random();


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {            //Para llamar a las columnasx

                matrix[i][j] = random.nextInt((max + 1 - min) + min);


            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.printf("%6d ", matrix[i][j]);

            }
            System.out.println();                               //Salto de linea
        }
    }

    public static void ejercicio37(){

        //int [][] matrix = new int[4][5];          Esta es una opción

        int[][] matrix;
        int min=2, max=100;
        matrix = new int[4][5];

        int[][] matrixT = new int[5][4];


        Random random = new Random();


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {            //Para llamar a las columnasx

                matrix[i][j] = random.nextInt((max + 1 - min) + min);


            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.printf("%6d ", matrix[i][j]);

            }
            System.out.println();                               //Salto de linea
        }
        System.out.println();
        System.out.println("            "+ "TRANSPUESTA");
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                matrixT[j][i] = matrix[i][j];

            }
        }

        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[0].length; j++) {

                System.out.printf("%6d ", matrixT[i][j]);

            }
            System.out.println();                               //Salto de linea
        }
    }


    public static void ejercicio38(){

        int cursos, alumnos;
        double califa;

        System.out.print("Ingresa cuantos cursos hay: ");
        Scanner sc = new Scanner(System.in);
        cursos = sc.nextInt();

        System.out.println("Ingresa el numero de alumnos por curso: ");
        alumnos = sc.nextInt();

        double[][]cadena = new double[cursos][alumnos];

        System.out.print("Ingresa la calificacion por 'Curso x Alumno':");
        System.out.println();
        System.out.println();
        for (int i = 0; i < cadena.length; i++) {

            for (int j = 0; j < cadena[0].length; j++) {
                System.out.print("Curso " + (i+1) + " y alumno :" + (j+1));
                califa = sc.nextDouble();
                cadena[i][j] = califa;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Las calificaciones son las siguientes: ");


        for (int i = 0; i < cadena.length; i++) {
            for (int j = 0; j < cadena[0].length; j++) {

                System.out.print("   " + cadena[i][j]);

            }
            System.out.println();                               //Salto de linea
        }


    }

    public static void ejercicio39(){}

    public static void ejercicio40(){                              // Tabla 3D Tridimensional

        int [][][] Arr3D = new int[3][4][5];
        int cont=1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Arr3D.length; i++) {

            for (int j = 0; j < Arr3D[i].length; j++) {

                for (int k = 0; k < Arr3D[i][j].length; k++) {

                    Arr3D[i][j][k] = cont;
                    cont++;
                }
            }
        }

        for (int i = 0; i < Arr3D.length; i++) {

            for (int j = 0; j < Arr3D[i].length; j++) {

                for (int k = 0; k < Arr3D[i][j].length; k++) {

                    System.out.printf("%6d", Arr3D[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }


    }

    public static void ejercicio41(){

        int [][][] Arr3D = new int[5][10][20];
        int min=2, max=10, sum=0;
        double prom;

        Random azar = new Random();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Arr3D.length; i++) {

            for (int j = 0; j < Arr3D[i].length; j++) {

                for (int k = 0; k < Arr3D[i][j].length; k++) {

                    Arr3D[i][j][k] = azar.nextInt((max + 1 - min) + min);
                }
            }
        }

        for (int i = 0; i < Arr3D.length; i++) {

            for (int j = 0; j < Arr3D[i].length; j++) {

                for (int k = 0; k < Arr3D[i][j].length; k++) {


                    System.out.printf("%6d", Arr3D[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < Arr3D.length; i++) {

            for (int j = 0; j < Arr3D[i].length; j++) {

                sum=0;
                for (int k = 0; k < Arr3D[i][j].length; k++) {

                    sum = sum + Arr3D[i][j][k];


                }
                int k=0;
                System.out.print("Promedio de centro " + (i+1) + ", y curso "+ (j+1) + ", es: ");
                prom = sum/20;
                System.out.println(prom);
            }
        }


    }




}


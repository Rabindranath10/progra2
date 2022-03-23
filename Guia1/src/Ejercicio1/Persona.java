package Ejercicio1;

import javax.swing.JOptionPane;

public class Persona {

    private final static char DEFAULT_SEX = 'H';
    private String nombre;
    private int edad;
    private String dui;
    private char sexo;
    final char sexi = 'H';
    private double peso;
    private double altura;

    public Persona() {
        nombre="";
        edad=0;
        sexo=DEFAULT_SEX;
        peso=0;
        altura=0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo.charAt(0));
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo.charAt(0));
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double resultado = (peso) / (altura * altura);
        if (resultado < 20) {
            return -1;
        } else if (resultado >= 20 && resultado <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(int edad) {
        boolean mayorDeEdad = false;
        if (edad >= 18) {
            return mayorDeEdad = true;
        } else {
            return mayorDeEdad = false;
        }
    }

    public char comprobarSexo(char sexo) {
        
        if (sexo == 'H' || sexo == 'h') {
            return 'H';
        } else if (sexo=='F' || sexo=='f') {
            return 'F';
        } else {
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona" + "\nnombre=" + nombre + "\n edad=" + edad
                + "\nsexo=" + sexo + "\n peso=" + peso
                + "\n altura=" + altura;
    }

    public void generarDui() {
        int i = 0;
        int cantidad = 9;
        int rango = 10;

        int arreglo[] = new int[cantidad];

        arreglo[i] = (int) (Math.random() * rango);
        for (i = 1; i < cantidad; i++) {
            arreglo[i] = (int) (Math.random() * rango);
            for (int j = 0; j < 1; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}

package Ejercicio1;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {
        String nombre;
        int edad;
        String sexo;
        double peso;
        boolean verificarEdad;
        double altura;
        char sex;
        int verificacionPeso;
////// primer objeto

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad (no valores negativos)"));
            if (edad <= 0) {
                JOptionPane.showMessageDialog(null, "Ha introducido una edad fuera de rango");
            } else {
                JOptionPane.showMessageDialog(null, "Rango correcto");
            }
        } while (edad < 0);
        sexo = JOptionPane.showInputDialog("Ingrese su sexo (H o F)");

        

        Persona ObjetoUno = new Persona();
        ObjetoUno.toString();
        JOptionPane.showMessageDialog(null, ObjetoUno.toString());

        /////Objeto Dos
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad (no valores negativos)"));
            if (edad <= 0) {
                JOptionPane.showMessageDialog(null, "Ha introducido una edad fuera de rango");
            } else {
                JOptionPane.showMessageDialog(null, "Rango correcto");
            }
        } while (edad < 0);
        sexo = JOptionPane.showInputDialog("Ingrese su sexo (H o F)");
          
        Persona ObjetoDos = new Persona(nombre, edad, sexo);

        verificarEdad = ObjetoDos.esMayorDeEdad(edad);
        if (verificarEdad == true) {
            JOptionPane.showMessageDialog(null, "La persona es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "La persona no es mayor de edad");
        }
        JOptionPane.showMessageDialog(null, ObjetoDos.toString());
        ObjetoDos.generarDui();

        //////Objeto tres
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad (no valores negativos)"));
            if (edad <= 0) {
                JOptionPane.showMessageDialog(null, "Ha introducido una edad fuera de rango");
            } else {
                JOptionPane.showMessageDialog(null, "Rango correcto");
            }
        } while (edad < 0);
        sexo = JOptionPane.showInputDialog("Ingrese su sexo (H o F)");

        do {
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso (no valores negativos)"));
            if (peso <= 0) {
                JOptionPane.showMessageDialog(null, "Ha introducido un peso fuera de rango");
            } else {
                JOptionPane.showMessageDialog(null, "Rango correcto");
            }
        } while (peso <= 0);
        do {
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura (no valores negativos)"));
            if (altura <= 0) {
                JOptionPane.showMessageDialog(null, "Ha introducido una altura fuera de rango");
            } else {
                JOptionPane.showMessageDialog(null, "Rango correcto");
            }
        } while (altura <= 0);

        Persona ObjetoTres = new Persona(nombre, edad, sexo, peso, altura);

        verificarEdad = ObjetoDos.esMayorDeEdad(edad);
        if (verificarEdad == true) {
            JOptionPane.showMessageDialog(null, "La persona es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "La persona no es mayor de edad");
        }

        verificacionPeso = ObjetoTres.calcularIMC(peso, altura);
        if (verificacionPeso == -1) {
            JOptionPane.showMessageDialog(null, "la persona tiene bajo peso");
        } else if (verificacionPeso == 0) {
            JOptionPane.showMessageDialog(null, "la persona tiene peso normal");
        } else if (verificacionPeso == 1) {
            JOptionPane.showMessageDialog(null, "la persona tiene sobrepeso");
        }

        JOptionPane.showMessageDialog(null, ObjetoTres.toString());
        ObjetoTres.generarDui();

    }
}

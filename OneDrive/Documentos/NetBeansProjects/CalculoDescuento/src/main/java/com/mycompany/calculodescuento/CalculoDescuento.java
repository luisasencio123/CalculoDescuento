/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodescuento;

/**
 *
 * 
 */
// Archivo: CalculoDescuento.java
// Autor: Luis Asencio
// Objetivo: Calcular el descuento en una compra usando métodos, parámetros y sobrecarga.

public class CalculoDescuento {

    // Método con dos parámetros: montoTotal y porcentajeDescuento
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        // Fórmula: descuento = montoTotal * (porcentaje / 100)
        return montoTotal * (porcentajeDescuento / 100);
    }

    // Método sobrecargado: solo recibe el montoTotal y aplica 10% por defecto
    public static double calcularDescuento(double montoTotal) {
        double porcentajePorDefecto = 10.0;
        return montoTotal * (porcentajePorDefecto / 100);
    }

    public static void main(String[] args) {
        // Ejemplo 1: usando el método con solo montoTotal (10% por defecto)
        double monto1 = 200.0;
        double descuento1 = calcularDescuento(monto1);
        double montoFinal1 = monto1 - descuento1;

        // Ejemplo 2: usando el método con porcentaje explícito (15%)
        double monto2 = 500.0;
        double descuento2 = calcularDescuento(monto2, 15.0);
        double montoFinal2 = monto2 - descuento2;

        // Mostrar resultados
        System.out.println("=== Cálculo de Descuento en Compras ===");
        System.out.println("Compra 1: Monto = $" + monto1 + " | Descuento (10%) = $" + descuento1 + " | Total a pagar = $" + montoFinal1);
        System.out.println("Compra 2: Monto = $" + monto2 + " | Descuento (15%) = $" + descuento2 + " | Total a pagar = $" + montoFinal2);
    }
}
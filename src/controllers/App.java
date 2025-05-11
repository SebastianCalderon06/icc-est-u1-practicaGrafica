package controllers;

import models.Resultado;
import models.Benchmarking;
import models.MetodosDeOrdenamiento;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class App {
    private final int[] tamanios = {5000, 10000, 30000, 50000, 100000}; 
    private final int maxTamanio = 100000; 
    private final List<Integer> arregloBase = new ArrayList<>();
    private final List<Resultado> resultados = new ArrayList<>(); 

    public App() {
        generarArregloBase(); 
    }

    public void generarArregloBase() {
        Random rand = new Random();
        for (int i = 0; i < maxTamanio; i++) {
            arregloBase.add(rand.nextInt(1_000_000)); 
        }
    }

    public int[] copiarSubarreglo(int tamanio) {
        int[] copia = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            copia[i] = arregloBase.get(i); 
        }
        return copia;
    }

    public void ejecutar() {
        for (int tamanio : tamanios) {
            int[] base = copiarSubarreglo(tamanio); 
            System.out.println("\nTamaño: " + tamanio);

            resultados.add(new Resultado("Burbuja", tamanio,
                    Benchmarking.medirTiempo(() -> MetodosDeOrdenamiento.burbuja(Arrays.copyOf(base, base.length)))));

            resultados.add(new Resultado("Burbuja Optimizada", tamanio,
                    Benchmarking.medirTiempo(() -> MetodosDeOrdenamiento.burbujaOptimizada(Arrays.copyOf(base, base.length)))));

            resultados.add(new Resultado("Selección", tamanio,
                    Benchmarking.medirTiempo(() -> MetodosDeOrdenamiento.seleccion(Arrays.copyOf(base, base.length)))));

            resultados.add(new Resultado("Inserción", tamanio,
                    Benchmarking.medirTiempo(() -> MetodosDeOrdenamiento.insercion(Arrays.copyOf(base, base.length)))));

            resultados.add(new Resultado("Shell", tamanio,
                    Benchmarking.medirTiempo(() -> MetodosDeOrdenamiento.shell(Arrays.copyOf(base, base.length)))));

            for (Resultado r : resultados) {
                if (r.getTamanio() == tamanio) {
                    System.out.println(r.getAlgoritmo() + ": " + r.getTiempo() + " ms");
                }
            }
        }
    }

    public void mostrarResultadosFinales() {
        System.out.println("RESULTADOS FINALES");
        for (Resultado r : resultados) {
            System.out.println("Algoritmo: " + r.getAlgoritmo() + " | Tamaño: " + r.getTamanio() + " | Tiempo: " + r.getTiempo() + " ms");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.ejecutar(); 
        app.mostrarResultadosFinales();
    }
}

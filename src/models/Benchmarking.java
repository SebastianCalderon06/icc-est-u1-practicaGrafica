package models;
public class Benchmarking {
    public static long medirTiempo(Runnable algoritmo) {
        long start = System.nanoTime();
        algoritmo.run();
        long end = System.nanoTime();
        return (end - start) / 1_000_000; 
    }
}

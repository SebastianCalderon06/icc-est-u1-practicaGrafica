import matplotlib.pyplot as plt

class Grafica:
    def __init__(self, tamanios, burbuja, burbuja_optimizada, seleccion, insercion, shell):
        self.tamanios = tamanios
        self.burbuja = burbuja
        self.burbuja_optimizada = burbuja_optimizada
        self.seleccion = seleccion
        self.insercion = insercion
        self.shell = shell

    def generar_grafica_comparativa(self):
        plt.plot(self.tamanios, self.burbuja, marker='o', label='Burbuja', color='red')
        plt.plot(self.tamanios, self.burbuja_optimizada, marker='o', label='Burbuja Optimizada', color='orange')
        plt.plot(self.tamanios, self.seleccion, marker='o', label='Selección', color='blue')
        plt.plot(self.tamanios, self.insercion, marker='o', label='Inserción', color='green')
        plt.plot(self.tamanios, self.shell, marker='o', label='Shell', color='purple')

        plt.title("Comparación de Tiempos de Ejecución por Algoritmo")
        plt.xlabel("Tamaño del Arreglo")
        plt.ylabel("Tiempo de Ejecución (ms)")
        plt.legend()
        plt.grid(True)
        plt.show()

# Datos
tamanios = [5000, 10000, 30000, 50000, 100000]
burbuja = [22, 90, 981, 2868, 11250]
burbuja_optimizada = [20, 76, 859, 2399, 9466]
seleccion = [9, 14, 167, 341, 1351]
insercion = [7, 16, 208, 101, 435]
shell = [2, 1, 5, 4, 9]

# Ejecutar
grafica = Grafica(tamanios, burbuja, burbuja_optimizada, seleccion, insercion, shell)
grafica.generar_grafica_comparativa()
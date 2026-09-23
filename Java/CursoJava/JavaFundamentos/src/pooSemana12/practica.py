def busqueda_binaria(lista, elemento):
    menor = 0
    mayor = len(lista) - 1

    while menor <= mayor:
        medio = (menor + mayor) // 2
        estimado = lista[medio]

        if estimado == elemento:
            return medio

        if estimado > elemento:
            mayor = medio - 1
        else:
            menor = medio + 1

    return -1


# AQUÍ COLOCAS TU LISTA
lista = [20 ,25, 30, 35, 70, 73, 78,80,99]

# Elemento que quieres buscar
elemento = 70

# Ejecutamos la búsqueda
resultado = busqueda_binaria(lista, elemento)

print("La posición es:", resultado)
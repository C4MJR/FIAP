#Crie uma função que encontre e retorne o menor e o maior valor da lista, e seus indices sem utilizar a função nativa ao
#python (min e max)

lista=[1,5,7,5,5,9,6,87,4,5]


def encoontra_extremos(lista):

    maior = float("-inf")
    menor= float("inf")

    for i in lista:
        if i < menor:
            menor = i

        if i > maior:
            maior = i

    indice_maior = lista.index(maior)
    indice_menor = lista.index(menor)

    return maior, menor, indice_maior, indice_menor


maior, menor, indice_maior, indice_menor = encoontra_extremos(lista)

print(f"O maior número é {maior}")
print(f"O menor numero é {menor}")
print(f"O maior numero é {indice_maior}")
print(f"O menor numero é {indice_menor}")


#tuplas

#Tuplas sao basicamente listas que nao podem ser alteradas, as funçoes das listas que sao validas para as tuplas
#sao todas aquelas que nao permitem a alteração, como por exemplo (remove, append, etc)

#para criar uma tupla é necessario a utilização de virgula

tupla_1 = (1,2,3,4,5)
#ou
tupla_2 = 1,2,3,4,5,6

print(tupla_2)

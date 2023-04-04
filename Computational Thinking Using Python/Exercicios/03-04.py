
'''4)	Solicite ao usuário (separadamente) o mês do ano, e o dia atual.
 Diga em qual estação estamos
ex: 28 de março -> primeiro input = 3, segundo input = 28
Outono : De 22 de março a 21 de junho.
Inverno: De 22 de junho a 23 de setembro.
Primavera: De 24 de setembro a 21 de dezembro.
Verão: De 22 de dezembro a 21 de março.

similar ao das notas, só que agora cada mês tem mais condições
'''

mes = input("Digite o mês atual: ").upper()
dia = input("Digite o dia atual: ")

if mes == "JANEIRO" or mes == "FEVEREIRO":
    print("Verão!")


elif mes == "MARÇO":
    if dia <= 21:
        print("Verão!")

    else:
        print("Outono")

if mes == "ABRIL" or mes == "MAIO":
    print("Outono!")


elif mes == "JUNHO":
    if dia <= 21:
        print("Outono!")

    else:
        print("Inverno!")


if mes == "JULHO" or mes == "AGOSTO":
    print("Inverno!")


elif mes == "SETEMBRO":
    if dia <= 23:
        print("Inverno!")

    else:
        print("Primavera!")


if mes == "OUTUBRO" or mes == "NOVEMBRO":
    print("Primavera!")


elif mes == "DEZEMBRO":
    if dia <= 22:
        print("Verão!")

    else:
        print("Outono")



 
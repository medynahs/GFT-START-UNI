a=int(input("Digite o primeiro número:")) 
b=int(input("Digite o segundo número:"))
c=int(input("Digite o terceiro número:"))
d=int(input("Digite o quarto número: "))
e=int(input("Digite o quinto número: "))

# Criei as váriaveis e li os valores

if (a<b) and (a<c) and (a<d) and (a<e):
    menor = a 

elif (b<a) and (b<c) and (b<d) and (b<e):
    menor = b

elif (c<a) and (c<b) and (c<d) and (c<e):
    menor = c

elif (d<a) and (d<b) and (d<c) and (d<e):
    menor = d

else:
    menor = e

# Apresentei as condições "Se a for menor que b,c,d ou e, então a é o menor número" até conseguir definir o menor número.
    
if (a>b) and (a>c) and (a>d) and (a>e):
    maior = a

elif (b>a) and (b>c) and (b>d) and (b>e):
    maior = b

elif (c>a) and (c>b) and (c>d) and (c>e):
    maior = c

elif (d>a) and (d>b) and (d>c) and (d>e):
    maior = d

else:
    maior = e

# Apresentei as condições "Se a for maior que b,c,d ou e, então a é o maior número" até conseguir definir o maior número.

if (a==b) and (a==c) and (a==d) and (a==e):
    print("Os números são iguais.");

# Apresentei as condições "Se a for igual a b,c,d e e, então os números são iguais".

else:
    print("MAIOR=", maior)
    print("MENOR=", menor)
    
# Informei na tela qual é o maior e o menor número, assim como se caso todos forem iguais.


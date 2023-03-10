n = input ("Inserte su nombre: ")
a = input ("Inserte su(s) apellido(s): ")
e = input ("Inserte su edad: ")
e = int (e)

if (e<18 or e>29):
    print ("Usted aun no es util a la patria, buen dia", n)
else:
    es = input ("Inserte su estatura: ")
    es = float (es)
    if (es < 1.63):
        print ("Usted no es util para la patria, buen dia", n)
    else:
        P = input ("Inserte su peso: ")
        P = float (P)
        imc = P / (es * es)
        if (imc>=18 and imc<=25):
            print ("Su IMC es:", imc)
            print ("Bienvenido Marino!!!")
        else :
            print ("Su IMC es:", imc)
            print ("Usted no es util para la patria, buen dia", n)

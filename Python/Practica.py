n = input ("Inserte su nombre: ")
a = input ("Inserte su(s) apellido(s): ")
e = input ("Inserte su edad: ")
e = int (e)
if (e<18 or e>69):
    print ("No puede solicitar un credito bancario, debe tener entre 18 y 69 años, buen dia", n)
else:
    im = input ("Inserte su ingreso mensual ")
    im = int (im)
    if (im<10000):
        print ("Usted aun no es candidato para transmitar un credito con nosotros, buen dia", n)
    if (im>=10000 and im<=25000):
        print ("Usted es candidato para nuestra segmentacion clasica, buen dia", n)
    if (im>25000 and im<=35000):
        print ("Usted es candidato para nuestra segmentacion Oro, buen dia", n)
    if (im>35000):
        print ("Usted es candidato para nuestra segmentacion Platino, buen dia", n)

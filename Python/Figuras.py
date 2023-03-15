l = input ("Inserte los lados de su figura: ")
l = int (l)

if (l == 3):
    print ("Su figura es un triangulo")
else:
    if (l == 4):
        print ("Su figura es un cuadrado")
    else:
        if (l == 5):
            print ("Su figura es un pentagono")
        else:
            if (l == 6):
                print ("Su figura es un hexagono")
            else:
                if (l == 7):
                    print ("Su figura es un heptagono")
                else:
                    if (l == 8):
                        print ("Su figura es un octagono")
                    else:
                        if (l == 10):
                            print ("Su figura es un decagono")
                        else:
                            if (l == 12):
                                print ("Su figura es un dodecagono")
                            else:
                                print ("No hay una figura con esos lados")

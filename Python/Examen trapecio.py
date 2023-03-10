bm = input ("Inserte la base mayor del trapecio: ")
bm = int (bm)

if (bm<=0):
    print ("Error, buen dia")
else :
    bmm = input ("Inserte la base menor del trapecio: ")
    bmm = int (bmm)
    if (bmm<=0 or bmm>=bm):
        print ("Error, buen dia")
    if (bmm>0 and bmm<bm):
        a = input ("Inserte la altura del trapecio: ")
        a = int (a)
        if (a<=0):
            print ("Error, buen dia")
        else:
            aa = (bm + bmm) / 2 * a
            print ("El area del trapecio es:", aa)
                

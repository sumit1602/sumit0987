//Q19. Consider the following map: Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]
// Is this a valid construction? What is the value of m['2']?

Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]
//yes it is a valid Construction

println m
println m['2']

//5
//because map doesn't allow duplicate values it will replace the old one with new


def m1 = ['1' : 2, '2' : 3, '3' : 4, '2':5]
println m1.getClass()

//this is also a valid construction
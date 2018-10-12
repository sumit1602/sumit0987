//1. 0. Initialize an empty list and give the output of the following code:
//
//l[11] = "myelement"
//println l[11]
//println l.get(5)
//println l
//Initialize a list using a range and find all elements which are even.


List l =[]
l[11] = "myelement"
println l[11]   //myelement
println l.get(5)  //null
println l     //[null, null, null, null, null, null, null, null, null, null, null, myelement]

List li =[1,2,3,4,5,6,7]
li.findAll{if(it%2==0){
    println it
} }                   //2 4 6



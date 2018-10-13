//Consider the following list: [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ] Print the class name of each element.
// What's the output of the following statement? list.get(6).get(9)
List list=  [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
println list.getClass()
println list[0].getClass()
println list[1].getClass()
println list[2].getClass()
println list[3].getClass()
println list[4].getClass()
println list[5].getClass()
println list[6].getClass()

println list.get(6).get(9)


//class java.util.ArrayList
//class java.lang.Integer
//class java.lang.Integer
//class java.lang.Integer
//class java.lang.String
//class java.math.BigDecimal
//class java.util.ArrayList
//class groovy.lang.IntRange
//9

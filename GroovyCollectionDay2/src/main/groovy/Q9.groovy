//Q9. Consider the following piece of code: String s = "this string needs to be split"
//
//println s.tokenize(" ")
//println s.tokenize()
//
//Compare this with the following code:
//
//String s = "this string needs to be split"
//println s.split(" ")
//println s.split(/\s/) (Try Same Parameter with tokenize)
//
//Also try the following exercise:
//
//String s = "are.you.trying.to.split.me.mister?"
//s.tokenize(".") s.split(".")


String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()
//println s.tokenize().getClass()
//println s.split().getClass()
//Tokenise is instance of list
//split is instance of string
//println s.tokenize("s")
//Splits the string into a list with argument used as delimiter.

println s.split(" ")
//without space it will treat every next cursor value as character and split it into char list
//with space it will split according to next space found with comma seperator
//if more than one space then it will split without comma

println s.split(/\s/)
println s.tokenize(/\s/)
//work same as println s.tokenize("s")
//whenever tokenise find s it will seperate
println s.split("\\s",)
//assert s.split() instanceof String[]

String s1 = "are.you.trying.to.split.me.mister?"
println s1.tokenize(".")
println s1.split(".")
String s2 = "are.you.t-rying.to.s-plit.me.mister?"

println s2.split("-")
println s2.split("\\s",0)
println s2.split("\\s",2)












//The split() method returns a string [] instance and the  tokenize() method returns a list instance
//tokenize() ,which returns a list, will ignore empty string (when a delimiter appears twice in  succession) where as split() keeps such string.


//String testString = 'hello brother'
//assert testString.split() instanceof String[]
//assert ['hello','brother']==testString.split() //split with no arguments
//assert['he','','o brother']==testString.split('l')
//// split keeps empty string
//assert testString.tokenize() instanceof List
//assert ['hello','brother']==testString.tokenize() //tokenize with no arguments
//assert ['he','o brother']==testString.tokenize('l')
////tokenize ignore empty string
////The tokenize() method uses each character of a String as delimiter where as split()  takes the entire string as delimiter
//
//
//String  testString1='hello world'
//assert ['hel',' world']==testString1.split('lo')
//assert ['he',' w','r','d']==testString1.tokenize('lo')
////The split() can take regex as delimiter where as tokenize does not.
//
//
//String testString2='hello world 123 herload'
//assert['hello world ',' herload']==testString2.split(/\d{3}/)
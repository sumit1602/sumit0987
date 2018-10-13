
//Q18. Try the following code on a map: println map.class println map.getClass() What do you observe?

Map<String,Integer> map2 =["sumit":22, "shivani":23,"puneet":22]

println map2.getClass()
//class java.util.LinkedHashMap



println map2.class
//null


//println map2.classsaq

//it's looking for a key called class
//in groovy we have a way like  map.key = value
//But there is no key present in map2 object which names class so it is returning null



println map2 instanceof HashMap
println map2 instanceof Map
println map2 instanceof LinkedHashMap
println map2 instanceof SortedMap
println map2 instanceof TreeMap
println map2 instanceof Hashtable


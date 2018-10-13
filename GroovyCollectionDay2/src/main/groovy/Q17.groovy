//Q17. Create a new map by adding two existing maps

Map<Integer, String> map1 = new HashMap()
map1.put(1,"sumit")
map1.put(2,"shreya")
map1.put(3,"shivani")

Map<String,Integer> map2=["sumit":22, "shivani":23,"puneet":22]

Map map3= map1 + map2
println map3
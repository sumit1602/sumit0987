//Q16. Create a new map consisting of 10 of your friend's name's as keys and their ages as value.

Map<String,Integer> map=["sumit":22, "shivani":23,"anuj":22, "tyagi":23, "vishal":22,
                         "shivam":23,"vaibhav":22, "saniya":23,"vaibhav":22, "saniya":24,]


println map["sumit"]
println map.anuj
println map.get("saniya")

map.put("pradeep",23)
map.hamdi=21

println map

println map.getClass()
//duplicate key are not allowed in map so it will  consider vaibhav and saniya only once
//the one who entered last
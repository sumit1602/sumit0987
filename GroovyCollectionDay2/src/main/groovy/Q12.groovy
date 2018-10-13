
//Q12. We have a sorted list of alphabets a-z, print all alphabets appearing after j


//List list =[a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]

words="qwertyuiopasdfghjklzxcvbnm".toList().sort()
println words

//println words.takeWhile {'j'>it}

words.each { if('j'<it) print it +" "}


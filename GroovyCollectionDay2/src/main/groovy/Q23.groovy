//Q23. Write a method which retruns the value of passed key from a search string of the form
// "http://www.google.com?name=johny&age=20&hobby=cricket"

url =new URL("http://www.google.com?name=johny&age=20&hobby=cricket")


println url.query.split("&")


//println url.inspect().split("&")


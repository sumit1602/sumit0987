
//Q8. Consider a class Employee with following details * Name * Age * Salary Create a list consisting of 10 Employee objects.
//
//    Get a list of employees who earn less than 5000
//    Get the name of the youngest employee and oldest employee
//    Get the employee with maximum salary
//    Get the list of names of all the employees

class Employee{
    String name
    int age
    int salary

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }
}
Employee emp1 = new Employee(name: "sumit", age: 21, salary: 10000)
Employee emp2 = new Employee(name: "anuj", age: 22, salary: 9000)
Employee emp3 = new Employee(name: "shivani", age: 23, salary: 8000)
Employee emp4 = new Employee(name: "tyagi", age: 24, salary: 1000)
Employee emp5 = new Employee(name: "priyanka", age: 20, salary: 2000)
Employee emp6 = new Employee(name: "saniya", age: 28, salary: 3000)
Employee emp7 = new Employee(name: "anshul", age: 27, salary: 4000)
Employee emp8 = new Employee(name: "sumit", age: 25, salary: 7000)
Employee emp9 = new Employee(name: "sidhu", age: 26, salary: 6000)
Employee emp10 = new Employee(name: "talib", age: 24, salary: 5000)
List li=[emp1,emp2,emp3,emp4,emp5,emp6, emp7, emp8, emp9, emp10]

//println a=li*.name
//println a=li*.salary.sort().last()
//println a=li*.age.sort()
//a= li.findAll({it.salary<5000})
//println a
//
//li.findAll{if(it.salary<5000) print it.name +" "}
//
//println li.age.sort(){println li.name}
List listSalary=[]
li.each{
    if(it.salary>5000)
        listSalary.add(it.name)
}
println("List of employee having salary greater than 5000 :"+listSalary)




List YoungEmployees=[]
li.sort{a,b ->a.age<=>b.age}.each {YoungEmployees.add(it.name)}
println("Youngest employee: "+YoungEmployees.first())
println("Eldest employee: "+YoungEmployees.last())

//li.findAll({  if(it.salary<5000) println it.toString() })

//println "Name of the youngest employee and oldest employee: "+li.age.sort().last() +" "+ li.age.sort().first()

//println "Highest Salary of an employee is: "+ li*.salary.sort().last()


MAX_SAL= li.max{it.salary}
println "Highest Salary of an employee is: ${MAX_SAL.name}"

println "List of names of all the employees: " + li.name


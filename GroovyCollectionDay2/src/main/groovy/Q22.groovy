// Q22. Conside a class named "Employee" which has the following properties:
// 1) Name 2) Age 3) DepartmentName 4) EmployeeNumber 5) Salary Let's say that there's a list of 50 employees available.
// Perform the following operations on the list of employees:
//
//    Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on.
//    Get a count of the number of employees in each department
//    Get the list of employees whose age is between 18 and 35
//    Group the employees according to the alphabet with which their
// first name starts and display the number of employees in each group whose age is greater than
//    Group the employees according to their department.

class Employeee{
    String name
    int age
    String departmentName
    int employeeeNumber
    int salary
}
Employeee emp1=new Employeee(name: "sumit", age: 23, departmentName: "Grails", employeeeNumber: 3051, salary: 17000)
Employeee emp2=new Employeee(name: "shivani", age: 24, departmentName: "QA", employeeeNumber: 3052, salary: 17000)
Employeee emp3=new Employeee(name: "tyagi", age: 25, departmentName: "QA", employeeeNumber: 3053, salary: 5000)
Employeee emp4=new Employeee(name: "anshul", age: 21, departmentName: "IT", employeeeNumber: 3054, salary: 4000)
Employeee emp5=new Employeee(name: "abhinav", age: 21, departmentName: "Grails", employeeeNumber: 3055, salary: 9000)

List list=[emp1,emp2,emp3,emp4,emp5]
//
//list.groupBy {Employeee.salary}.eachWithIndex
//        { Map.Entry<Integer, List<Employeee>> entry, int i ->println entry.key+" : "+ entry.value.name }


list.each {if(it.age>18 && it.age<35) println it.name}

a=list.sort{a1,a2->a1.name<=>a2.name}
println(a.name)


//list.groupBy {if(it.salary>5000) println it}
//a= (1..100).groupBy{"\n"+it%10 }
//println  a
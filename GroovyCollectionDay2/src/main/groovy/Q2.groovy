//Q2. Create a set from a list containing duplicate elements.
// What do you observe? How can you achieve the same result without converting a list to a set?

List li= [1,2,3,4,5,6,1,2,3]
println li
println li as Set

// Set doesn't contain duplicate elements so it will replace the existing one with new one which is same
//A Set cares about uniqueness - it doesn't allow duplicates


println li.unique()


Set set =[1,2,3,4,5,6,1,2,3]
println set


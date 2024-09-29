package com.asn8.kotlinbasics

fun main() {

    var imList: List<Int> = listOf(4, 5, 6, 12, 23)
    var imNameList: List<String> = listOf("Jack", "Dylion", "Ashley", "Phebe", "Henry")

    // Example of Mutable List
    var mutableListExample = MutableListExample(mutableListOf(1, 12, 23, 65, 45, 20))
    println("Mutable List Before Write Operation : ")
    mutableListExample.getList() // Performed Read Function In Mutable List
    mutableListExample.add(25) // Performed Write Function in Mutable List
    println("Mutable List After Write Operation : ")
    mutableListExample.getList() // Performed Read Function In Mutable List
    //________________________________________________________________________________________________________

    // Example of Immutable List
    var immutableListExample1 = ImmutableListExample(imList)
    var immutableListExample = ImmutableListExample(imNameList)
    println("Number in immutable List : \n")
    immutableListExample1.getList()
    println("Name in immutable List : \n")
    immutableListExample.getList()
    /* we created Immutable List
     in immutable list we can read from but we can't write into the list

     imList.add()

     in immutable list it will show an error when using .add() method or function

     ________________________________________________________________________________________________________
     */

    // Example of Immutable Set
    var immutableSetExample =
        ImmutableSetExample(setOf(12, 35, 456, 665, 12, 545, 456, 650)) //Example of Immutable Set
    println("Example of Immutable Set : \n")
    immutableSetExample.getSet() // Performing Read operation in Immutable Set
    //immutableSetExample.add()   Can't perform Write operation in Immutable Set
    // ____________________________________________________________________________________________________________________________________

    // Example of Mutable Set
    var mutableSetExample = MutableSetExample(mutableSetOf(12, 25, 212, 45, 22, 56, 12, 25))
    println("Read Operation of Mutable Set : \n") // Read Operation in Mutable Set
    mutableSetExample.getSet()
    println("Write Operation of Mutable Set : \n") // Delete Operation in Mutable Set
    mutableSetExample.remove(55)
    println("Write Operation of Mutable Set : \n") // Write Operation in Mutable Set
    mutableSetExample.add(26) // Write Operation in Mutable Set
    mutableSetExample.getSet() // Read Operation in Mutable Set

    //_______________________________________________________________________________________________________________
    //Example of Immutable Map
    var immutableMapExample = ImmutableMapExample(mapOf(1 to "A",2 to "E",3 to "J", 4 to "K" , 5 to "N"))
    println("Read Operation in immutable Map")
    immutableMapExample.getMap()
    // We can't add write operation in immutable map eg. -- immutableMapExample.add(4,"Nicky")

    //___________________________________________________________________________________________________________________
    // Example of Mutable Map
    var mutableMapExample = MutableMapExample(mutableMapOf(1 to "Jack",2 to "Kaka",3 to "Elen",4 to "Levis",5 to "Hellen"))
    println("Read Operation in Mutable Map\n")
    mutableMapExample.getMap()
    println("Write Operation in Mutable Map\n")
    mutableMapExample.addMap(6,"Clark")
    println("Delete Operation in Mutable Map\n") // Write Operation in Mutable Map
    mutableMapExample.removeMap(4)
    /* If you want to remove value through .remove(key,value) method and the value of key in the mutableMapExample
    does match the value provided by the user in the function then it won't delete the set of Key,Value
    For Example :
    taking the example of mutableMapExample
    if put mutableMapExample.remove(4,"B")
    then the Output will still be same because value doesn't match.
    But if you provide mutableMap.remove(4,"Levis")
    then it will delete because values match
    */
    println("Read Operations after Write Operations\n")
    mutableMapExample.getMap()




}

class ImmutableListExample<T>(private var immutableListExample: List<T>) {

    fun getList() { // but we can read from the immutable List
        immutableListExample.forEach { item ->
            println(item)
        }
    }


}
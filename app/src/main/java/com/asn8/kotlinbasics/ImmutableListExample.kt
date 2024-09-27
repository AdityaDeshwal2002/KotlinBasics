package com.asn8.kotlinbasics

    fun main(){

        var imList : List<Int>  = listOf<Int>(4,5,6,12,23)
        var imNameList : List<String> = listOf<String>("Jack","Dylion","Ashley","Phebe","Henry")

        var mList : List<Int> = mutableListOf<Int>(2,24,22,56,5,10)

        var mutableListExample = MutableListExample(mutableListOf(1,12,23,65,45,20))        /* we created Immutable List
         in immutable list we can read from but we can't write into the list

         imList.add()

         in immutable list it will show an error when using .add() method or function
         */

        var immutableListExample = ImmutableListExample()
        println("Number in immutable List : \n")
        immutableListExample.getList(imList)
        println("Name in immutable List : \n")
        immutableListExample.getList(imNameList)


    }

class ImmutableListExample {

    fun getList(imList : List <Any>){ // but we can read from the immutable List
        for (item in imList){
            println(item)
        }
    }


}
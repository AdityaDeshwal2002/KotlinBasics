package com.asn8.kotlinbasics

class MutableListExample<T>(private var list: MutableList<T>) {

    fun add(number : T){
        list.add(number)
    }

    fun add(number: T, index : Int){
        if (list.size > index ){
            println("Index value out")
        }
        else{
            list.add(index,number)
        }
    }

    fun getList(){
        list.forEach { item ->
            println(item)
        }
    }

}
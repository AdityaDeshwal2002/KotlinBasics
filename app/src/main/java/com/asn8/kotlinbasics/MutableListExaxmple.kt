package com.asn8.kotlinbasics

class MutableListExample<T>(private var list: MutableList<T>) {

    // It is a mutable list and in this we can read and write
    fun add(number: T) {
        list.add(number) // For writing in mutable list
    }

    fun add(number: T, index: Int) {
        if (list.size > index) {// For writing in mutable list
            println("Index value out")
        } else {
            list.add(index, number)
        }
    }

    fun getList() { // For Reading in mutable list
        list.forEach { item ->
            println(item)
        }
    }

}
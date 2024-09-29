package com.asn8.kotlinbasics

class MutableSetExample<T>(private var mutableSetExample: MutableSet<T>) {
    fun add(item: T) {
        if (mutableSetExample.equals(item)) {
            println("Element already exist")
        } else {
            mutableSetExample.add(item)
        }

    }

    fun getSet() {
        mutableSetExample.forEach { item ->
            println(item)
        }
    }

    fun remove(item: T) {
        if (mutableSetExample.equals(item)) {
            mutableSetExample.remove(item)
        } else {
            println("Element doesn't existed")
        }
    }
}
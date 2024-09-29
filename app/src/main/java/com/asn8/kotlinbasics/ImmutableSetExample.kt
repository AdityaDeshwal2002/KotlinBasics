package com.asn8.kotlinbasics

class ImmutableSetExample<T>(private var immutableSetExample: Set<T>) {

    fun getSet() {
        immutableSetExample.forEach { item ->
            println(item)
        }
    }
}
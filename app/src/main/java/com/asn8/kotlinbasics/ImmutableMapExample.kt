package com.asn8.kotlinbasics

class ImmutableMapExample<K,V>(private var immutableSetExample : Map<K,V>) {
    fun getMap(){
        immutableSetExample.values.forEach { item ->
                        println(item)
        }
    }
}
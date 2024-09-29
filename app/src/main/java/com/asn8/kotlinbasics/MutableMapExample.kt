package com.asn8.kotlinbasics

class MutableMapExample<K,V>(private var mutableMapExample: MutableMap<K,V>) {
    fun addMap(key : K , value : V){
        if (mutableMapExample.containsKey(key)){
            println("This Map Contains this key plz first remove")
        }
        else{
            mutableMapExample.put(key,value)
        }
    }

    fun removeMap(key: K){
        mutableMapExample.remove(key)
    }
    fun removeMap(key: K,value: V){
        mutableMapExample.remove(key, value)
    }

    fun getMap(){
        mutableMapExample.keys.forEach { item ->
            println(mutableMapExample[item])
        }
    }
}
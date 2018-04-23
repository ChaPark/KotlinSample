package com.corpark.kotlinsample

class InitTest: MyInterface {
    override val prop: Int = 10

}


interface MyInterface{
    val prop: Int

    val propertyWithImplementation: String
        get() = "foo"

    fun foo(){
        print(prop)
    }
}
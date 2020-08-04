package com.juliarman.mytestingapp

class CuboidModel {

    private var width: Double = 0.0
    private var length: Double = 0.0
    private var height: Double = 0.0



    fun getVolume() : Double = width * length * height


    fun getSurfaceArea(): Double{

        val w1 = width * length
        val wh = width * height
        val lh = length * height
        return 2 * (w1 + wh + lh  )
    }


    fun  getCircumreference(): Double = 4 *( width + length + height)


    fun save(width: Double, length: Double, height: Double){

        this.width = width
        this.length = length
        this.height = height
    }

}
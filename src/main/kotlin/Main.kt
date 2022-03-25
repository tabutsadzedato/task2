fun main() {
    var newpoint = Point(1,2)
    println(newpoint.x)
    newpoint.symetryc()

}

class Point(number: Int, number2: Int) {
    var x: Int = number
    var y: Int = number2

    override fun toString(): String {
        return "x = $x y = $y"
    }

    override fun equals(other: Any?): Boolean {
        return if(other is Point){
            if(x == other.x && y == other.y) return true else false}
        else false
    }
    fun symetryc(){
        var symx: Int = -x
        var symy: Int = -y
        println(symx)
        println(symy)
    }



}
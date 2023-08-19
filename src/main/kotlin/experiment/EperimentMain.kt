package experiment


class EperimentMain : ArrayList<String>() {

    override fun add(element: String): Boolean {
        return super.add(element.toUpperCase())
    }

    override fun add(index: Int, element: String) {
        super.add(index, element.toUpperCase())
    }

    override fun get(index: Int): String {
        return super.get(index)
    }
}


fun main() {
    val contoh = EperimentMain()

    println(contoh.add("meme"))
    contoh.add(0, "contoh")


}
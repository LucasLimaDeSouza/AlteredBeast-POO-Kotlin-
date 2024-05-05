
interface Furious { // INTERFACES NÃO ACEITAM VALORES, PORÉM É POSSÍVEL DECLARAR VAR E FUN
    fun massacrar() {
        println("**MASSACROU**")
    }
}

enum class BeastEnum() {
    LUKE, WEREWOLF, GARUDA, UWH, MERMAN
}

abstract class Human() {

    abstract fun respirando() // * IMPLEMENTA O ESCOPO QUEM FOR HERDAR *

}

open class Luke() : Human() {

    open fun descansar() : String {
        var variavel = "Descansou"
        return variavel
    }

    override fun respirando() {
        println("respirando")
    }

    companion object { // * SERÁ USADO SEM PRECISAR INSTANCIAR A CLASSE *
        var pulou = "pulou"
        var distancia = "2km"
    }

}

open class Beast(name: String, StateHuman: Boolean) : Luke(), Furious {

    private lateinit var action: String
    private var human = StateHuman

    override fun descansar() : String {
        var variavel2 = "Descansou"
        return variavel2
    }

    override fun massacrar() {
        super.massacrar()
    }

    init {

        when(this.human) {
            true -> println("Humano")
            false -> println("Besta")

        }

       when(name.uppercase()) {

           BeastEnum.WEREWOLF.toString() -> {

               action = "Matar"

               massacrar()
           }

           BeastEnum.UWH.toString() -> {
               action = "Levitar"
           }

           BeastEnum.GARUDA.toString() -> {
               action = "Voar"
           }

           BeastEnum.MERMAN.toString() -> {
               action = "Nadar"
           }

           BeastEnum.LUKE.toString() -> {
               action = "Bateu"
           }

           else -> {
               action = "Personagem não identificado!!!"
           }
       }

        fazer()

    }

    // EQUIVALENTE AO TERNARIO DO JS
    fun fazer() = if (!this::action.isInitialized) action = "" else  println(action) // Se inicializado

    fun parar(){
        println("Parou!!")
    }

}

fun main() {

    // Colections (ESTUDOS) ..............................................................................................
    
    val lista2: MutableList<String> = mutableListOf("Marcos","Lucas E","Vitória","Thiago")
    val lista3 = mapOf<String, String>(Pair("Brasil","Marambaia"))
    val lista4 = mutableMapOf<String, String>(Pair("Brasil","Marambaia"))

    lista4["China"] = "Chong Ching"
    println(lista4)

    // Colections (ESTUDOS) ..............................................................................................

    print("Qual Personagem? : ")
    var beast = readLine().toString()

    var isHuman: Boolean

    when(beast.uppercase()) {

        "LUKE" ->  {
            isHuman = true

        } else -> {
            isHuman = false

        }
    }

    var bestaaa: Beast = Beast(beast,isHuman)

    with(bestaaa) { // MANEIRA SIMPLIFICADA DE USAR OS MÉTODOS DE UMA CLASSE
        fazer()
    }

    println("~~~~~~~~~~~~~~~~~~~~~~~~")
    println(Luke.distancia) // * SEM INSTANCIAR *
    println(Luke.pulou)

}
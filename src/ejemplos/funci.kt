package Carrrito

fun main(){
    agregarNombre("Andres")
    agregarApellido(" Ramirez")

    imprimirNombre()
}
var nombreCompleto = ""
fun agregarNombre(nombre: String){
    nombreCompleto += nombre
}
fun agregarApellido(apellido: String){
    nombreCompleto += apellido
}
fun imprimirNombre(){
    println(nombreCompleto)
}
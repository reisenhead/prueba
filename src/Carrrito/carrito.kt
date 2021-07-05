package Carrrito

class car{
    var nombreCompleto: String = ""

    fun agregarCantidad(cantidad: Int) {
        nombreCompleto += cantidad
    }
    fun agregarEsp(espacio: String) {
        nombreCompleto += espacio
    }
    fun agregarEspl(espaciol: String) {
        nombreCompleto += espaciol
    }
    fun agregarNombre(nombre: String =" ") {
        nombreCompleto += nombre
    }
    fun agregarPrecio(precio: Float) {
        nombreCompleto += precio
    }

    fun agregarStok(Stok: Int) {
        nombreCompleto += Stok
    }
    fun agregarTotal(total: Float) {
        nombreCompleto += total
    }
    fun imprimirNombre(){
        println(nombreCompleto)
    }

}

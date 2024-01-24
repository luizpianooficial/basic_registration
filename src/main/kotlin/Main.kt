fun main(){
    bonus()
}


fun bonus(){


    val cargos:List<String> = listOf("Gerente", "Coordenador", "Engenheiro", "Estagiário")
    var CargoInformado:String?


    do {
        println("Digite o cargo!")
        CargoInformado = readLine()
        if (CargoInformado != null && cargos.contains(CargoInformado)){
            println("Cargo registrado com Sucesso: ${CargoInformado}")

        }else{
            println("Cargo informado não é valido ${CargoInformado}")
        }
    } while (CargoInformado == null || !cargos.contains(CargoInformado))

}
def someMethod(Closure c){
    c("lalalalala")
}

def cl = {something ->
    println something
}

someMethod(cl)

def lista = ["a","b","c","d","e"]

lista.each {println(it)}

def lista2 = ['a':"Letra A",'b':"LetraB",'c':"Letrac",'d':"Letrad",'e':"Letrae"]

lista2.each {println("key:${it.key} Value: ${it.value}")}

def diaHoje = {Date dataHj,valor -> println(dataHj)
println("Daqui a $valor = ${dataHj + valor}")
}

diaHoje(new Date(), 10)

def diaDeAmNH = diaHoje.rcurry(1)

diaDeAmNH(new Date())

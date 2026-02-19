@groovy.transform.TupleConstructor
class Account{
    BigDecimal balance = 0

    void deposit(BigDecimal value){
        if (value<0.0){
            throw new Exception("Valor invalido")
        }
        balance+=value

    }

    void deposit(List values){
        values.each {
            value ->
                if(value<=0){
                    throw new Exception("Valor invalido")
                }
                deposit(value)
        }
    }
}

Account conta = new Account()
conta.deposit(10)
conta.getBalance()
try{
    conta.deposit(0)
}catch (Exception e){
    println(e.message)
}

conta.deposit([1,2,3,4,5,6])
println(conta.getBalance())

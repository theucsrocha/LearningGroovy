enum Days{
    Monday , Tuesday , Wednesday , Thursday , Friday , Saturday,Sunday
}
Range r = Days.Monday..Days.Sunday
println(r)
r.each {println it}
assert r.contains(Days.Sunday)
println(r.from)
println(r.to)



def list = []
r.each {list<<it}
println list
list.remove(Days.Saturday)
println list
list.push(Days.Saturday)
println(list.getAt(3))


def mapa = [:]
mapa.'1' = Days.Monday;
mapa.'2' = Days.Saturday;
mapa.'3' = Days.Sunday;
mapa.'4' = Days.Thursday;
println(mapa)
mapa.getClass().getName()
println(mapa.size())
mapa.each {println(it)}

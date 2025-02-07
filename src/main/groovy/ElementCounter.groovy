def countElements(List<Integer> list) {
    return list.countBy { it }
}

def input = [1, 3, 4, 5, 1, 5, 4]
println countElements(input)
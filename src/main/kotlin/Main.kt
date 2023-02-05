fun main() {
    val name = arrayOf ("eunice","liz", "senyia")
    var phoneNumber = arrayOf (710384378, 72129244, 719234456)
    var isFemale : Boolean = true
    var studentOne = arrayOf(name[0],phoneNumber[0],isFemale)
    var studentTwo = arrayOf(name[2],phoneNumber[2],!isFemale)
    var studentThree = arrayOf(name[1],phoneNumber[1],isFemale)

    println(studentOne.contentToString())
    println(studentTwo.contentToString())
    println(studentThree.contentToString())








}
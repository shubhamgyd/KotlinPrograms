class Student()
class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
    )
class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
    )
fun main() {
    val remigiuszFrost = Teacher(name = "Remigiusz", surname = "Frost", birthday = "23.07.1987",
        status = "ACTIVE")
    val biology = Subject(name = "Biology: Zoology", teacher = remigiuszFrost, isObligatory = true)
    println(biology.isObligatory)
    println(biology.teacher.birthday)
    println(biology.teacher.status)
    println(biology.name)

}

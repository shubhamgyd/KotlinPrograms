class Grade(
    val points: Int,
    val studentId: Int,
    val topicId: Int)
class Student(
    val id: Grade,
    val name: String,
    val surname: String
)
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
    val grade = Grade(points = 75, studentId = 12, topicId = 3)
    val i1 = Student(id = grade, name = "Sam", surname = "wit")
    println(i1.name)
    println(i1.id.points)
    println(i1.id.studentId)
    println(i1.id.topicId)
    print(i1.name )
    print(" ")
    print(i1.surname)


}

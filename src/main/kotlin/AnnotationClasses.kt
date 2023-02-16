import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

/**
 * In this reading, you will learn a feature of Kotlin that allows a programmer
 * to embed supplemental information into a source file.
 *
 * Annotation classes
 * The last special kind of class is called annotation. Annotations are classes
 * used to describe your code. For example, let's say that your function throws
 * an exception. To inform other coders that may use our class about such a
 * possibility, you can add annotation Throws with an exception class.
 */

annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Class annotation")
class A(
    @MyAnnotation("Constructor property annotation")
    val a: Int
) {
    @MyAnnotation("Method annotation")
    fun b() {}
}
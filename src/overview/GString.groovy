package overview

/**
 * String s = 'hello'  -> JDK String
 * String s = "hello"  -> GDK GString
 *
 * GString은 String을 개량한 버전으로 String보다 더 많은 기능을 지원함
 */
class GString {
    static void main(String[] args) {
        def jString = 'Welcom to Groovy'
        assert jString as java.lang.String

        def language = "Groovy"
        def gString = "Welcome to $language"
        assert gString == "Welcome to Groovy"
        assert gString as groovy.lang.GString
    }
}

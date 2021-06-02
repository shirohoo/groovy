package groovy

/**
 * 자바의 ==는 동일성비교, equlas()는 동등성 비교
 * 그루비는 ===혹은 is()가 동일성 비교, ==가 동등성 비교
 */
class GroovyCompare {
    static void main(String[] args) {
        String s1 = new String("안녕하세요")
        String s2 = new String("안녕하세요")
        println(s1==s2)
        println(s1===s2)
        println(s1.is(s2))
    }
}

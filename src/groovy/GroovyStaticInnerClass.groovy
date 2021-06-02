package groovy

/**
 * 그루비는 정적 내부 클래스에 대한 지원이 강력하므로
 * 내부 클래스를 이용 할 일이 있다면, 가급적 정적 내부 클래스로 사용한다.
 */
class GroovyStaticInnerClass {
    static class StaticInnerClass {
        String name = "홍길동"
    }
}
package overview

/**
 * 내부 클래스를 이처럼 사용할 수도 있다.
 */
public class SecondStaticInnerClass {
    public class X {}
    public X foo() {
        new X()
    }
    public static X createX(SecondStaticInnerClass y) {
        new X(y)
    }
}

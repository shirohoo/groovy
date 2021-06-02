package groovy

class GroovySyntax {

    static void testMethod(String param) {
        println("i\'m $param") // GDK GroovyGString 보간 사용
    }

    // Getter와 Setter는 그루비가 자동으로 작성해준다
    static class GroovyBeans {
        String name;
        int age;

        GroovyBeans(String name, int age) {
            this.name = name
            this.age = age
        }

        // return은 생략해도 되며, return type을 def로 선언하면 동적타이핑이 된다
        // 이 코드블록의 경우 GString을 반환 할 것
        def getInformation() {
            "name: $this.name | age: $this.age"
        }
    }

    static void main(String[] args) {
        // Java 10+의 var와 같은 동적 타이핑을 지원한다
        // for example in Java 10+: var i = 1;
        def i = 1; // Groovy는 var가 아닌 def사용

        // 세미콜론을 생략할 수 있다(파이썬을 생각하면 된다)
        // 하지만 여러줄의 코드를 한줄에 작성 할 경우엔 생략할 수 없다
        StringBuilder stringBuilder = new StringBuilder()
        String a; String b

        // 소괄호를 생략할 수 있다
        // 하지만 추천하지 않는 방법으로 명시적으로 선언해주는게 좋다고 보는 분위기인 듯
        // if문의 구문이 한줄일 경우 중괄호를 생략하는 것과 비슷하다고 생각하면 될 듯
        print 'a'
        println 'hello'.substring(0, 1)
        testMethod "hello"

        // System.out 은 기본적으로 import 돼있으므로 생략 가능
        System.out.println('')
        println('')

        System.out.printf('')
        printf('')

        System.out.print('')
        print('')

        // GString은 GDK에 추가된 여러 기능을 더 사용 할 수 있다
        // 대표적으로 보간기능이 있다 -> "hi, i\'m $param"
        // 쌍따옴표는 GDK GroovyGString
        // 홀따옴표는 JDK String
        String gdk = "hello"
        String jdk = 'hello'

        println('')

        def beans = new GroovyBeans("groovy", 10)
        println(beans.getInformation()) // name: groovy | age: 10
    }
}

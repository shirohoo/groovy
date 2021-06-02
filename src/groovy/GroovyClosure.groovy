package groovy

class GroovyClosure {

    // 클로저 정의
    def closure = { key, value ->
        {
            println(key)
            println(value)
            ["$key" : "$value"]
        }
    }
}

class Main {
    static void main(String[] args) {
        def groovyClosure = new GroovyClosure()

        // 호출 방법 1: 클로저변수만 사용
        println('방법 1')
        println(groovyClosure.closure('groovy', 'closure'))

        // 호출 방법 2: 클로저변수.call
        println('방법 2')
        println(groovyClosure.closure.call('groovy', 'closure'))
    }
}

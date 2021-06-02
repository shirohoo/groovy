package groovy

class GroovyOperatorOverloading {
    static void main(String[] args) {
        def a = new Bucket(1)
        def b = new Bucket(2)

        println((a + b).size)
        println((a - b).size)
        println((a / b).size)
        println((a * b).size)
        println((a % b).size)
    }
}

class Bucket {
    def size

    Bucket(def size) {
        this.size = size
    }

    // Operator Overloading
    // https://groovy-lang.org/operators.html#Operator-Overloading
    Bucket plus(Bucket other) {
        new Bucket(this.size + other.size)
    }

    Bucket minus(Bucket other) {
        new Bucket(this.size - other.size)
    }

    Bucket div(Bucket other) {
        new Bucket(this.size / other.size)
    }

    Bucket multiply(Bucket other) {
        new Bucket(this.size * other.size)
    }

    Bucket mod(Bucket other) {
        new Bucket(this.size % other.size)
    }
}

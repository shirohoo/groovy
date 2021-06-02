package groovy

class GroovyAssertions {
    static void main(String[] args) {
        // GroovyAssertions
        int i = 1
        assert (i == 1) // int i = 1 이므로 true
        assert ['a'] // List가 비어있지 않으므로 true
        assert ['a': 1] // Map이 비어있지 않으므로 true
        assert 'a' // String이 비어있지 않으므로 true
    }
}

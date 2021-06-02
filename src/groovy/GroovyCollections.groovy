package groovy

class GroovyCollections {

    // 리터럴 표기법 사용 시 중괄호({})는 Groovy에서 클로저의 예약어이므로 대괄호([])사용
    static void main(String[] args) {
        //-------------------------------------- List --------------------------------------//
        List<Integer> l1 = [1, 2, 3, 4] // Java Collection 사용 정적 타이핑
        def l2 = [1, 2, 3, 4] // def 예약어를 사용한 동적 타이핑 + 리터럴 표기법
        def l3 = ['Hi', 1, true, File] // 여러 타입의 요소를 같은 List에 포함시킬수도 있다

        def list = []  // 빈 List 선언
        list += [1, 2, 3] // List에 요소 추가
        assert list == [1, 2, 3] && list.size == 3 // 제대로 추가됐는지 검증

        list << 4 << 5 // List에 다음과 같은 방법으로도 요소를 추가할 수 있다 (C와 유사하다)
        assert list == [1, 2, 3, 4, 5]

        list.add(6) // List에 다음과 같은 방법으로도 요소를 추가할 수 있다 (Java의 방식)
        assert list == [1, 2, 3, 4, 5, 6]

        assert list[0] == 1 // Java 원시 배열: 인덱스를 직접 입력하여 요소를 꺼내는 방법
        assert list.get(0) == 1 // Java Collection: 인덱스를 직접 입력하여 요소를 꺼내는 방법
        assert list.getAt(1) == 2 // Groovy Collection: 인덱스를 직접 입력하여 요소를 꺼내는 방법
        assert list[-1] == 6 // 인덱스를 음수로 줄 경우 역순으로 검색한다. 이 경우 인덱스는 0이 아닌 1부터 시작
        assert list[-3] == 4 // 인덱스를 음수로 줄 경우 역순으로 검색한다. 이 경우 인덱스는 0이 아닌 1부터 시작

        list.putAt(1, 1) // 1번 인덱스(2)에 1을 덮어씌움
        assert list == [1, 1, 3, 4, 5, 6]
        assert list.set(1, 2) == 1 // 1번 인덱스(1)에 2를 덮어씌움. set메서드는 덮어씌워져 제거된 값을 리턴한다
        assert list == [1, 2, 3, 4, 5, 6]

        // Groovy는 stream 사용 시 별다른 이름을 지정하지 않으면 기본적으로 it을 사용한다
        list.each {
            // 모든 원소를 순차적으로 출력
            println "$it"
        }
        list.eachWithIndex {
                // 모든 원소와 인덱스를 출력
            it, index -> println "item: $it, index: $index"
        }

        list -= 1 // 원소를 제거. 일치하는 원소가 여러개 있을 경우 모두 제거된다
        assert list == [2, 3, 4, 5, 6]
        list = list.minus([2, 3, 4]) // 여러 원소를 제거
        assert list == [5, 6]

        //-------------------------------------- Map --------------------------------------//
        def map = ['name': 'shirohoo', 'hobby': 'develop'] // Map 선언
        assert map.size() == 2 // Map 사이즈 검증

        map += ['skills': ['java', 'groovy']] // Map에 List를 원소로 추가
        assert map == ['name': 'shirohoo', 'hobby': 'develop', 'skills': ['java', 'groovy']]

        map['age'] = 28 // 배열에 key:age로 새로운 값 추가
        assert map == ['name': 'shirohoo', 'hobby': 'develop', 'skills': ['java', 'groovy'], 'age': 28]

        // 값을 확인하는 여러가지 방법들
        assert map.name == 'shirohoo'
        assert map['name'] == 'shirohoo'
        assert map.get('name') == 'shirohoo'
        assert map.getAt('name') == 'shirohoo'
        assert map.skills[0] == 'java'

        map.each {
                // 모든 원소를 순차적으로 출력
            it -> println it.key + ":" + it.value
        }

        map.eachWithIndex {
                // 모든 원소와 인덱스를 출력
            it, index -> println "item $index - " + it.key + ":" + it.value
        }

        //-------------------------------------- range --------------------------------------//
        def range = 1..10 // 1~10까지 순차적으로 선언
        assert range == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        range = 'a'..'c' // a~b까지 선언
        assert range == ['a', 'b', 'c']

        range = 1..<8 // 1~7까지 선언
        assert range == [1, 2, 3, 4, 5, 6, 7]

        (1..5).each {
            // 1~5까지 선언, 출력
            println it
        }

        assert [*3..10] == [3, 4, 5, 6, 7, 8, 9, 10] // *이 앞에 추가되면 실제로 구현함
        assert [5, 7, *2..4] == [5, 7, 2, 3, 4] // List [5,7]에 2~4까지를 순차적으로 추가함
    }
}

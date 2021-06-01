package overview

import groovy.transform.PackageScope

/**
 * @PackageScope : 접근제한 package-private으로 설정. 생략하면 public (자바는 default임)
 */
class AccessModifier {
    @PackageScope String name = "홍길동"
}
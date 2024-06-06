
If you're using Maven, you can add the JAXB dependencies to your pom.xml file:
```
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-core</artifactId>
    <version>2.3.0.1</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>2.3.3</version>
</dependency>
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>activation</artifactId>
    <version>1.1.1</version>
</dependency>
```

If you're using Gradle, you can add the dependencies to your build.gradle file:
```
dependencies {
    implementation 'javax.xml.bind:jaxb-api:2.3.1'
    implementation 'com.sun.xml.bind:jaxb-core:2.3.0.1'
    implementation 'com.sun.xml.bind:jaxb-impl:2.3.3'
    implementation 'javax.activation:activation:1.1.1'
}
```
If you're not using a build tool like Maven or Gradle, you can manually download the required JAR files and add them to your project’s classpath:

jaxb-api-2.3.1.jar

jaxb-core-2.3.0.1.jar

jaxb-impl-2.3.3.jar

activation-1.1.1.jar

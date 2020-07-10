# common-vocaloid-java [![](https://jitpack.io/v/CXwudi/common-vocaloid-java.svg)](https://jitpack.io/#CXwudi/common-vocaloid-java)

A package containing my commonly used entity classes and utils for Vocaloid and Miku, can be imported using maven.
Primarily, this is used by my another personal project, [Project-VD](https://github.com/CXwudi/project-vd)

## How to use

Packages are released on [jitpack](https://jitpack.io/#CXwudi/common-vocaloid-java/). So you can add these following to your maven pom file.
```maven
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
```

```maven
    <dependency>
        <groupId>com.github.CXwudi.common-vocaloid-java</groupId>
        <artifactId>common-vocaloid-import-all</artifactId>
        <version>1.0+</version>
    </dependency>
```

The `*-import-all` module is a simple aggregator of others modules, so simply add this one to your dependencies will automatically add all modules into your project.
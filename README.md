# Spring Boot RESTful 執行說明
##### 首先，安裝Gradle 4.X以上的版本，環境變數需要設置，做法與JAVA設置環境變數一樣。
---
##### 使用cmd進入到專案，位置與build.gradle同一層，執行以下指令:
    gradle tasks//顯示被導入的tasks
    gradle assemble//打包
    gradle clean build//建立jar檔
---
##### 進入build底下的lib，執行jar檔
    java -Dserver.port={port} -jar {name}.jar

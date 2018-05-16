# Spring Boot RESTful 執行說明
##### JAVA 1.8 & Gradle 4.7
---
##### 專案資料夾結構
     - src - tw - com - codedata - application - WebApplication.java //jar檔主要啟動的程式
     |                           |
     |                           - controller - InfoController.java //接口位置和程式
     |                           |
     |                           - model - Information.java
     |                                     //Spring Boot把進入model的資料自動包裝成json格式
     - lib //執行gradle copyJars把jar檔下載至此資料夾
     |
     - build //執行gradle clean build後才會出現
     |
     - build.gradle //放置gradle打包時需要的參數，或是自行撰寫的task
---
##### 首先，使用JAVA 1.8並安裝Gradle 4.X以上的版本。檔案直接放置於C:\底下，環境變數需要設置，做法與JAVA設置環境變數一樣。
---
##### 使用cmd進入到專案，位置與build.gradle同一層，執行以下指令:
    gradle -v           //確認gradle版本
    gradle tasks        //顯示被導入的tasks
    gradle copyJars     //把依賴的jar檔下載至lib資料夾
    gradle assemble     //打包
    gradle clean build  //建立jar檔
---
##### 進入build底下的lib，執行jar檔
    java -Dserver.port={port} -jar {name}.jar
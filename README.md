## 校园社区

## 资料
[Spring 文档](https://spring.io/guides)

[Spring Web 文档](https://spring.io/guides/gs/serving-web-content/)

[ES](https://elasticsearch.cn/)

[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)

[Bootstrap](https://v3.bootcss.com/)

[Github OAuth](https://developer.github.com/apps/building-github-apps/creating-a-github-app/)

[spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

[thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#iteration)

[Markdown插件](http://editor.md.ipandao.com/index.html)

## 工具
[Git](https://git-scm.com/download)

[Visual Paradigm时序图工具](https://www.visual-paradigm.com)

[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

[lombok](https://projectlombok.org/)

[Postman](https://chrome.google.com/webstore/detail/tabbed-postman-rest-clien/coohjcphdfgbiolnekdpbcijmhambjff)

## 脚本
```sql
create table USER
(
  ID           INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        CHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
);
```
```bash
mvn flyway:migrate
mvn mybatis-generator:generate
```
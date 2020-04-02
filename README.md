## 校园社区

## 资料
[Spring 文档](https://spring.io/guides)
[Spring Web 文档](https://spring.io/guides/gs/serving-web-content/)
[ES](https://elasticsearch.cn/)
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)
[Bootstrap](https://v3.bootcss.com/)
[Github OAuth](https://developer.github.com/apps/building-github-apps/creating-a-github-app/)
[spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)
## 工具
[Git](https://git-scm.com/download)
[Visual Paradigm时序图工具](https://www.visual-paradigm.com)

##脚本
```sql
create table USER
(
  ID           INTEGER default NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_7F44F138_5EDF_4D31_9168_8EE9633A3070" auto_increment,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        CHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT,
  constraint USER_PK
    primary key (ID)
);
```
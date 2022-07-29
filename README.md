# yugabyteサンプル

## 管理コンソール

1. [YT-Master Admin UI](http://localhost:7000/)
2. [YT-TServer Admin UI](http://localhost:9000)

## 接続情報

| 項目         | 値        |
| ------------ | --------- |
| ホスト       | localhost |
| ポート       | 5433      |
| データベース | yugabyte  |
| スキマー     | gekal     |
| ユーザー名   | yugabyte  |
| パスワード   | yugabyte  |

> コンフィグ例：

```yaml
driver-class-name: com.yugabyte.Driver
url: jdbc:yugabytedb://localhost:5433/yugabyte?currentSchema=gekal
username: yugabyte
password: yugabyte
```

## IntelliJ IDEAのデータソース 

```xml
#DataSourceSettings#
#LocalDataSource: yugabyte@localhost
#BEGIN#
<data-source source="LOCAL" name="yugabyte@localhost" uuid="bae97286-863b-46f4-ac5b-684844863409"><database-info product="PostgreSQL" version="11.2-YB-2.15.0.1-b0" jdbc-version="4.2" driver-name="PostgreSQL JDBC Driver" driver-version="42.3.0" dbms="YUGABYTE" exact-version="2.15.0.1" exact-driver-version="42.3"><identifier-quote-string>&quot;</identifier-quote-string></database-info><case-sensitivity plain-identifiers="lower" quoted-identifiers="exact"/><driver-ref>yugabyte</driver-ref><synchronize>true</synchronize><jdbc-driver>com.yugabyte.Driver</jdbc-driver><jdbc-url>jdbc:yugabytedb://localhost:5433/yugabyte</jdbc-url><secret-storage>master_key</secret-storage><user-name>yugabyte</user-name><schema-mapping><introspection-scope><node kind="database" qname="yugabyte"><node kind="schema" qname="gekal"/></node></introspection-scope></schema-mapping><working-dir>$ProjectFileDir$</working-dir></data-source>
#END#
```

## 参照

1. [Create a local cluster](https://docs.yugabyte.com/preview/quick-start/create-local-cluster/docker/)
2. [Build a Java application](https://docs.yugabyte.com/preview/quick-start/build-apps/java/ysql-jdbc/)

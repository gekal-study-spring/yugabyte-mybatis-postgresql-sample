# yugabyteサンプル

## 管理コンソール

1. <http://127.0.0.1:7000/>

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

## 参照

1. [Create a local cluster](https://docs.yugabyte.com/preview/quick-start/create-local-cluster/docker/)
2. [Build a Java application](https://docs.yugabyte.com/preview/quick-start/build-apps/java/ysql-jdbc/)

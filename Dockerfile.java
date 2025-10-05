#JDK
FROM eclipse-temurin:21-jdk

# 作業ディレクトリ
WORKDIR /app

# build context に渡したフォルダ全体をコピー
COPY . /app

# src以下の全てのJavaファイルをコンパイル
RUN find src -name "*.java" > sources.txt && javac @sources.txt

# 実行時にMainクラスを引数で受け取れるようにする
ENTRYPOINT ["java", "-cp", "src"]
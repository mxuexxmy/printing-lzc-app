rm -rf ./dist
mkdir -p dist
# 构建后端二进制文件 (前后端不分离)
cp  run-app-resouce/printing-lzc-app-1.13-SNAPSHOT.jar run-app-resouce/run.sh  dist/
# 构建前端
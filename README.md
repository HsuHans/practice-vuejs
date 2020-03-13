# practice-vuejs

ppt : https://github.com/HsuHans/practice-vuejs/raw/master/intro-to-vue.pptx

# Run Vue Webpack
使用下列連結步驟安裝npm

https://github.com/nodejs-tw/nodejs-wiki-book/blob/master/zh-tw/node_npm.rst

安裝完後指定當前路徑到package.json同一個folder下：
cd {path}/{dist}
npm install

各系統使用下列cmd打包
linux -> npm run build-local
wid -> npm run build-local-win

成功後會輸出在 js-output folder

# Build Local Maven Project with command line 
  - for windows.
  
先參考下列連結安裝JDK與Maven

https://mkyong.com/maven/how-to-install-maven-in-windows/

完成後於cmd指定當前路徑到project folder下：
依照順序呼叫以下指令
1. mvn compile
2. mvn clean install
3. mvn spring-boot:run
第三步驟為啟動server, started後可連以下路徑測試是否成功

http://localhost:8080/first-example/index

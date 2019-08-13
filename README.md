# springboot-https
springboot结合https


###jdk生成秘钥文件命令：
```
    keytool -genkey -alias tomcathttps -keyalg RSA -keysize 2048 -keystore C:\Users\ThinkPad\Desktop\javahttpskey.p12 -validity 365
```
###命令说明：
```
    genkey 表示要创建一个新的密钥。
    alias 表示 keystore 的别名。
    keyalg 表示使用的加密算法是 RSA ，一种非对称加密算法。
    keysize 表示密钥的长度。
    keystore 表示生成的密钥存放位置。
    validity 表示密钥的有效时间，单位为天。
```
###生成后，将秘钥文件放到resources目录下即可。

# jspweb
# 入门jsp入门工程例子

## software version 
* java1.8se， 
* Tomcat9.0，

* eclipse marketplace install the Spinh Toold plug-in 
> + eclipse Version: Oxygen.1a Release (4.7.1a) 
> > - "Spring Tools 3 Add-On 3.9.5 RELEASE"         TEST OK
> + eclipse Version: 2018-09 (4.9.0)    
> > - "Sptinh Toold 4 4.4.0.0.RELEASE"               TEST OK
* 后台db数据库使用mysql5
>> [db]: https://github.com/kingsir25/WSR/blob/master/dbinstall/create.txt "dbinstall/create.txt"
>> 参照[db]文件，导入数据.

1. 浏览器URL输入：http://localhost:8080/jspweb/login/login.jsp
>> 显示登陆画面

2. JavaWeb: 报错信息The superclass "javax.servlet.http.HttpServlet" was not foundon the Java Build Path

>> 下面是具体的解决方法：
>> 1、右击web工程-》属性或Build Path-》Java Build Path->Libraries-> Add Libray...->Server Runtime -》Tomcat Server
>> 2、切换到Java
>>  Build Path界面中的Orader and Export，选择Tomcat。

>> 注意：
>> 按以上方法操作时，若打开Server
>>  Runtime后一片空白，需要设置Apache服务器。设置方法为：window->Preferences->Server->Runtime Environment -> add --> 选择Apache的版本后点Next，再填入你apache服务器软件的安装（解压后）地址。


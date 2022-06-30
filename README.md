# Zxing
将Eclipse的Zxing提取转化为了Android Studio项目

## 我所做的
- https://github.com/zxing/zxing ，将整个项目克隆下来。
- 将android这个eclipse项目中的文件分门别类的复制到新建的Android Studio项目下。
- 去https://repo1.maven.org/maven2/com/google/zxing/core/ （网址是zxing文档中提到的），下载最新的jar包放入到libs文件夹下导入到AndroidStudio项目中，build.gradle中dependencies中末尾添加
`
implementation fileTree(include: ['*.jar'], dir: 'libs')
`
- 然后就是查看各个java文件，修改其错误的包名，我用的Ctrl+R来替换。
- 然后会发现少了一个类，CameraConfigurationUtils.java，去GitHub的zxing项目下搜索，找到了它，它在android-core文件夹下面，然后将它复制到我写的Android Studio下的一个camera包下，然后就大功告成了。

**你可以直接用我的，这样会省不少时间**，整个zxing项目，我们android只涉及到
```
android/
android-core/（这个下面就一个CameraConfigurationUtils.java文件）
core/
```

完！

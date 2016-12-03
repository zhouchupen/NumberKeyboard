# NumberKeyboard

Android自定义底部输入键盘


![](http://upload-images.jianshu.io/upload_images/2746415-c242d73c49725349.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## Installing

Users of your library will need add the jitpack.io repository:

```gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

and:

```gradle
dependencies {
    compile 'com.github.zhouchupen:NumberKeyboard:v1.0'
}
```

Note: do not add the jitpack.io repository under `buildscript` 

## Adding a sample app 

If you add a sample app to the same repo then your app needs to depend on the library. To do this in your app/build.gradle add a dependency in the form:

```gradle
dependencies {
    compile project(':library')
}
```

where 'library' is the name of your library module.

## Using

You may need this to use the keyboard.  Put this into your xml file:
```xml
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.scnu.zhou.widget.NumberKeyboard
        android:id="@+id/numberKeyboard"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true">

    </com.scnu.zhou.widget.NumberKeyboard>

</RelativeLayout>
```
And you are able to know what you have input:
```java
NumberKeyboard numberKeyboard = (NumberKeyboard) findViewById(R.id.numberKeyboard);
numberKeyboard.setOnInputListener(new NumberKeyboard.OnIuputListener() {
      @Override
       public void onInput(int num) {

           if (num != -1) {
                    // input number
           }
           else{
                    // backspace
           }
       }
});
```

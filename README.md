# CuteToast


[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
 [![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21) [![JitPack](https://img.shields.io/jitpack/v/github/ahmmedrejowan/CuteToast)](https://jitpack.io/#ahmmedrejowan/CuteToast) [![GitHub license](https://img.shields.io/github/license/ahmmedrejowan/CuteToast)](https://github.com/ahmmedrejowan/CuteToast/blob/master/LICENSE)  
 
[![GitHub forks](https://img.shields.io/github/forks/ahmmedrejowan/CuteToast)](https://github.com/ahmmedrejowan/CuteToast/network) [![GitHub issues](https://img.shields.io/github/issues/ahmmedrejowan/CuteToast)](https://github.com/ahmmedrejowan/CuteToast/issues) [![GitHub stars](https://img.shields.io/github/stars/ahmmedrejowan/CuteToast)](https://github.com/ahmmedrejowan/CuteToast/stargazers) [![GitHub contributors](https://img.shields.io/github/contributors/ahmmedrejowan/cutetoast)](https://github.com/ahmmedrejowan/CuteToast/graphs/contributors)

![CuteToast](https://user-images.githubusercontent.com/42619122/117730837-d9e6cd00-b20e-11eb-94fb-3bd3582d4800.png)

**A material design Toast Library for Android**

## Purpose

**CuteToast** is an Android Custom `Toast` library that could be used instead of Default `Toast`. It does everything as Toast but with some **extra spice**.

**CuteToast** allows developers to use Toast with Colorful design and Icons. It's **open-source** and **free to use**. 
Give it a try.!

## What's New
- **CuteToast** without pre-built icon version added. Check the dependencies.

More changes in `Release` Tab. 

## Screenshots

Click to View High Quality

![Screenshot](https://user-images.githubusercontent.com/42619122/117723451-35f82400-b204-11eb-8914-d5ce84ccbbee.jpg)


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
<br/>

## Dependencies

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.ahmmedrejowan.CuteToast:CuteToast:1.2'
}
```
<br/>

If you want to use only **Custom Background Options** (no Pre-build Icons), then:

```gradle
dependencies {
	...
	implementation 'com.github.ahmmedrejowan.CuteToast:CuteToast-Custom:1.2'

}
```
<br/>

## Usage

Each of the following method returns a `Toast`. **Don't Forget to Call `.show()`**

To display an Info Toast:

``` java
       CuteToast.ct(this, "This is a Info Toast", CuteToast.LENGTH_SHORT, CuteToast.INFO, true).show();
```
To display a Warning Toast:

``` java
       CuteToast.ct(this, "This is a Warning Toast", CuteToast.LENGTH_SHORT, CuteToast.WARN, true).show();
```
To display an Error Toast:

``` java
       CuteToast.ct(this, "This is a Error Toast", CuteToast.LENGTH_SHORT, CuteToast.ERROR, true).show();
```
To display a Success Toast:

``` java
       CuteToast.ct(this, "This is a Success Toast", CuteToast.LENGTH_SHORT, CuteToast.SUCCESS, true).show();
```
To display a Happy Toast:

``` java
       CuteToast.ct(this, "This is a Happy Toast", CuteToast.LENGTH_SHORT, CuteToast.HAPPY, true).show();
```
To display a Sad Toast:

``` java
       CuteToast.ct(this, "This is a Sad Toast", CuteToast.LENGTH_SHORT, CuteToast.SAD, true).show();
```
To display a Confuse Toast:

``` java
       CuteToast.ct(this, "This is a Confuse Toast", CuteToast.LENGTH_SHORT, CuteToast.CONFUSE, true).show();
```
To display a Delete Toast:

``` java
       CuteToast.ct(this, "This is a Delete Toast", CuteToast.LENGTH_SHORT, CuteToast.DELETE, true).show();
```
To display a Save Toast:

``` java
       CuteToast.ct(this, "This is a Save Toast", CuteToast.LENGTH_SHORT, CuteToast.SAVE, true).show();
```
To display a Normal Toast:

``` java
       CuteToast.ct(this, "This is a Normal Toast", CuteToast.LENGTH_SHORT, CuteToast.NORMAL, true).show();
```

<br/>

### If you don't want the Icons:
#### Replace `true` to `false` at the end of the statment.

``` java
       CuteToast.ct(this, "This is a Info Toast", CuteToast.LENGTH_SHORT, CuteToast.INFO, false).show();
```

``` java
       CuteToast.ct(this, "This is a Error Toast", CuteToast.LENGTH_SHORT, CuteToast.ERROR, false).show();
```

and same for the other types too. 

#### Or Just Remove the last `boolean` part

``` java
       CuteToast.ct(this, "This is a Info Toast", CuteToast.LENGTH_SHORT, CuteToast.INFO).show();
```

``` java
       CuteToast.ct(this, "This is a Error Toast", CuteToast.LENGTH_SHORT, CuteToast.ERROR).show();
```

<br/>

### If you want to use Custom Icons:

``` java
        CuteToast.ct(this, "This is an Info Toast with Custom Star Icon", CuteToast.LENGTH_SHORT, CuteToast.INFO, R.drawable.ic_star).show();
```

``` java
        CuteToast.ct(this, "This is an Error Toast with Custom Danger Icon", CuteToast.LENGTH_SHORT, CuteToast.ERROR, R.drawable.danger_ic).show();
```

## Notes


* If `this` shows an error, then replace it with `MyActivity.this` where MyActivity is your activity name.
* Durations are `CuteToast.LENGTH_SHORT` and `CuteToast.LENGTH_LONG` .
* Total 10 Background Desings are available:
	- INFO
	- WARN
	- ERROR
	- SUCCESS
	- HAPPY
	- SAD
	- CONFUSE
	- DELETE
	- SAVE
	- NORMAL
* Icon Options:
	- If `icon` is `true`, then pre-built icons will be shown
	- If 'icon` is 'false` or 'boolean' is removed, then no icon will be shown
	- If 'icon' is added by using `R.drawabale.icon_name` , then custom icon will be shown.
* If you use the Custom Dependency (`implementation 'com.github.ahmmedrejowan.CuteToast:CuteToast-Custom:1.1`) then you can't use the pre-built icons.



<br/>


## Contribute

Please fork this repository and contribute back using [pull requests](https://github.com/ahmmedrejowan/CuteToast/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

Let me know which features you want in the future in `Request Feature` tab. 

If this project helps you a little bit, then give a to Star ⭐ the Repo. 

<br/>


## Credits

Created with Love by **K M Rejowan Ahmmed** (@ahmmedrejowan)

Reach me @
* [Github](https://github.com/ahmmedrejowan) 
* [LinkedIn](https://www.linkedin.com/in/ahmmedrejowan)
* [Twitter](https://twitter.com/ahmmedrejowan)
* [Facebook](https://facebook.com/ahmmedrejowan)
* [StackOverFlow](https://stackoverflow.com/users/9932194/k-m-rejowan-ahmmed)




## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2021 K M Rejowan Ahmmed (ahmmedrejowan)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```





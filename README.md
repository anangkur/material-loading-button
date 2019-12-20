# Material-Loading-Button
Material Button with loading inside the button.

[![](https://jitpack.io/v/anangkur/Material-Loading-Button.svg)](https://jitpack.io/#anangkur/Material-Loading-Button)

## Requirements
- minSdkVersion 21
- compileSdkVersion 29
- androidx

## Quickstart

Include Airship into the build.gradle file:

```
   allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
dependencies {
	        implementation 'com.github.anangkur:Material-Loading-Button:0.0.1'
	}
```

## Features

* Border (stroke, radius, color)
* Background (normal, focus)
* Gradient Color
* Corner (radius)
* Loading inside the button

## Usage
Add the MaterialLoadingButton View with custom params :
```
<com.anangkur.materialloadingbutton.MaterialLoadingButton
        android:id="@+id/normal_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
```

##  Supported Attributes

| XML Attribute        | Java Attribute           | Description  |
| ------------- |:-------------:| -----:|
| mlb_defaultColor      | setColor(int)     | background of the button |
| mlb_startColor     | -      |  gradient background start color of the button |
| mlb_endColor | -      |    gradient background start color of the button |
| - | setGradientColor(int, int) | gradient background start & end color of the button |
| mlb_strokeColor | - | color of stroke for background of the button |
| mlb_strokeWidth | - | width of stroke for background of the button |
| - | setStroke(float, int, int) | set stroke for background of the button with params width, color stroke, color background.
| mlb_cornerRadius | - | set radius background of the button | 
| mlb_cornerRadiusTopLeft | - | set top left radius background of the button |
| mlb_cornerRadiusTopRight | - | set top right radius background of the button |
| mlb_cornerRadiusBottomLeft | - | set bottom left radius background of the button |
| mlb_cornerRadiusBottomRight | - | set bottom right radius background of the button |
| mlb_gradientOrientation | setOrientation(orientation) | set gradient orienatation background of the button |
| mlb_textButton | setText(string) | set text of the button |
| mlb_textColor | setTextColor(int) | set text color of the button |

## Developed By

Anang Kurniawan

Follow [@anang_kur](http://twitter.com/anang_kur) on Twitter.
Follow [@anang.kur](http://instagram.com/anang.kur) on Instagram.

For contact, shoot me an email at <anangk97@gmail.com>

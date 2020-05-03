# Android-Simple-Popup
Create popup easily for android studio projects

![hippo](https://media.giphy.com/media/gII8JwuO8IlJjmnxsm/giphy.gif)



# how to install
<h4> Add in build.gradle(Project:...)</h4>

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
	  	}
  	}
    

<h4> Add the dipendency in build.gradle(Module:...)    </h4>

    dependencies {
	        implementation 'com.github.IvanoDibenedetto:Android-Simple-Popup:2.1'
	      }



# example

     public void onClickButton(View view) {
  
        SimplePopup popup = new SimplePopup(this,"Title","Message","Accept");
        popup.Create();
    }
   

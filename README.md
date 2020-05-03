# Android-Simple-Popup
Create popup easily for android studio projects


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
	        implementation 'com.github.IvanoDibenedetto:Android-Simple-Popup:1.9'
	      }


# example

     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	
	SimplePopup popup = new SimplePopup(this,"Title","Message","Ok");
        popup.Create();
    }
   

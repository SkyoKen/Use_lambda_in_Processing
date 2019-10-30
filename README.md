# Use lambda in Processing
　Change Processing API level to use LAMBDA.
 
 <p align="right">2019.10.30</p>
 
## Contents
* [Problem](#Problem)
* [Using](#Using)
* [Result](#Result)
* [Version](#Version)
## Problem
　I want to use lambda in Processing 3.5.3.  
 　But it doesn't work.  
#### code:
```Processing
ArrayList<String> list=new ArrayList<String>();
for (int i=0; i<5; i++){
  list.add(String.valueOf((char)('a'+i)));
}
list.forEach((i)->println(i));
```
#### error:
```Processing
Lambda expressions are allowed only at source level 1.8 or above
```

![Processing Error](https://github.com/SkyoKen/Use_lambda_in_Processing/blob/master/image/Processing_Error.png)

　It shows that Processing does not support all Java 8 language features.  
## Using
　So I tried to use Processing as a Java library in Eclipse.  
　And it works now.
#### 1. Create a new project in Eclipse.
#### 2. Add Processing library.
* Right-click your project
* Click `Properties` 
* Click `Java Build Path` 
* Click `Libraries` 
* Click `Add External JARs...`
* Add `C:/Program Files/processing-3.5.3/libraries/core.jar` 
* Click OK

![Add library](https://github.com/SkyoKen/Use_lambda_in_Processing/blob/master/image/AddLibrary.png)

　We can use Processing as a Java library now.
 ## Result
 ### try to use lambda
 ![Use lambda in eclipse](https://github.com/SkyoKen/Use_lambda_in_Processing/blob/master/image/Eclipse_Lambda.png)
 ### also can use Method Reference
 ![Use Method Reference in eclipse](https://github.com/SkyoKen/Use_lambda_in_Processing/blob/master/image/Eclipse_MethodReference.png)
 
 ## Version
| Item  | Version |
|  ----  | ----  |
| OS  | Windows 10  |
| Processing  | processing-3.5.3 |
| Java | 1.8.0_212 |
| Eclipse | Oxygen.3a Release (4.7.3a) |

* [UP↑](#Contents)

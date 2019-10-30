# Use lambda in Processing
　Change Processing API level to use LAMBDA.
## Contents
* [Problem](#Problem)
* [Using](#Using)
* [Result](#Result)
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

![Add library]()

　We can use Processing as a Java library now.
 ## Result
 ### try to use lambda
 ![Use lambda in eclipse]()
 ### also can use Method Reference
 ![Use Method Reference in eclipse]()

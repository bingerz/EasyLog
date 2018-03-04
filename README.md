# EasyLog

A library to simple package for Android Log, you can automatically get the TAG, method name, line number, custom Append Log details.
## Code Example

```java
    
    EasyLog.setLoggable(true);  //Default is true;
    
    EasyLog.d("hello world.");
    
    EasyLog.setAppendTag(true); //Add Log Details: <methodName():LineNumber>
    
```
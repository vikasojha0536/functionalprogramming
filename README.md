# functionalprogramming

In imperative coding we do how to do it
In functional programming we only care what to do not how

![img_1.png](img_1.png)

![img.png](img.png)

![img_2.png](img_2.png)

## Impure functions
Math.random(); //0.03
Math.random(); //0.71

## Pure functions
Math.sqrt(81); //9
Math.sqrt(81); //9

![img_3.png](img_3.png)

![img_4.png](img_4.png)

![img_5.png](img_5.png)
![img_6.png](img_6.png)

## Immutability
Below is mutable code
![img_7.png](img_7.png)

Below is immutable code
![img_8.png](img_8.png)

## Why functional programming matters
## Memoization
![img_9.png](img_9.png)

## Avoid void functions
1) Write immutable(dont change the state of the input parameters)/pure functions



![img_11.png](img_11.png)
![img_10.png](img_10.png)

## Lazy evaluation
![img_12.png](img_12.png)

![img_13.png](img_13.png)


![img_14.png](img_14.png)

![img_15.png](img_15.png)

![img_16.png](img_16.png)
![img_17.png](img_17.png)
![img_18.png](img_18.png)

Caller code has to now call both the methods
![img_19.png](img_19.png)

The customer reference is used only in updateRewardBalance, then
we can move the customer as parameter
![img_20.png](img_20.png)



## Side effect
In the below example issueReward is adding customers reward balance

![img_21.png](img_21.png)

check below, if we do customer.getRewardBalance() it will be 10 first time
and then after issueReward call the same will be 15 thats a side effect
![img_22.png](img_22.png)

![img_23.png](img_23.png)

## To Achieve Referential transparency we need immutable data


## Functional programming
![img_24.png](img_24.png)

Five main functional interfaces
![img_25.png](img_25.png)

## High order functions
![img_26.png](img_26.png)

![img_27.png](img_27.png)

## Point free programming
![img_28.png](img_28.png)

Aggregation vs composition
![img_29.png](img_29.png)
![img_30.png](img_30.png)

## Closure
![img_31.png](img_31.png)
![img_32.png](img_32.png)
![img_33.png](img_33.png)

## Currying
![img_34.png](img_34.png)

```mermaid
sequenceDiagram
    participant dotcom
    participant iframe
    
    dotcom->>iframe: loads html w/ iframe url
    Note right of dotcom: ```json{<br/>  "references" : [ {<br/>    "id" : "vsUCBDmXYOgMyoqSXMhrOO",<br/>    "type" : "MASKEDPAN"<br/>  }, {<br/>    "id" : "SuTfGRIqfyYbYWeAmsMzeW",<br/>    "type" : "MASKEDPAN"<br/>  } ],<br/>  "id" : "XCXPCKxFsnTVAPrsWKAR",<br/>  "label" : "DlVmMChuPvXcXhoBG",<br/>  "currency" : "RvUyBRfSUriwruMwpmKWkfEVyETIH",<br/>  "holder" : {<br/>    "firstName" : "VJqjssXYAaNusLtjntQcYcCNAGqJQG",<br/>    "lastName" : "qEGdfSUWKzpziGXiWAumOQDji",<br/>    "title" : "UFoLjVCf"<br/>  }<br/>}```
    iframe->>viewscreen: request template
    participant viewscreen
    viewscreen->>iframe: html & javascript
    iframe->>dotcom: iframe ready
    dotcom->>iframe: set mermaid data on iframe
    iframe->>iframe: render mermaid
```



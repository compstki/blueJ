# Instructions  
{: .no_toc }

<details closed markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. TOC
{:toc}
</details>

**`alphabetical elements`**
* Chemical elements are often written by using the relevant symbol which is one or two letters. 
* In most cases the symbol is the first letter of the name, for example `C` is for `Carbon` but there are some exceptions, for example `K` is for `Potassium`.
* The project file has an array with 26 values for each letter of the alphabet. However not every letter will be present because no element exists for that single letter. Those values will be "N/A".

---

```
"N/A", "Boron", "Carbon", "N/A", "N/A", "Fluorine", "N/A", "Hydrogen", "Iodine", "N/A", "Potassium", "N/A", "N/A", "Nitrogen", "Oxygen", "Phophorus", "N/A", "N/A", "Sulfur", "N/A", "Uranium", "Vanadium", "Tungsten", "N/A", "Yttrium", "N/A"
```

---

* In this program you should display the chemicals which use a single letter to make a simple alphabet of chemicals.

> You should already have completed an introductory task in using `charAt()` function

## Help and tips before you start


### `logic design`

Here is the design for the algorithm, only part of it is implemented in Java. You should edit the code to match the design.

---
```
loop with index for each element
    if element is not "N/A" 
        if element is "Potassium"
            display "K is for Potassium"
        else 
            if element is "Tungsten"
                display "W is for Tungsten"
            else 
                display 1st character "is for" element
            end if
        end if
    end if
end loop      
```

---


### `codeClip`
* remember to compare strings using the `.equals()` function
* do not use `=` or `==`

---

```java
// compare strings with .equal() instead of ==
if (programLanguage.equals("Java")) {
    System.out.println("use equals function!");
}
```

---

## Steps

0. The program will output this to begin with this output

---
```
N/A
Boron
Carbon
...
N/A
Yttrium
N/A
```
---


1. use the logic design and your knowledge of the `charAt` function to display this
> * you could leave out the conditional structures at this point

---
```
N is for N/A
B is for Boron
C is for Carbon
..
N is for N/A
Y is for Yttrium
N is for N/A
```
---

2. use the logic design to display as shown below
> * you should include the conditional structure to miss out the N/A rows

---
```
B is for Boron
C is for Carbon
F is for Fluorine
..
V is for Vanadium
T is for Tungsten
Y is for Yttrium
```
---

3. use logic design to complete the final version
> * include the full nested conditional structures in the design

---
```
B is for Boron
..
K is for Potassium
N is for Nitrogen
O is for Oxygen
P is for Phophorus
..
W is for Tungsten
Y is for Yttrium
```
---
  

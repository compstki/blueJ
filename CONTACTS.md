# Contacts

## about
This task assumes that you have already been introduced to:
* using parallel arrays
* using a loop to traverse an array and display element values
* using substring function to select a section of a substring
* using the length function to use the number of characters as part of a calculation for substring.

> There is some `PRIMM` code to guide you throught the steps in the task. 

> Try to work with a partner and _discuss_ your code _before_ typing and running the code.

> _Make sure your output is **correct** before moving from one stage to the next, ask your teacher if you need some assistance._

---

### `predict`

* read the `PRI` code.
* notice the data value `BD51 SMR` and the use of the substring and length functions.
* work with a partner an agree on what you think this code will output

### `run`

* run the code and check the output against what you predicted (`PRI` section only for now)

### `investigate`

* amend the parameter values for the first substring to display `51` instead of `BD`
* amend the parameter values for the second substring to display `SM` instead of `SMR`

> output of `PRI` code after investigating

```
8: 51-SM
```

---
### `modify`

* you will have seen that the loop already displays the names but not yet the phone number or postcode

* insert 2 lines of code within the loop (look for the `//` comment lines as a guide)
  * first display the entire postcode, 
  * second display the entire phone number

> output from loop after `modify` work

```
Edmonds     BS4_1SY     07507-304671
Sandoval        HD9_7NP     07574-522632
..
Bridges     M45_8GH     07746-842316
Blaese      BS16_4QX        07818-193588
```
---

### `make`

* amend the loop code to display the phone number as `+447507304671` rather than `07507-304671`
* notice that some postcodes _begin_ with **3** characters and others **4** and that they all _end_ with **4** characters eg `_1SY`
* amend the loop code to display the first part of the post code `BS4` rather than `BS4_1SY` and `TS22` rather than `TS22_5HA`


Make sure all postcodes and phone numbers display correctly

> sample output from `make`

```
Edmonds     BS4     +447507304671
Sandoval        HD9     +447574522632
..
Bridges     M45     +447746842316
Blaese      BS16        +447818193588
```

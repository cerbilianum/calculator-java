1. Software Metrics
   
Total LOC (excluding blank lines and comments): 148

Cyclomatic Complexity (tool: MetricsReloaded in InteliJIDEA):
evaluateExpression - 12
Calculate - 12

Cognitive Complexity (tool: MetricsReloaded in InteliJIDEA):
evaluateExpression - 14
Calculate - 23

2. Informal Code Review:
Start.java – linia 6 – variabila Expression nu respecta conventia Java pentru denumirea variabilelor; ar trebui numită expression (camelCase)
Calculator.java – linia 18 – metoda ToString nu respecta conventia Java pentru denumirea metodelor; ar trebui numită toString (camelCase)
Calculator.java – linia 24 – metoda Run nu respecta conventia Java pentru denumirea metodelor; ar trebui numită run (camelCase)
Calculator.java – linia 74 – metoda Calculate nu respecta conventia Java pentru denumirea metodelor; ar trebui numită calculate (camelCase)
Calculator.java – linia 64 – blocul catch returnează doar "ERROR" fără a oferi informații despre cauza erorii.

3.Static Code Analysis (tool: SonarCube in InteliJIDEA):
Calculator.java – linia 183 - Jump statements should not be redundant / Jump statements such as return and continue let you change the default flow of program execution, but jump statements that direct the control flow to the original direction are just a waste of keystrokes
Calculator.java – linia 63 - Unused exception parameter should use the unnamed variable pattern / Java 22 introduces the unnamed variable pattern _ which allows developers to free the catch clause from an unnecessary exception parameter name.
Calculator.java – linia 71 – Local variables should not be declared and then immediately returned or thrown / Declaring a variable only to immediately return or throw it is considered a bad practice because it adds unnecessary complexity to the code.


   

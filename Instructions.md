1. Run this code to ensure it does what you expect
2. Change `day` from **public** to **private**
   Does the code still run? Why not?
3. Create a new method `setDay(int day)`. This method should check to ensure 0 < day < 32
   Modify `main()` to use this method rather than setting day directly. Does this fix the code?
4. Create a new method `getDay()` that returns the value of day. Update main to use `getDay()` in the 
   output line.
# W3D2Test

This is the Research part of the test:

1- 
  Garbage Collection: ART has better garbage collection than Dalvik.
  Approach: ART uses AOT(Ahead Of Time) approach and compiles the whole code during the installation time but the Dalvik uses JIT(Just In Time) approach and complies only a part of the code during installation and the rest of the code will be compiled dynamically.
  Booting time: As compare to Dalvik, ART takes more time to reboot because the cache is built at the first time. So, the booting is slow.
  Space: Since ART uses the AOT approach, so it needs more space during installation. While Dalvik uses the JIT approach, so for mobile phones having less storage can use the Dalvik.
  Battery: ART increases battery performance to a large extent because of the AOT approach. While the Dalvik uses the JIT approach and this results in more battery utilization.
  
2-  Dex Limit is the max number of methods (references) (65,536) an app can have, so if the number of references exceeds 65,536, you go with multidex.

3- Launch mode is an instruction for Android OS which specifies how the activity should be launched. It instructs how any new activity should be associated with the current task.

4- The form factor of a mobile phone is its size, shape, and style, as well as the layout and position of its major components.

5- Layout qualifiers are the “refining” traits of your layout. You can have a screen size qualifier such as width and height, and you can even add orientation qualifiers such as landscape mode for a better user experience.

---------------------------------------------------------------------------------------------------------------------------

1) Here I used a pretty straight forward method to find the duplicated;
  - I pass in the list of strings to my findDuplicates() method
  - I instantiate a Hashmap and iterate over the ArrayList while attempting to create a new key/value pair with the strings
  - if the key (string) already exists ('containsKey()') then I simply print it out.
  
2) set i=0 and j=str.length() and do a check to see if char(i)!=char(j) at any moment:
   - if so, set isPalindrome to FALSE and print it.
   
3) just a straight-forward modulus check for each of the conditions and printing out the corresponding text here.



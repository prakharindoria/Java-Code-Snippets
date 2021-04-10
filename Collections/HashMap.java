//HashMap In Java
/*
// Import the HashMap class
import java.util.HashMap;

	// First Example
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    	capitalCities.put("England", "London");
    	capitalCities.put("Germany", "Berlin");
    	capitalCities.put("Norway", "Oslo");
    	capitalCities.put("USA", "Washington DC");
    	System.out.println(capitalCities);

	//Second Example
	// Create a HashMap object called stGrade
	Map<String, Integer> stGrade = new HashMap<String, Integer>(); 

	// Insert elements 
       	stGrade.put("aaron", new Integer(90)); 
       	stGrade.put("isaac", new Integer(100)); 
       	stGrade.put("john", new Integer(35)); 
       	stGrade.put("mohammad", new Integer(100)); 

	// Get value
	   	stGrade.get("mohammad"); 	// returns 100
		stGrade.get("aaron"); 		// returns 90
		stGrade.get("john");	 	// returns 35
		stGrade.get("isaac"); 		// returns 100
    
    */

/*
import java.util.HashMap; // import the HashMap class

// instantiate a HashMap instance
HashMap<String, String> capitalCities = new HashMap<String, String>();

// SCROLL DOWN FOR LIST OF ALL METHODS --------------------------------------
// to use any methods below add the function name to the instance name
// General Form: HashMapInstanceName.{functionName}({parameter list});
// Specific Example Using the Put Method: 
capitalCities.put("California", "Sacramento");

// SCROLL DOWN FOR LIST OF ALL METHODS --------------------------------------

1. void	clear() 
  	- Removes all of the mappings from this map.

2. Object clone() 
    - Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.

3. boolean	containsKey(Object key)
	- Returns true if this map contains a mapping for the specified key.

4. boolean	containsValue(Object value)
	- Returns true if this map maps one or more keys to the specified value.

5. V	get(Object key)
	- Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.

6. V	getOrDefault(Object key, V defaultValue)
	- Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.

7. boolean	isEmpty()
	- Returns true if this map contains no key-value mappings.

8. Set<K>	keySet()
	- Returns a Set view of the keys contained in this map.
      
9. V	put(K key, V value)
	- Associates the specified value with the specified key in this map.
 
10. V	remove(Object key)
	- Removes the mapping for the specified key from this map if present.
      
11. boolean	remove(Object key, Object value)
	- Removes the entry for the specified key only if it is currently mapped to the specified value.

12. V	replace(K key, V value)
	- Replaces the entry for the specified key only if it is currently mapped to some value.

13. boolean	replace(K key, V oldValue, V newValue)
	- Replaces the entry for the specified key only if currently mapped to the specified value.

14. int	size()
	- Returns the number of key-value mappings in this map.
      
15. Collection<V>	values()
	- Returns a Collection view of the values contained in this map.
*/

public static void func(String s1)
{
	    HashMap<Character,Integer> hm=new HashMap<>();
	    char[] arr=s1.toCharArray();
	    for(char ch:arr)
      {
	        if(!hm.containsKey(ch))hm.put(ch,1);
	        else hm.replace(ch,hm.get(ch),hm.get(ch)+1);
	    }
	    System.out.println(hm);
}

/**
 * 
 */
/**
 * 
 */
module com.library {
	
	requires junit ;
	exports com.library.example;
	exports library;
    exports test; // Ensure this line is present if the 'test' package exists
}
// This program is copyright VUW.
// You are granted permission by VUW to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC Assignment Cartoon Strip
 * Name: Lara Oberlaender
 * Username:
 * Email:
 */

import ecs100.*;
                    
/** Program to create simple animated cartoon strips using the
*  CartoonCharacter class.  
*/
                    
 public class CartoonStrip{
                                                        
                    /** tellStory creates two cartoon characters on the window.
                     *  Then animates them according to a fixed script by calling a series
                     *  of methods on the characters.
                     */
                    public void tellStory(){
                        CartoonCharacter alice = new CartoonCharacter(100, 100, "alice");
                        CartoonCharacter casey = new CartoonCharacter (700,100, "casey");
                        
                        casey.lookLeft();
                        casey.walk(300);                          
                        casey.speak("Excuse me?! Can you tell me how much the iPhone costs, please?");
                        alice.speak("5 rolls toilet paper and 3 packets of pasta.");
                        casey.speak("Okay thanks I will think about it.");
                        
                        
                            }
                        
                                     
               }
            
            
            



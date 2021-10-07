/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ChallengeFive;
import ChallengeFive.data.LinkedListNode;
import ChallengeFive.stucture.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest {
      @Test void appHasAGreeting() {

        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert("E");
        classUnderTest.insert("N");
        classUnderTest.insert("G");
        classUnderTest.insert("N");
        classUnderTest.insert("A");
        classUnderTest.insert("I");
        classUnderTest.insert("M.");
        assertEquals(" { E }  -------->  { N }  -------->  { G }  -------->  { N }  -------->  { A }  -------->  { I }  -------->  { M. }  -------->  NULL ", classUnderTest.toString());
        assertTrue(classUnderTest.include("E"));
      }
}

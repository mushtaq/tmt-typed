package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text, Comment, or ProcessingInstruction which aren't abstract. */
@js.native
trait CharacterData
  extends StObject
     with ChildNode
     with NonDocumentTypeChildNode {
  
  /* standard DOM */
  def appendData(data: java.lang.String): Unit = js.native
  
  /* standard DOM */
  var data: java.lang.String = js.native
  
  /* standard DOM */
  def deleteData(offset: Double, count: Double): Unit = js.native
  
  /* standard DOM */
  def insertData(offset: Double, data: java.lang.String): Unit = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  @JSName("ownerDocument")
  val ownerDocument_CharacterData: org.scalajs.dom.Document = js.native
  
  /* standard DOM */
  def replaceData(offset: Double, count: Double, data: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def substringData(offset: Double, count: Double): java.lang.String = js.native
}

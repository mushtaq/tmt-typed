package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEvent
  extends StObject
     with UIEvent {
  
  /* standard DOM */
  val data: java.lang.String | Null = js.native
  
  /* standard DOM */
  val dataTransfer: org.scalajs.dom.DataTransfer | Null = js.native
  
  /* standard DOM */
  def getTargetRanges(): js.Array[StaticRange] = js.native
  
  /* standard DOM */
  val inputType: java.lang.String = js.native
  
  /* standard DOM */
  val isComposing: scala.Boolean = js.native
}

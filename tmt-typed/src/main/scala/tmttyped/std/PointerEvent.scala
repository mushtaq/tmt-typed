package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc. */
@js.native
trait PointerEvent
  extends StObject
     with MouseEvent {
  
  /** Available only in secure contexts. */
  /* standard DOM */
  def getCoalescedEvents(): js.Array[org.scalajs.dom.PointerEvent] = js.native
  
  /* standard DOM */
  def getPredictedEvents(): js.Array[org.scalajs.dom.PointerEvent] = js.native
  
  /* standard DOM */
  val height: Double = js.native
  
  /* standard DOM */
  val isPrimary: scala.Boolean = js.native
  
  /* standard DOM */
  val pointerId: Double = js.native
  
  /* standard DOM */
  val pointerType: java.lang.String = js.native
  
  /* standard DOM */
  val pressure: Double = js.native
  
  /* standard DOM */
  val tangentialPressure: Double = js.native
  
  /* standard DOM */
  val tiltX: Double = js.native
  
  /* standard DOM */
  val tiltY: Double = js.native
  
  /* standard DOM */
  val twist: Double = js.native
  
  /* standard DOM */
  val width: Double = js.native
}

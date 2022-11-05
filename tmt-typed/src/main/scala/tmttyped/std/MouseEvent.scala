package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events that occur due to the user interacting with a pointing device (such as a mouse). Common events using this interface include click, dblclick, mouseup, mousedown. */
@js.native
trait MouseEvent
  extends StObject
     with UIEvent {
  
  /* standard DOM */
  val altKey: scala.Boolean = js.native
  
  /* standard DOM */
  val button: Double = js.native
  
  /* standard DOM */
  val buttons: Double = js.native
  
  /* standard DOM */
  val clientX: Double = js.native
  
  /* standard DOM */
  val clientY: Double = js.native
  
  /* standard DOM */
  val ctrlKey: scala.Boolean = js.native
  
  /* standard DOM */
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  
  /** @deprecated */
  /* standard DOM */
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: org.scalajs.dom.Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double
  ): Unit = js.native
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: org.scalajs.dom.Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: org.scalajs.dom.EventTarget
  ): Unit = js.native
  
  /* standard DOM */
  val metaKey: scala.Boolean = js.native
  
  /* standard DOM */
  val movementX: Double = js.native
  
  /* standard DOM */
  val movementY: Double = js.native
  
  /* standard DOM */
  val offsetX: Double = js.native
  
  /* standard DOM */
  val offsetY: Double = js.native
  
  /* standard DOM */
  val pageX: Double = js.native
  
  /* standard DOM */
  val pageY: Double = js.native
  
  /* standard DOM */
  val relatedTarget: org.scalajs.dom.EventTarget | Null = js.native
  
  /* standard DOM */
  val screenX: Double = js.native
  
  /* standard DOM */
  val screenY: Double = js.native
  
  /* standard DOM */
  val shiftKey: scala.Boolean = js.native
  
  /* standard DOM */
  val x: Double = js.native
  
  /* standard DOM */
  val y: Double = js.native
}

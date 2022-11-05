package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard. */
@js.native
trait KeyboardEvent
  extends StObject
     with UIEvent {
  
  /* standard DOM */
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  
  /* standard DOM */
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  
  /* standard DOM */
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  
  /* standard DOM */
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
  
  /* standard DOM */
  val altKey: scala.Boolean = js.native
  
  /** @deprecated */
  /* standard DOM */
  val charCode: Double = js.native
  
  /* standard DOM */
  val code: java.lang.String = js.native
  
  /* standard DOM */
  val ctrlKey: scala.Boolean = js.native
  
  /* standard DOM */
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  
  /** @deprecated */
  /* standard DOM */
  def initKeyboardEvent(
    typeArg: java.lang.String,
    bubblesArg: js.UndefOr[scala.Boolean],
    cancelableArg: js.UndefOr[scala.Boolean],
    viewArg: js.UndefOr[org.scalajs.dom.Window | Null],
    keyArg: js.UndefOr[java.lang.String],
    locationArg: js.UndefOr[Double],
    ctrlKey: js.UndefOr[scala.Boolean],
    altKey: js.UndefOr[scala.Boolean],
    shiftKey: js.UndefOr[scala.Boolean],
    metaKey: js.UndefOr[scala.Boolean]
  ): Unit = js.native
  
  /* standard DOM */
  val isComposing: scala.Boolean = js.native
  
  /* standard DOM */
  val key: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  val keyCode: Double = js.native
  
  /* standard DOM */
  val location: Double = js.native
  
  /* standard DOM */
  val metaKey: scala.Boolean = js.native
  
  /* standard DOM */
  val repeat: scala.Boolean = js.native
  
  /* standard DOM */
  val shiftKey: scala.Boolean = js.native
}

package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bubbles extends StObject {
  
  /** This is not used in Node.js and is provided purely for completeness. */
  val bubbles: Boolean
  
  /** Alias for event.stopPropagation(). This is not used in Node.js and is provided purely for completeness. */
  def cancelBubble(): Unit
  
  /** True if the event was created with the cancelable option */
  val cancelable: Boolean
  
  /** This is not used in Node.js and is provided purely for completeness. */
  val composed: Boolean
  
  /** Returns an array containing the current EventTarget as the only entry or empty if the event is not being dispatched. This is not used in Node.js and is provided purely for completeness. */
  def composedPath(): js.Array[js.UndefOr[org.scalajs.dom.EventTarget]]
  
  /** Alias for event.target. */
  val currentTarget: org.scalajs.dom.EventTarget | Null
  
  /** Is true if cancelable is true and event.preventDefault() has been called. */
  val defaultPrevented: Boolean
  
  /** This is not used in Node.js and is provided purely for completeness. */
  val eventPhase: tmttyped.node.nodeNumbers.`0` | tmttyped.node.nodeNumbers.`2`
  
  /** The `AbortSignal` "abort" event is emitted with `isTrusted` set to `true`. The value is `false` in all other cases. */
  val isTrusted: Boolean
  
  /** Sets the `defaultPrevented` property to `true` if `cancelable` is `true`. */
  def preventDefault(): Unit
  
  /** This is not used in Node.js and is provided purely for completeness. */
  var returnValue: Boolean
  
  /** Alias for event.target. */
  val srcElement: org.scalajs.dom.EventTarget | Null
  
  /** Stops the invocation of event listeners after the current one completes. */
  def stopImmediatePropagation(): Unit
  
  /** This is not used in Node.js and is provided purely for completeness. */
  def stopPropagation(): Unit
  
  /** The `EventTarget` dispatching the event */
  val target: org.scalajs.dom.EventTarget | Null
  
  /** The millisecond timestamp when the Event object was created. */
  val timeStamp: Double
  
  /** Returns the type of event, e.g. "click", "hashchange", or "submit". */
  val `type`: String
}
object Bubbles {
  
  inline def apply(
    bubbles: Boolean,
    cancelBubble: () => Unit,
    cancelable: Boolean,
    composed: Boolean,
    composedPath: () => js.Array[js.UndefOr[org.scalajs.dom.EventTarget]],
    defaultPrevented: Boolean,
    eventPhase: tmttyped.node.nodeNumbers.`0` | tmttyped.node.nodeNumbers.`2`,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    returnValue: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String
  ): Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = js.Any.fromFunction0(cancelBubble), cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], currentTarget = null, srcElement = null, target = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bubbles]
  }
  
  extension [Self <: Bubbles](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: () => Unit): Self = StObject.set(x, "cancelBubble", js.Any.fromFunction0(value))
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: () => js.Array[js.UndefOr[org.scalajs.dom.EventTarget]]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    inline def setCurrentTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: tmttyped.node.nodeNumbers.`0` | tmttyped.node.nodeNumbers.`2`): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

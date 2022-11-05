package tmttyped.node.anon

import tmttyped.node.domEventsMod.AddEventListenerOptions
import tmttyped.node.domEventsMod.EventListener
import tmttyped.node.domEventsMod.EventListenerObject
import tmttyped.node.domEventsMod.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEventListener extends StObject {
  
  /**
    * Adds a new handler for the `type` event. Any given `listener` is added only once per `type` and per `capture` option value.
    *
    * If the `once` option is true, the `listener` is removed after the next time a `type` event is dispatched.
    *
    * The `capture` option is not used by Node.js in any functional way other than tracking registered event listeners per the `EventTarget` specification.
    * Specifically, the `capture` option is used as part of the key when registering a `listener`.
    * Any individual `listener` may be added once with `capture = false`, and once with `capture = true`.
    */
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, options: AddEventListenerOptions): Unit = js.native
  
  /** Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise. */
  def dispatchEvent(event: org.scalajs.dom.Event): Boolean = js.native
  
  /** Removes the event listener in target's event listener list with the same type, callback, and options. */
  def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerObject): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerObject, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerObject, options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener, options: EventListenerOptions): Unit = js.native
}

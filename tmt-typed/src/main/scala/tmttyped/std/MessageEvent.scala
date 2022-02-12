package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A message received by a target object. */
@js.native
trait MessageEvent[T]
  extends StObject
     with Event {
  
  /** Returns the data of the message. */
  /* standard DOM */
  val data: T = js.native
  
  /** @deprecated */
  /* standard DOM.Iterable */
  /* standard DOM */
  def initMessageEvent(
    `type`: java.lang.String,
    bubbles: js.UndefOr[scala.Boolean],
    cancelable: js.UndefOr[scala.Boolean],
    data: js.UndefOr[Any],
    origin: js.UndefOr[java.lang.String],
    lastEventId: js.UndefOr[java.lang.String],
    source: js.UndefOr[MessageEventSource | Null],
    ports: js.UndefOr[js.Array[org.scalajs.dom.MessagePort] | js.Iterable[org.scalajs.dom.MessagePort]]
  ): Unit = js.native
  
  /** Returns the last event ID string, for server-sent events. */
  /* standard DOM */
  val lastEventId: java.lang.String = js.native
  
  /** Returns the origin of the message, for server-sent events and cross-document messaging. */
  /* standard DOM */
  val origin: java.lang.String = js.native
  
  /** Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging. */
  /* standard DOM */
  val ports: js.Array[org.scalajs.dom.MessagePort] = js.native
  
  /** Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects. */
  /* standard DOM */
  val source: MessageEventSource | Null = js.native
}

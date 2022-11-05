package tmttyped.std.global

import tmttyped.std.EventSourceInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EventSource")
@js.native
open class EventSource protected ()
  extends StObject
     with tmttyped.std.EventSource {
  /* standard DOM */
  def this(url: java.lang.String) = this()
  def this(url: org.scalajs.dom.URL) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
  def this(url: org.scalajs.dom.URL, eventSourceInitDict: EventSourceInit) = this()
}
object EventSource {
  
  /* standard DOM */
  @JSGlobal("EventSource.CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  /* standard DOM */
  @JSGlobal("EventSource.CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  /* standard DOM */
  @JSGlobal("EventSource.OPEN")
  @js.native
  val OPEN: Double = js.native
}

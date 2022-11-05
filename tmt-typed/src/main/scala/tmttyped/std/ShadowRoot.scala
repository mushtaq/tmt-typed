package tmttyped.std

import tmttyped.std.stdStrings.slotchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowRoot
  extends StObject
     with DocumentFragment
     with DocumentOrShadowRoot
     with InnerHTML {
  
  /** Throws a "NotSupportedError" DOMException if context object is a shadow root. */
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  val delegatesFocus: scala.Boolean = js.native
  
  /* standard DOM */
  val host: org.scalajs.dom.Element = js.native
  
  /* standard DOM */
  val mode: ShadowRootMode = js.native
  
  /* standard DOM */
  var onslotchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  val slotAssignment: SlotAssignmentMode = js.native
}

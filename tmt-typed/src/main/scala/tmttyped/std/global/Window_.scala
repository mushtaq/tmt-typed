package tmttyped.std.global

import org.scalajs.dom.EventListenerOptions
import tmttyped.std.AddEventListenerOptions
import tmttyped.std.EventListenerOrEventListenerObject
import tmttyped.std.FrameRequestCallback
import tmttyped.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Window")
@js.native
/* standard DOM */
open class Window_ ()
  extends StObject
     with Window {
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val localStorage: org.scalajs.dom.Storage = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val sessionStorage: org.scalajs.dom.Storage = js.native
}

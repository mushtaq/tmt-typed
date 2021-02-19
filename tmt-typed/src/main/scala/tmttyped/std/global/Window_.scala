package tmttyped.std.global

import tmttyped.std.FrameRequestCallback
import tmttyped.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Window")
@js.native
class Window_ () extends Window {
  
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /* CompleteClass */
  override val localStorage: org.scalajs.dom.raw.Storage = js.native
  
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  /* CompleteClass */
  override val sessionStorage: org.scalajs.dom.raw.Storage = js.native
}

package tmttyped.std.global

import tmttyped.std.IntersectionObserverEntryInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserverEntry")
@js.native
class IntersectionObserverEntry protected ()
  extends StObject
     with tmttyped.std.IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  
  /* CompleteClass */
  override val boundingClientRect: tmttyped.std.DOMRectReadOnly = js.native
  
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  
  /* CompleteClass */
  override val intersectionRect: tmttyped.std.DOMRectReadOnly = js.native
  
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  
  /* CompleteClass */
  override val rootBounds: tmttyped.std.DOMRectReadOnly | Null = js.native
  
  /* CompleteClass */
  override val target: org.scalajs.dom.raw.Element = js.native
  
  /* CompleteClass */
  override val time: Double = js.native
}

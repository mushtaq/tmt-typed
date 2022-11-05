package tmttyped.std.global

import tmttyped.std.DOMHighResTimeStamp
import tmttyped.std.IntersectionObserverEntryInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserverEntry")
@js.native
open class IntersectionObserverEntry protected ()
  extends StObject
     with tmttyped.std.IntersectionObserverEntry {
  /* standard DOM */
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override val boundingClientRect: tmttyped.std.DOMRectReadOnly = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val intersectionRect: tmttyped.std.DOMRectReadOnly = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val rootBounds: tmttyped.std.DOMRectReadOnly | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val target: org.scalajs.dom.Element = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val time: DOMHighResTimeStamp = js.native
}

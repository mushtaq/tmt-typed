package tmttyped.std.global

import org.scalajs.dom.Document
import tmttyped.std.IntersectionObserverCallback
import tmttyped.std.IntersectionObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserver")
@js.native
open class IntersectionObserver protected ()
  extends StObject
     with tmttyped.std.IntersectionObserver {
  /* standard DOM */
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def observe(target: org.scalajs.dom.Element): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val root: org.scalajs.dom.Element | Document | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def takeRecords(): js.Array[tmttyped.std.IntersectionObserverEntry] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def unobserve(target: org.scalajs.dom.Element): Unit = js.native
}

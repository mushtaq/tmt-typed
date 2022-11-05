package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserver extends StObject {
  
  /* standard DOM */
  def disconnect(): Unit = js.native
  
  /* standard DOM */
  def observe(target: org.scalajs.dom.Element): Unit = js.native
  def observe(target: org.scalajs.dom.Element, options: ResizeObserverOptions): Unit = js.native
  
  /* standard DOM */
  def unobserve(target: org.scalajs.dom.Element): Unit = js.native
}

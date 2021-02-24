package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserver extends StObject {
  
  def disconnect(): Unit = js.native
  
  def observe(target: org.scalajs.dom.raw.Element): Unit = js.native
  def observe(target: org.scalajs.dom.raw.Element, options: ResizeObserverOptions): Unit = js.native
  
  def unobserve(target: org.scalajs.dom.raw.Element): Unit = js.native
}

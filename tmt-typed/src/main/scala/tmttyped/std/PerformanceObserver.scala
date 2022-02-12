package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserver extends StObject {
  
  /* standard DOM */
  def disconnect(): Unit = js.native
  
  /* standard DOM */
  def observe(): Unit = js.native
  def observe(options: PerformanceObserverInit): Unit = js.native
  
  /* standard DOM */
  def takeRecords(): PerformanceEntryList = js.native
}

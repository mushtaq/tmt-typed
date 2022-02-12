package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserverEntryList extends StObject {
  
  /* standard DOM */
  def getEntries(): PerformanceEntryList = js.native
  
  /* standard DOM */
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  
  /* standard DOM */
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
}

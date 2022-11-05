package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page.
  * Available only in secure contexts.
  */
@js.native
trait DeviceOrientationEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val absolute: scala.Boolean = js.native
  
  /* standard DOM */
  val alpha: Double | Null = js.native
  
  /* standard DOM */
  val beta: Double | Null = js.native
  
  /* standard DOM */
  val gamma: Double | Null = js.native
}

package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to transitions. */
@js.native
trait TransitionEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val elapsedTime: Double = js.native
  
  /* standard DOM */
  val propertyName: java.lang.String = js.native
  
  /* standard DOM */
  val pseudoElement: java.lang.String = js.native
}

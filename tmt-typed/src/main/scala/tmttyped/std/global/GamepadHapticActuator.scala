package tmttyped.std.global

import tmttyped.std.GamepadHapticActuatorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("GamepadHapticActuator")
@js.native
class GamepadHapticActuator ()
  extends tmttyped.std.GamepadHapticActuator {
  
  /* CompleteClass */
  override def pulse(value: Double, duration: Double): js.Promise[scala.Boolean] = js.native
  
  /* CompleteClass */
  override val `type`: GamepadHapticActuatorType = js.native
}

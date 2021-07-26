package tmttyped.std.global

import org.scalajs.dom.experimental.gamepad.GamepadMappingType
import tmttyped.std.GamepadHand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
class Gamepad ()
  extends StObject
     with tmttyped.std.Gamepad {
  
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  
  /* CompleteClass */
  override val buttons: js.Array[org.scalajs.dom.experimental.gamepad.GamepadButton] = js.native
  
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  
  /* CompleteClass */
  override val hapticActuators: js.Array[tmttyped.std.GamepadHapticActuator] = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val index: Double = js.native
  
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /* CompleteClass */
  override val pose: tmttyped.std.GamepadPose | Null = js.native
  
  /* CompleteClass */
  override val timestamp: Double = js.native
}

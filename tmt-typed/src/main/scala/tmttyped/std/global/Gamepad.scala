package tmttyped.std.global

import org.scalajs.dom.GamepadMappingType
import tmttyped.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
/* standard DOM */
open class Gamepad ()
  extends StObject
     with tmttyped.std.Gamepad {
  
  /* standard DOM */
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val buttons: js.Array[org.scalajs.dom.GamepadButton] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val hapticActuators: js.Array[tmttyped.std.GamepadHapticActuator] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val index: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val timestamp: DOMHighResTimeStamp = js.native
}

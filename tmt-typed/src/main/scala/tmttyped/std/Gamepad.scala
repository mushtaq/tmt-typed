package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
  * Available only in secure contexts.
  */
trait Gamepad extends StObject {
  
  /* standard DOM */
  val axes: js.Array[Double]
  
  /* standard DOM */
  val buttons: js.Array[org.scalajs.dom.GamepadButton]
  
  /* standard DOM */
  val connected: scala.Boolean
  
  /* standard DOM */
  val hapticActuators: js.Array[GamepadHapticActuator]
  
  /* standard DOM */
  val id: java.lang.String
  
  /* standard DOM */
  val index: Double
  
  /* standard DOM */
  val mapping: org.scalajs.dom.GamepadMappingType
  
  /* standard DOM */
  val timestamp: DOMHighResTimeStamp
}
object Gamepad {
  
  @scala.inline
  def apply(
    axes: js.Array[Double],
    buttons: js.Array[org.scalajs.dom.GamepadButton],
    connected: scala.Boolean,
    hapticActuators: js.Array[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: org.scalajs.dom.GamepadMappingType,
    timestamp: DOMHighResTimeStamp
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit class GamepadMutableBuilder[Self <: Gamepad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[org.scalajs.dom.GamepadButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: org.scalajs.dom.GamepadButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setConnected(value: scala.Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuators(value: js.Array[GamepadHapticActuator]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuatorsVarargs(value: GamepadHapticActuator*): Self = StObject.set(x, "hapticActuators", js.Array(value :_*))
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: org.scalajs.dom.GamepadMappingType): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

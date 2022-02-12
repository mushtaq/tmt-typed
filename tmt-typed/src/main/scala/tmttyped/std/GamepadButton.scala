package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
  * Available only in secure contexts.
  */
trait GamepadButton extends StObject {
  
  /* standard DOM */
  val pressed: scala.Boolean
  
  /* standard DOM */
  val touched: scala.Boolean
  
  /* standard DOM */
  val value: Double
}
object GamepadButton {
  
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: Double): GamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButton]
  }
  
  @scala.inline
  implicit class GamepadButtonMutableBuilder[Self <: GamepadButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPressed(value: scala.Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouched(value: scala.Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

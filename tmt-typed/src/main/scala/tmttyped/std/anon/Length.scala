package tmttyped.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  /* standard ScriptHost */
  def Item(n: Double): String
  
  /* standard ScriptHost */
  var length: Double
}
object Length {
  
  inline def apply(Item: Double => String, length: Double): Length = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setItem(value: Double => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

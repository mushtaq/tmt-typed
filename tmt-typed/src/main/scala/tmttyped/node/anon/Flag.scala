package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flag extends StObject {
  
  var encoding: js.UndefOr[Null] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
}
object Flag {
  
  inline def apply(): Flag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flag]
  }
  
  extension [Self <: Flag](x: Self) {
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}

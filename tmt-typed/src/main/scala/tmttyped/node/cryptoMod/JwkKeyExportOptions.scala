package tmttyped.node.cryptoMod

import tmttyped.node.nodeStrings.jwk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JwkKeyExportOptions extends StObject {
  
  var format: jwk
}
object JwkKeyExportOptions {
  
  @scala.inline
  def apply(): JwkKeyExportOptions = {
    val __obj = js.Dynamic.literal(format = "jwk")
    __obj.asInstanceOf[JwkKeyExportOptions]
  }
  
  @scala.inline
  implicit class JwkKeyExportOptionsMutableBuilder[Self <: JwkKeyExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: jwk): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}

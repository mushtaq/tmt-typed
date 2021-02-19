package tmttyped.node.http2Mod

import tmttyped.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativeServiceOptions extends StObject {
  
  var origin: Double | String | URL
}
object AlternativeServiceOptions {
  
  @scala.inline
  def apply(origin: Double | String | URL): AlternativeServiceOptions = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeServiceOptions]
  }
  
  @scala.inline
  implicit class AlternativeServiceOptionsMutableBuilder[Self <: AlternativeServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: Double | String | URL): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}

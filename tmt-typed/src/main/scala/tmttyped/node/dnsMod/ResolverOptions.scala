package tmttyped.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ResolverOptions {
  
  @scala.inline
  def apply(): ResolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverOptions]
  }
  
  @scala.inline
  implicit class ResolverOptionsMutableBuilder[Self <: ResolverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

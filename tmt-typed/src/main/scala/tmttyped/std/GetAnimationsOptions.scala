package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnimationsOptions extends StObject {
  
  /* standard DOM */
  var subtree: js.UndefOr[scala.Boolean] = js.undefined
}
object GetAnimationsOptions {
  
  @scala.inline
  def apply(): GetAnimationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnimationsOptions]
  }
  
  @scala.inline
  implicit class GetAnimationsOptionsMutableBuilder[Self <: GetAnimationsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtree(value: scala.Boolean): Self = StObject.set(x, "subtree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtreeUndefined: Self = StObject.set(x, "subtree", js.undefined)
  }
}

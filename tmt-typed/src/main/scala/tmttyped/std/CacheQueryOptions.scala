package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheQueryOptions extends StObject {
  
  /* standard DOM */
  var ignoreMethod: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var ignoreVary: js.UndefOr[scala.Boolean] = js.undefined
}
object CacheQueryOptions {
  
  @scala.inline
  def apply(): CacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheQueryOptions]
  }
  
  @scala.inline
  implicit class CacheQueryOptionsMutableBuilder[Self <: CacheQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreMethod(value: scala.Boolean): Self = StObject.set(x, "ignoreMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreMethodUndefined: Self = StObject.set(x, "ignoreMethod", js.undefined)
    
    @scala.inline
    def setIgnoreSearch(value: scala.Boolean): Self = StObject.set(x, "ignoreSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSearchUndefined: Self = StObject.set(x, "ignoreSearch", js.undefined)
    
    @scala.inline
    def setIgnoreVary(value: scala.Boolean): Self = StObject.set(x, "ignoreVary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreVaryUndefined: Self = StObject.set(x, "ignoreVary", js.undefined)
  }
}

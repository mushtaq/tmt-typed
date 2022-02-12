package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBIndexParameters extends StObject {
  
  /* standard DOM */
  var multiEntry: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}
object IDBIndexParameters {
  
  @scala.inline
  def apply(): IDBIndexParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBIndexParameters]
  }
  
  @scala.inline
  implicit class IDBIndexParametersMutableBuilder[Self <: IDBIndexParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiEntry(value: scala.Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiEntryUndefined: Self = StObject.set(x, "multiEntry", js.undefined)
    
    @scala.inline
    def setUnique(value: scala.Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}

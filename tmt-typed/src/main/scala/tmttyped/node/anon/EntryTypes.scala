package tmttyped.node.anon

import tmttyped.node.perfHooksMod.EntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryTypes extends StObject {
  
  var entryTypes: js.Array[EntryType]
}
object EntryTypes {
  
  @scala.inline
  def apply(entryTypes: js.Array[EntryType]): EntryTypes = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryTypes]
  }
  
  @scala.inline
  implicit class EntryTypesMutableBuilder[Self <: EntryTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryTypes(value: js.Array[EntryType]): Self = StObject.set(x, "entryTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryTypesVarargs(value: EntryType*): Self = StObject.set(x, "entryTypes", js.Array(value :_*))
  }
}

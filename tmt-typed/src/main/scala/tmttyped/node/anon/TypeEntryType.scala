package tmttyped.node.anon

import tmttyped.node.perfHooksMod.EntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeEntryType extends StObject {
  
  var `type`: EntryType
}
object TypeEntryType {
  
  @scala.inline
  def apply(`type`: EntryType): TypeEntryType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEntryType]
  }
  
  @scala.inline
  implicit class TypeEntryTypeMutableBuilder[Self <: TypeEntryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

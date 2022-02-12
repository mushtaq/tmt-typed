package tmttyped.node.anon

import tmttyped.node.perfHooksMod.EntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffered extends StObject {
  
  var buffered: js.UndefOr[Boolean] = js.undefined
  
  var entryTypes: js.Array[EntryType]
}
object Buffered {
  
  @scala.inline
  def apply(entryTypes: js.Array[EntryType]): Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
  
  @scala.inline
  implicit class BufferedMutableBuilder[Self <: Buffered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    @scala.inline
    def setEntryTypes(value: js.Array[EntryType]): Self = StObject.set(x, "entryTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryTypesVarargs(value: EntryType*): Self = StObject.set(x, "entryTypes", js.Array(value :_*))
  }
}

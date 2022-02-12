package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemFlags extends StObject {
  
  /* standard DOM */
  var create: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
}
object FileSystemFlags {
  
  @scala.inline
  def apply(): FileSystemFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemFlags]
  }
  
  @scala.inline
  implicit class FileSystemFlagsMutableBuilder[Self <: FileSystemFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: scala.Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setExclusive(value: scala.Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}

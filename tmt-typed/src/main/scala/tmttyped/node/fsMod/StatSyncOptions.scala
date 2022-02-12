package tmttyped.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatSyncOptions
  extends StObject
     with StatOptions {
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatSyncOptions {
  
  @scala.inline
  def apply(): StatSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatSyncOptions]
  }
  
  @scala.inline
  implicit class StatSyncOptionsMutableBuilder[Self <: StatSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

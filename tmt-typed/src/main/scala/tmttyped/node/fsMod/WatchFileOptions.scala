package tmttyped.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchFileOptions extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object WatchFileOptions {
  
  @scala.inline
  def apply(): WatchFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchFileOptions]
  }
  
  @scala.inline
  implicit class WatchFileOptionsMutableBuilder[Self <: WatchFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}

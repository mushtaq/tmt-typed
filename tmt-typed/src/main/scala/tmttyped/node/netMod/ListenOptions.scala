package tmttyped.node.netMod

import tmttyped.node.eventsMod.Abortable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenOptions
  extends StObject
     with Abortable {
  
  var backlog: js.UndefOr[Double] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var readableAll: js.UndefOr[Boolean] = js.undefined
  
  var writableAll: js.UndefOr[Boolean] = js.undefined
}
object ListenOptions {
  
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  
  @scala.inline
  implicit class ListenOptionsMutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIpv6Only(value: Boolean): Self = StObject.set(x, "ipv6Only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6OnlyUndefined: Self = StObject.set(x, "ipv6Only", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setReadableAll(value: Boolean): Self = StObject.set(x, "readableAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableAllUndefined: Self = StObject.set(x, "readableAll", js.undefined)
    
    @scala.inline
    def setWritableAll(value: Boolean): Self = StObject.set(x, "writableAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableAllUndefined: Self = StObject.set(x, "writableAll", js.undefined)
  }
}

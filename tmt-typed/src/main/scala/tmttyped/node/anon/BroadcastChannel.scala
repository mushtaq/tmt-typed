package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastChannel extends StObject {
  
  var BroadcastChannel: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var onmessage: Any
}
object BroadcastChannel {
  
  inline def apply(
    BroadcastChannel: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    onmessage: Any
  ): BroadcastChannel = {
    val __obj = js.Dynamic.literal(BroadcastChannel = BroadcastChannel.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannel]
  }
  
  extension [Self <: BroadcastChannel](x: Self) {
    
    inline def setBroadcastChannel(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "BroadcastChannel", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}

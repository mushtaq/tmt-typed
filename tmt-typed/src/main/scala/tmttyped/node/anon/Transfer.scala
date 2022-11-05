package tmttyped.node.anon

import tmttyped.node.globalsMod.ReadonlyArray
import tmttyped.node.workerThreadsMod.TransferListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transfer extends StObject {
  
  var transfer: ReadonlyArray[TransferListItem]
}
object Transfer {
  
  inline def apply(transfer: ReadonlyArray[TransferListItem]): Transfer = {
    val __obj = js.Dynamic.literal(transfer = transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transfer]
  }
  
  extension [Self <: Transfer](x: Self) {
    
    inline def setTransfer(value: ReadonlyArray[TransferListItem]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
  }
}

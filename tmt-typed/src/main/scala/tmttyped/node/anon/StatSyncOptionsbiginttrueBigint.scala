package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :true} */
trait StatSyncOptionsbiginttrueBigint extends StObject {
  
  var bigint: js.UndefOr[Boolean] & `true`
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatSyncOptionsbiginttrueBigint {
  
  inline def apply(bigint: js.UndefOr[Boolean] & `true`): StatSyncOptionsbiginttrueBigint = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbiginttrueBigint]
  }
  
  extension [Self <: StatSyncOptionsbiginttrueBigint](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

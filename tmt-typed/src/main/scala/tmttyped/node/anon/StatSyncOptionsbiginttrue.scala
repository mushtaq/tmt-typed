package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import tmttyped.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :true,   throwIfNoEntry :false} */
trait StatSyncOptionsbiginttrue extends StObject {
  
  var bigint: js.UndefOr[Boolean] with `true`
  
  var throwIfNoEntry: js.UndefOr[Boolean] with `false`
}
object StatSyncOptionsbiginttrue {
  
  @scala.inline
  def apply(bigint: js.UndefOr[Boolean] with `true`, throwIfNoEntry: js.UndefOr[Boolean] with `false`): StatSyncOptionsbiginttrue = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbiginttrue]
  }
  
  @scala.inline
  implicit class StatSyncOptionsbiginttrueMutableBuilder[Self <: StatSyncOptionsbiginttrue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: js.UndefOr[Boolean] with `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

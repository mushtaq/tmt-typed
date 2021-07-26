package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.StatOptions & {  bigint :true} */
trait StatOptionsbiginttrue extends StObject {
  
  var bigint: js.UndefOr[Boolean] with `true`
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatOptionsbiginttrue {
  
  @scala.inline
  def apply(bigint: js.UndefOr[Boolean] with `true`): StatOptionsbiginttrue = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptionsbiginttrue]
  }
  
  @scala.inline
  implicit class StatOptionsbiginttrueMutableBuilder[Self <: StatOptionsbiginttrue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

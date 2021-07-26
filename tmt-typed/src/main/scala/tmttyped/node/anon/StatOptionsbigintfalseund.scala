package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.StatOptions & {  bigint :false | undefined} */
trait StatOptionsbigintfalseund extends StObject {
  
  var bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatOptionsbigintfalseund {
  
  @scala.inline
  def apply(bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]): StatOptionsbigintfalseund = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptionsbigintfalseund]
  }
  
  @scala.inline
  implicit class StatOptionsbigintfalseundMutableBuilder[Self <: StatOptionsbigintfalseund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

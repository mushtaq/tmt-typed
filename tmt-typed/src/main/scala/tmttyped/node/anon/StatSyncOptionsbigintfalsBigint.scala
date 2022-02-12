package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :false | undefined} */
trait StatSyncOptionsbigintfalsBigint extends StObject {
  
  var bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatSyncOptionsbigintfalsBigint {
  
  @scala.inline
  def apply(bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]): StatSyncOptionsbigintfalsBigint = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbigintfalsBigint]
  }
  
  @scala.inline
  implicit class StatSyncOptionsbigintfalsBigintMutableBuilder[Self <: StatSyncOptionsbigintfalsBigint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}

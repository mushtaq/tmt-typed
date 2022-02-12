package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatSyncOptions & {  bigint :false | undefined,   throwIfNoEntry :false} */
trait StatSyncOptionsbigintfals extends StObject {
  
  var bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]
  
  var throwIfNoEntry: js.UndefOr[Boolean] with `false`
}
object StatSyncOptionsbigintfals {
  
  @scala.inline
  def apply(
    bigint: js.UndefOr[Boolean] with js.UndefOr[`false`],
    throwIfNoEntry: js.UndefOr[Boolean] with `false`
  ): StatSyncOptionsbigintfals = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSyncOptionsbigintfals]
  }
  
  @scala.inline
  implicit class StatSyncOptionsbigintfalsMutableBuilder[Self <: StatSyncOptionsbigintfals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: js.UndefOr[Boolean] with `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

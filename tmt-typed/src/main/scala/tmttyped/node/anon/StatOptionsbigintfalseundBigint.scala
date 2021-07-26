package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatOptions & {  bigint :false | undefined,   throwIfNoEntry :false} */
trait StatOptionsbigintfalseundBigint extends StObject {
  
  var bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]
  
  var throwIfNoEntry: js.UndefOr[Boolean] with `false`
}
object StatOptionsbigintfalseundBigint {
  
  @scala.inline
  def apply(
    bigint: js.UndefOr[Boolean] with js.UndefOr[`false`],
    throwIfNoEntry: js.UndefOr[Boolean] with `false`
  ): StatOptionsbigintfalseundBigint = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptionsbigintfalseundBigint]
  }
  
  @scala.inline
  implicit class StatOptionsbigintfalseundBigintMutableBuilder[Self <: StatOptionsbigintfalseundBigint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: js.UndefOr[Boolean] with `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

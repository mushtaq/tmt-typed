package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.StatOptions & {  bigint :boolean,   throwIfNoEntry :false | undefined} */
trait StatOptionsbigintbooleant extends StObject {
  
  var bigint: js.UndefOr[Boolean] with Boolean
  
  var throwIfNoEntry: js.UndefOr[Boolean] with js.UndefOr[`false`]
}
object StatOptionsbigintbooleant {
  
  @scala.inline
  def apply(
    bigint: js.UndefOr[Boolean] with Boolean,
    throwIfNoEntry: js.UndefOr[Boolean] with js.UndefOr[`false`]
  ): StatOptionsbigintbooleant = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any], throwIfNoEntry = throwIfNoEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptionsbigintbooleant]
  }
  
  @scala.inline
  implicit class StatOptionsbigintbooleantMutableBuilder[Self <: StatOptionsbigintbooleant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowIfNoEntry(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
  }
}

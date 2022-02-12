package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.WatchFileOptions & {  bigint :false | undefined} */
trait WatchFileOptionsbigintfal extends StObject {
  
  var bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object WatchFileOptionsbigintfal {
  
  @scala.inline
  def apply(bigint: js.UndefOr[Boolean] with js.UndefOr[`false`]): WatchFileOptionsbigintfal = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchFileOptionsbigintfal]
  }
  
  @scala.inline
  implicit class WatchFileOptionsbigintfalMutableBuilder[Self <: WatchFileOptionsbigintfal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}

package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignPrivateKeyInput
  extends PrivateKeyInput
     with SigningOptions
object SignPrivateKeyInput {
  
  @scala.inline
  def apply(key: String | Buffer): SignPrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPrivateKeyInput]
  }
}

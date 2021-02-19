package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.nodeStreamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Hmac")
@js.native
class Hmac protected () extends Transform {
  
  def digest(): Buffer = js.native
  def digest(encoding: BinaryToTextEncoding): String = js.native
  
  def update(data: String, input_encoding: Encoding): Hmac = js.native
  def update(data: BinaryLike): Hmac = js.native
}

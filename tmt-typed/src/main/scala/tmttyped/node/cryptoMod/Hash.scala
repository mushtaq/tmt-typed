package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.nodeStreamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Hash")
@js.native
class Hash protected () extends Transform {
  
  def copy(): Hash = js.native
  
  def digest(): Buffer = js.native
  def digest(encoding: BinaryToTextEncoding): String = js.native
  
  def update(data: String, input_encoding: Encoding): Hash = js.native
  def update(data: BinaryLike): Hash = js.native
}
